package com.example.aplicacionrecetas.views

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
import com.example.aplicacionrecetas.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TacosPastor(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Tacos al pastor")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(255,64,0)),
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
                painter = painterResource(id = R.drawable.tacos_al_pastor),
                contentDescription = "Tacos al pastor",
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
                - 1 kg de carne de cerdo en filetes delgados
                - 3 chiles guajillo desvenados y remojados
                - 2 chiles anchos desvenados y remojados
                - 1/2 taza de jugo de piña
                - 2 cucharadas de vinagre blanco
                - 2 dientes de ajo picados
                - 1 cucharadita de comino en polvo
                - 1 cucharadita de orégano seco
                - 1/2 cucharadita de pimienta negra
                - 1/2 cucharadita de sal
                - 1/4 de taza de achiote en pasta
                - 8 tortillas de maíz
                - 1/2 taza de piña picada en cubos
                - 1/2 cebolla picada
                - 1/4 de taza de cilantro picado
                - Limones al gusto
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
                1. En una licuadora, mezcla los chiles guajillo y ancho, el jugo de piña, el vinagre, el ajo, el comino, el orégano, la pimienta, la sal y el achiote hasta obtener una salsa homogénea.
                2. Marina la carne de cerdo en la salsa durante al menos 2 horas (preferiblemente toda la noche en el refrigerador).
                3. Cocina la carne marinada en un sartén o parrilla a fuego medio-alto hasta que esté bien cocida y ligeramente dorada.
                4. Corta la carne en tiras finas y resérvala.
                5. Calienta las tortillas de maíz en un comal hasta que estén flexibles.
                6. Rellena cada tortilla con la carne al pastor y añade piña picada por encima.
                7. Decora con cebolla y cilantro picado.
                8. Sirve con limones y salsa al gusto.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}