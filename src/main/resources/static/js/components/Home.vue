<template>
    <v-app>
        <h3>Последняя футбольная статистика</h3>
        <p>На этом сайте можно узнать все о последних футбольных матчах, турнирных таблицах и статистике команд</p>
        <v-container class="orange lighten-3">
        <router-link :to="{ name: 'football'}">Начать!</router-link>
        </v-container>
            <v-content>
        <router-view></router-view>
        </v-content>
    </v-app>
</template>

<script>
    import Vue from "vue";

</script>

<style>
    h3{
        text-align: center;
    }


</style>