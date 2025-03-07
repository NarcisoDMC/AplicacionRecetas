package com.example.aplicacionrecetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.aplicacionrecetas.R
import com.example.aplicacionrecetas.components.CardText

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {Text(text = "Lista de recetas",
                    color= Color.White)},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(255, 161, 67)
                )
            )
        }
    ){
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 94.dp, start = 16.dp, end = 16.dp, bottom = 16.dp), // Añadir espacio en la parte superior
        verticalArrangement = Arrangement.spacedBy(16.dp), // Agrega espacio entre los elementos
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            CardText(
                name = "Tacos de pollo a la malinche",
                img = R.drawable.tacos_a_la_malinche,
                onClick = {
                    navController.navigate("TacosMalinche")
                }
            )
        }

        item {
            CardText(
                name = "Tacos al pastor",
                img = R.drawable.tacos_al_pastor,
                onClick = {
                    navController.navigate("TacosPastor")
                }
            )
        }

        item {
            CardText(
                name = "Enchiladas verdes",
                img = R.drawable.enchiladas_verdes,
                onClick = {
                    navController.navigate("EnchiladasVerdes")
                }
            )
        }

        item {
            CardText(
                name = "Chiles en nogada",
                img = R.drawable.chiles_en_nogada,
                onClick = {
                    navController.navigate("ChilesNogada")
                }
            )
        }

        item {
            CardText(
                name = "Pozole rojo",
                img = R.drawable.pozole_rojo,
                onClick = {
                    navController.navigate("PozoleRojo")
                }
            )
        }

        item {
            CardText(
                name = "Tamales oaxaqueños",
                img = R.drawable.tamales_oaxaquenos,
                onClick = {
                    navController.navigate("TamalesOaxaquenos")
                }
            )
        }
    }
}