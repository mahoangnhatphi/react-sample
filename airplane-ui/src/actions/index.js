const actions = {
    
    getAllProducts() {
        return {
            type: GET_ALL_PRODUCTS,
        }
    },

    receiveProducts(products) {
        return {
            type: RECEIVE_PRODUCTS,
            payload: products,
        }
    }
};

export const GET_ALL_PRODUCTS = 'GET_ALL_PRODUCTS';
export const RECEIVE_PRODUCTS = 'RECEIVE_PRODUCTS';


export default actions;