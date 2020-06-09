import Vue from  'vue'
import VueRouter from 'vue-router'
import Home from 'components/Home.vue'
import Football from 'components/Football.vue'
import SeriaA from 'components/SeriaA.vue'
import LaLiga from 'components/LaLiga.vue'
import EnglishPremierLeague from 'components/EnglishPremierLeague.vue'
import Player from 'components/Player.vue'

Vue.use(VueRouter)

const routes = [
    {path: '/', component : Home},
    {path: '/football', name: "football",component : Football},
    {path: '/SeriaA',name: "SeriaA", component : SeriaA},
    {path: '/LaLiga',name: "LaLiga", component : LaLiga},
    {path: '/EnglishPremierLeague',name: "EnglishPremierLeague", component : EnglishPremierLeague},
    {path: '/SeriaA/:{player}', component : SeriaA,
    children:[{ path: '{player}', component: Player}]},
    {path: '/LaLiga/:{player}', component : LaLiga,
        children:[{ path: '{player}', component: Player}]},
    {path: '/EnglishPremierLeague/:{player}', component : EnglishPremierLeague,
        children:[{ path: '{player}', component: Player}]},
    {path: '/{player}',name: "{player}", component : Player},
    {path: '*', component: Home}

]
const router =  new VueRouter({
    mode: 'history',
    routes,

})


export default new VueRouter({
    mode:'history',
    routes
})

