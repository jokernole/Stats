<template>
    <v-container>
    <v-card class="elevation-12 pa-10" border="3px" >

        <v-toolbar-title>
           <h1>All Tournaments</h1>
            <router-link :to="{ name: 'SeriaA'}">Серия А</router-link>
            <v-spacer></v-spacer>
           <router-link :to="{ name: 'LaLiga'}">Ла Лига</router-link>
            <v-spacer></v-spacer>
            <router-link :to="{ name: 'EnglishPremierLeague'}">Английская Премьер-Лига</router-link>
        </v-toolbar-title>
        <v-spacer></v-spacer>
        <v-container>
                Хотите вернуться?
            <router-link to='/'> Back</router-link>
        </v-container>

        <v-content>

            <router-view></router-view>
        </v-content>


    </v-card>
    </v-container>
</template>

<script>
    import Vue from "vue";
    import router from "../router/router";

    export default {
        data () {

            }}

</script>

<style>

</style>