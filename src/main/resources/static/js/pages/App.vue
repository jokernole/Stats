<template>
    <div id="app">
    <v-app>
        <v-toolbar-title color="blue">
            <router-link to='/'>В начало</router-link></v-toolbar-title>
        <v-spacer></v-spacer>
        <v-content>

            <router-view></router-view>
        </v-content>

    </v-app>
    </div>
</template>

<script>
    import router from "../router/router";
    import Vue from "vue";

</script>
<style>
    a:link{
        color: darkslategray;
        text-decoration: none;
    }
    a:visited{
        color: coral;
        text-decoration: none;
    }
    .exit:hover{
        cursor: pointer;
    }

</style>