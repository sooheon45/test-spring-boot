
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import ShipManager from "./components/listers/ShipCards"
import ShipDetail from "./components/listers/ShipDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/ships',
                name: 'ShipManager',
                component: ShipManager
            },
            {
                path: '/ships/:id',
                name: 'ShipDetail',
                component: ShipDetail
            },



    ]
})
