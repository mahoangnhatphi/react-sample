const actions = {
    
    getAllAirplanes() {
        return {
            type: GET_ALL_PASSENGERS,
        }
    },

    receivePassengers(passengers) {
        return {
            type: RECEIVE_PASSENGERS,
            payload: passengers,
        }
    }
};

export const GET_ALL_PASSENGERS = 'GET_ALL_PASSENGERS';
export const RECEIVE_PASSENGERS = 'RECEIVE_PASSENGERS';


export default actions;