package com.example.aplicacionrecetas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacionrecetas.views.TacosMalinche
import com.example.aplicacionrecetas.views.TacosPastor
import com.example.aplicacionrecetas.views.EnchiladasVerdes
import com.example.aplicacionrecetas.views.ChilesNogada
import com.example.aplicacionrecetas.views.PozoleRojo
import com.example.aplicacionrecetas.views.TamalesOaxaquenos
import com.example.aplicacionrecetas.views.HomeView

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home") {
            HomeView(navController)
        }
        composable("TacosMalinche") {
            TacosMalinche(navController)
        }
        composable("TacosPastor") {
            TacosPastor(navController)
        }
        composable("EnchiladasVerdes") {
            EnchiladasVerdes(navController)
        }
        composable("ChilesNogada") {
            ChilesNogada(navController)
        }
        composable("PozoleRojo") {
            PozoleRojo(navController)
        }
        composable("TamalesOaxaquenos") {
            TamalesOaxaquenos(navController)
        }
    }
}
