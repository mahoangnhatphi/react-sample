/**
 * Mocking client-server processing
 */
 import axios from 'axios'
import _products from './products'

 const TIMEOUT = 100
 
 export const api = {
   getProducts() {
     return new Promise(resolve => {
       setTimeout(() => resolve(_products), TIMEOUT)
     })
   },

   async getPassengers() {
     const result = await axios.get(`http://localhost:8080/passengers`);
     return result.data;
   }
 }
 