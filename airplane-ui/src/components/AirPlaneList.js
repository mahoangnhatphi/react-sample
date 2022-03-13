import React, { Component } from 'react'
import { connect } from 'react-redux'
import actions from '../actions';

export class AirplaneList extends Component {

  componentDidMount() {
    const { getAllAirplanes } = this.props;
    getAllAirplanes();
  }

  static propTypes = {
  }

  renderPassengerList() {
    const { passengers } = this.props;
    console.log(passengers);
    if (passengers === undefined || passengers === null) {
      return <h2>Loading...</h2>
    }
    if (passengers.length === 0) {
      return <h2>No passengers</h2>
    }
    return (
      <table border="1">
        <thead>
          <tr>
          <th>No</th>
          <th>Passenger name</th>
          <th>Number of trips</th>
          <th>Airplane</th>
          </tr>
        </thead>
        <tbody>
          {passengers.map((value, index) => {
            return <tr>
              <td>{index + 1}</td>
              <td>{value.name}</td>
              <td>{value.trips}</td>
              <td>{value.airline.map((e) => `${e.name} (${e.country})`).join()}</td>
            </tr>
          })}
        </tbody>
      </table>
    );
  }

  render() {
    const { passengers } = this.props;
    console.log(passengers);
    return (
      <div>
        <h1>Airplane List</h1>
        {this.renderPassengerList()}
      </div>
    )
  }
}

const mapStateToProps = (state) => ({
  passengers: state.airplaneReducer.passengers,
})

const mapDispatchToProps = (dispatch) => ({
  getAllAirplanes: () => {
    dispatch(actions.getAllAirplanes())
  }
})

export default connect(mapStateToProps, mapDispatchToProps)(AirplaneList)