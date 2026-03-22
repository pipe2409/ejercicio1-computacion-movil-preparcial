package com.example.ejercicio1_computacion_movil.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
//Import para manejar recursos de imagenes
import com.example.ejercicio1_computacion_movil.R

@Composable
fun LogoComponent() {

    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "logo",
        modifier = Modifier.size(120.dp)
    )
}