import React, { Component } from 'react'
import { connect } from 'react-redux'
import actions from '../actions';

export class UserList extends Component {
  
  componentDidMount() { 
    const { getAllProducts } = this.props;    
    getAllProducts();
  }

  static propTypes = {
  }

  render() {
    const { products } = this.props;
    console.log(products);
    return (
      <div>ProductList</div>
    )
  }
}

const mapStateToProps = (state) => ({
    products: state.productReducer.products
})

const mapDispatchToProps = (dispatch) => ({
    getAllProducts: () => {
        dispatch(actions.getAllProducts())
    }
})

export default connect(mapStateToProps, mapDispatchToProps)(UserList)