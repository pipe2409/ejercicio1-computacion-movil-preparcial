package com.example.ejercicio1_computacion_movil.ui.components

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ButtonsRow(navController: NavController) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Button(
            onClick = { }
        ) {
            Text("Página web")
        }

        Button(
            onClick = {

            }
        ) {
            Text("Pantalla 2")
        }
    }
}