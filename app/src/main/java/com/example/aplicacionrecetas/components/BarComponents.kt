package com.example.aplicacionrecetas.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.White)
}

@Composable
fun MainIconButton(icon: ImageVector, onClick:() -> Unit){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = Color.White)
    }
}

@Composable
fun ActionButton(color: Color){
    val context = LocalContext.current

    FloatingActionButton(
        onClick = { (context as? android.app.Activity)?.finish()},
        containerColor = color,
        contentColor = Color.Black
    ){
        Text("Salir")
    }
}