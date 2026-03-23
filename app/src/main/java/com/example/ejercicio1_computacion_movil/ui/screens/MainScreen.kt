package com.example.ejercicio1_computacion_movil.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.ejercicio1_computacion_movil.ui.components.ButtonsRow
import com.example.ejercicio1_computacion_movil.ui.components.LevelDropdown
import com.example.ejercicio1_computacion_movil.ui.components.LogoComponent
import com.example.ejercicio1_computacion_movil.ui.components.NameTextField


@Composable
fun MainScreen(navController: NavController) {

    // Estado para el nombre del usuario
    var nombre by remember { mutableStateOf("") }
    var nivel by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Espacio entre la parte superior y el logo (Peso 1)
        Spacer(modifier = Modifier.weight(1f))

        // Logo
        LogoComponent()

        // Espacio entre el logo y los campos (Peso 1)
        Spacer(modifier = Modifier.weight(1f))

        // Contenedor central para los campos de entrada
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NameTextField(
                value = nombre,
                onValueChange = { nombre = it }
            )

            Spacer(modifier = Modifier.height(10.dp))

            LevelDropdown(
                selected = nivel,
                onSelectedChange = { nivel = it }
            )
        }

        // Espacio entre los campos y los botones (Peso 2)
        // Usamos peso 2 para que los campos se mantengan en el centro de la pantalla
        // (1 arriba + 1 entre logo/campos = 2 de peso total arriba de los campos)
        Spacer(modifier = Modifier.weight(2f))

        // Botones en la parte inferior
        ButtonsRow(navController)
    }
}
