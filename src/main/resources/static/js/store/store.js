import Vue from 'vue'
import Vuex from 'vuex'
import VueResource from "vue-resource"

Vue.use(VueResource);
Vue.use(Vuex);

export default new Vuex.Store({
    state:{

        allFootball: [],
        playerone: "",
        playertwo: "",
        tournament: "",
        tour: "",
        goalsone: "",
        goalstwo: ""
    },
    getters:{
          getFootball: state => state.allFootball,
        getTournament(state){
            return state.tournament},
        getPlayerone(state){
            return state.playerone},
        getPlayertwo(state){
            return state. playertwo},

    },
    actions:{
        async getFootballAction({commit}) {

            const result = await Vue.http.get('/main/allFootball')
            const data = result.body;
            data.forEach(allFootball => commit('addFootballMutation', allFootball))
        } ,
        async getTournamentAction({commit}) {

            const result = await Vue.http.get('/api/tournament')
            const data = result.body;
            data.forEach(tournament => commit('setTournamentMutation', tournament))
        } },
    mutations: {
        addFootballMutation(state, allFootball) {
            state.allFootball =
                [...state.allFootball, allFootball]

        },
        setTournamentMutation(state, tournament) {
            state.tournament = tournament;
            localStorage.setItem('tournament', tournament)

        },
        setPlayeroneMutation(state, playerone) {
            state.playerone = playerone;
            localStorage.setItem('playerone', playerone)
        },
        setPlayertwoMutation(state, playertwo) {
            state.playertwo = playertwo;
            localStorage.setItem('playertwo', playertwo)
        },
        setGoalsMutation(state, goalsone, goalstwo) {
            state.goalsone = goalsone;
            localStorage.setItem('goalsone', goalsone)
            state.goalstwo = goalstwo;
            localStorage.setItem('goalstwo', goalstwo)
        }}




})