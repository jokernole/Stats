<template>
    <v-app>
        <v-card
                class="mx-auto my-7"
                max-width="95%"
        >
            <v-toolbar-title class="text-center">
                <h1>Список матчей</h1>
            </v-toolbar-title>

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
                <tr v-for="player in football" :key="playerone">
                    <td class="text-center">{{ tournament }}</td>
                    <td class="text-center">{{ gamedate }}</td>
                    <td class="text-center">{{ playerone }}</td>
                    <td class="text-center">{{ playertwo }}</td>
                    <td class="text-center">{{ goalsone }} : {{ goalstwo }}</td>

                </tr>
                </tbody>
            </template>
        </v-simple-table>
        </v-card>
    </v-app>
</template>

<script>
    import Vue from "vue";
    import router from "../router/router";

    export default {
        data() {
            return {
                football: [],
            }
        },


    }


</script>

<style>

</style>