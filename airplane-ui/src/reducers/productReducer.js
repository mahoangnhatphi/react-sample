import actions, { RECEIVE_PRODUCTS } from "../actions";

const initState = {
    products: undefined,
}

export default function productReducer(state = initState, action) {
    console.log('Run productReducer', action);
    switch (action.type) {
      case RECEIVE_PRODUCTS:
        return {
          ...state,
          products: action.payload
        }
      default:
        return state
    }
}