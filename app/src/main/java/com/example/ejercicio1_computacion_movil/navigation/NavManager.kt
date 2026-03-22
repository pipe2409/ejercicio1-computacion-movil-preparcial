package com.example.ejercicio1_computacion_movil.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.ejercicio1_computacion_movil.navigation.Screen
import com.example.ejercicio1_computacion_movil.ui.screens.MainScreen

@Composable
fun NavManager() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(Screen.Main.route) {
            MainScreen(navController)
        }

    }

    }