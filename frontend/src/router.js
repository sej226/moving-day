
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MovingManager from "./components/movingManager"

import PaymentManager from "./components/paymentManager"

import MoverManager from "./components/moverManager"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/moving',
                name: 'movingManager',
                component: movingManager
            },

            {
                path: '/payment',
                name: 'paymentManager',
                component: paymentManager
            },

            {
                path: '/mover',
                name: 'moverManager',
                component: moverManager
            },




    ]
})
