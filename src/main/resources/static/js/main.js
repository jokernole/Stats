import Vue from 'vue'
import App from 'App.vue'
import router from "./router/router";
import VueResource from 'vue-resource'
import Vuetify from "vuetify";
import store from "./store/store";
import 'vuetify/dist/vuetify.min.css'
import '@babel/polyfill'
import vuetify from "./plugins/vuetify";


Vue.use(VueResource);

new Vue({
    el: "#app",
    router,
    vuetify,
    store,
    render: a => a(App)
})