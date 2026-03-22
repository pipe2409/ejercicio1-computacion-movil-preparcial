package com.example.ejercicio1_computacion_movil.navigation

sealed class Screen(val route: String) {

    object Main : Screen("main")

}
