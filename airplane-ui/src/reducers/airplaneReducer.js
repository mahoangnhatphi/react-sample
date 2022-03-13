import actions, { RECEIVE_PASSENGERS } from "../actions";

const initState = {
  passengers: undefined,
}

export default function airplaneReducer(state = initState, action) {
    console.log('Run airplaneReducer', action);
    switch (action.type) {
      case RECEIVE_PASSENGERS:
        console.log('Set passengers', action.payload);
        return {
          ...state,
          passengers: action.payload
        }
      default:
        return state
    }
}