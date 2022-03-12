import { api } from "../services"
import { take, put, call, fork, select, takeEvery, all } from 'redux-saga/effects';
import actions from "../actions";

export function* getAllProducts() {
    const products = yield call(api.getProducts)
    console.log('products', products);
    yield put(actions.receiveProducts(products))
}

export function* watchGetProducts() {
    console.log('Run watchGetProducts');
    yield takeEvery('GET_ALL_PRODUCTS', getAllProducts)
}


export default function* root() {
    yield all([fork(watchGetProducts)])
}