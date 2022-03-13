import logger from 'redux-logger';
import { applyMiddleware, createStore, compose, combineReducers } from 'redux';
import thunk from 'redux-thunk';
import airplaneReducer from './airplaneReducer';
import createSagaMiddleware from 'redux-saga'
import { watchGetAirplanes } from '../sagas';

const rootReducer = () => {
  return combineReducers({
    airplaneReducer
  });
}
const sagaMiddleware = createSagaMiddleware();
const store = createStore(rootReducer(),  compose(applyMiddleware(logger), applyMiddleware(thunk), applyMiddleware(sagaMiddleware)));
sagaMiddleware.run(watchGetAirplanes);

export default store;