import logger from 'redux-logger';
import { applyMiddleware, createStore, compose, combineReducers } from 'redux';
import thunk from 'redux-thunk';
import productReducer from './productReducer';
import createSagaMiddleware from 'redux-saga'
import { watchGetProducts } from '../sagas';

const rootReducer = () => {
  return combineReducers({
    productReducer
  });
}
const sagaMiddleware = createSagaMiddleware();
const store = createStore(rootReducer(),  compose(applyMiddleware(logger), applyMiddleware(thunk), applyMiddleware(sagaMiddleware)));
sagaMiddleware.run(watchGetProducts);

export default store;