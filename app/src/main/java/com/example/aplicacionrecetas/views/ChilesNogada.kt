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
import com.example.aplicacionrecetas.components.MainIconButton
import com.example.aplicacionrecetas.components.Spacers
import com.example.aplicacionrecetas.components.TitleBar
import com.example.aplicacionrecetas.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChilesNogada(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Chiles en Nogada")
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
                painter = painterResource(id = R.drawable.chiles_en_nogada),
                contentDescription = "Chiles en Nogada",
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
                - 1 taza de nuez de castilla pelada
                - 1 taza de crema
                - 1/2 taza de leche
                - 100 g de queso de cabra
                - 1 cucharada de azúcar
                - 1 pizca de sal
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
                1. Asa los chiles poblanos directamente sobre la flama o en un sartén hasta que la piel se queme ligeramente.
                2. Colócalos en una bolsa de plástico durante 10 minutos para que suden, luego pélalos y retira las semillas con cuidado.
                3. En un sartén con aceite caliente, sofríe la cebolla y el ajo hasta que estén dorados.
                4. Agrega la carne de res y cerdo, cocina hasta que cambie de color.
                5. Añade jitomate picado y cocina por unos minutos más.
                6. Incorpora el plátano, almendras, pasas, piñones, duraznos, peras y manzanas.
                7. Condimenta con sal, pimienta y canela; cocina a fuego lento por 10 minutos.
                8. Rellena los chiles con esta mezcla y colócalos en un plato.
                9. Para la nogada, licúa las nueces con la crema, leche, queso de cabra, azúcar y sal hasta obtener una salsa espesa.
                10. Baña los chiles con la nogada y decora con granada y perejil.
                11. Sirve frío o a temperatura ambiente y disfruta este platillo tradicional.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}