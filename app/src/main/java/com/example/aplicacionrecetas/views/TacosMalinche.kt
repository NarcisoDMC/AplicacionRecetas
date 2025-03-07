package com.example.aplicacionrecetas.views

import com.example.aplicacionrecetas.R
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplicacionrecetas.components.MainButton
import com.example.aplicacionrecetas.components.MainIconButton
import com.example.aplicacionrecetas.components.Spacers
import com.example.aplicacionrecetas.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TacosMalinche(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Tacos a la Malinche")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(255,122,89)),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacers()
            Spacers()
            Image(
                painter = painterResource(id = R.drawable.tacos_a_la_malinche),
                contentDescription = "Tacos de pollo a la malinche",
                modifier = Modifier.size(329.dp).clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "Lista de ingredientes necesarios:",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacers()

            Text(
                text = """
                - 2 pechugas de pollo desmenuzadas
                - 8 tortillas de maíz
                - 1/2 cebolla picada
                - 1 diente de ajo picado
                - 1 tomate picado
                - 1 chile guajillo hidratado y molido
                - 1/2 taza de crema ácida
                - 1/2 taza de queso rallado (queso fresco o manchego)
                - 1/4 de taza de cilantro picado
                - 2 cucharadas de aceite vegetal
                - Sal y pimienta al gusto
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Spacers()

            Text(
                text = "Pasos a seguir para hacer la receta: ",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacers()

            Text(
                text = """
                1. En un sartén, calienta el aceite a fuego medio y sofríe la cebolla y el ajo hasta que estén dorados.
                2. Agrega el tomate picado y el chile guajillo molido. Cocina por 3 minutos hasta que los sabores se integren.
                3. Incorpora el pollo desmenuzado, sazona con sal y pimienta, y mezcla bien con los ingredientes en el sartén.
                4. Calienta las tortillas de maíz en un comal o sartén hasta que estén suaves y manejables.
                5. Rellena cada tortilla con la mezcla de pollo y dóblalas para formar los tacos.
                6. Sirve los tacos en un plato y agrega crema ácida, queso rallado y cilantro picado por encima.
                7. Acompaña con salsa de tu preferencia y disfruta de unos deliciosos Tacos a la Malinche.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}