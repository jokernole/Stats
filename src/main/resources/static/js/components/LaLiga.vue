<template>
<v-app>
    <v-card
            class="mx-auto my-7"

    >
        <v-toolbar-title class="text-center">
            <h3>Список матчей</h3>
        </v-toolbar-title>
    </v-card>
    <v-simple-table>
        <template slot=default>
            <thead>
            <tr>
                <th class="text-center ">Турнир</th>
                <th class="text-center">Тур</th>
                <th class="text-center">Команда</th>
                <th class="text-center">Соперник</th>
                <th class="text-center">Счет</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="item in tournament" :key="item.tournament">
                <td class="text-center ">{{ LaLiga.tournament }}</td>
                <td class="text-center ">{{ item.tour }}</td>
                <td class="text-center ">{{ item.playerone }}</td>
                <td class="text-center ">{{ item.playertwo }}</td>
                <td class="text-center ">{{ item.goalsone }}:{{ item.goalstwo }}</td>
            </tr>
            </tbody>
        </template>
    </v-simple-table>

</v-app>
</template>

<script>
    import {mapGetters} from 'vuex'
    export default {
        computed:mapGetters(['getTournament']),
        data(){
            return{
                tournament: [],
            }
        }}



</script>
