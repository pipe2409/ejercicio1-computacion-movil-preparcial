package com.example.ejercicio1_computacion_movil.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        LogoComponent()

        Spacer(modifier = Modifier.height(20.dp))

        NameTextField(
            value = nombre,
            onValueChange = { nombre = it }
        )

        Spacer(modifier = Modifier.height(10.dp))

        LevelDropdown(selected =  nivel,
            onSelectedChange = { nivel= it })

        Spacer(modifier = Modifier.height(40.dp))

        ButtonsRow(navController)

    }
}