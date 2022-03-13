import { api } from "../services"
import { take, put, call, fork, select, takeEvery, all } from 'redux-saga/effects';
import actions, { GET_ALL_PASSENGERS } from "../actions";

export function* getAllPassengers() {
    const passengers = yield call(api.getPassengers);
    console.table(passengers);
    yield put(actions.receivePassengers(passengers))
}

export function* watchGetAirplanes() {
    console.log('Run watchGetAirplanes');
    yield takeEvery(GET_ALL_PASSENGERS, getAllPassengers)
}