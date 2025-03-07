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
fun PozoleRojo(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Pozole Rojo")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(255, 122, 89)),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacers()
            Spacers()
            Image(
                painter = painterResource(id = R.drawable.pozole_rojo),
                contentDescription = "Pozole Rojo",
                modifier = Modifier
                    .size(329.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "Lista de ingredientes necesarios:",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacers()

            Text(
                text = """
                - 1 kg de maíz pozolero precocido
                - 1 kg de carne de cerdo (espinazo, pierna o lomo)
                - 1/2 cebolla
                - 3 dientes de ajo
                - 2 hojas de laurel
                - 2 litros de agua
                - Sal al gusto
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Spacers()

            Text(
                text = "Para el caldo rojo:",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = """
                - 4 chiles guajillo
                - 2 chiles anchos
                - 1 diente de ajo
                - 1/4 de cebolla
                - 1 cucharadita de orégano
                - Sal y pimienta al gusto
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Spacers()

            Text(
                text = "Para acompañar:",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = """
                - Lechuga finamente picada
                - Rábanos en rodajas
                - Cebolla picada
                - Orégano
                - Limones partidos
                - Tostadas
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
                1. En una olla grande, hierve el maíz pozolero en 2 litros de agua junto con la cebolla, ajos, laurel y sal. Cocina a fuego medio por 1 hora.
                2. Agrega la carne de cerdo y deja hervir hasta que esté bien cocida y suave (aproximadamente 1.5 horas más).
                3. Para la salsa, limpia los chiles guajillo y ancho, retirando las semillas y el rabo.
                4. Hierve los chiles en agua caliente por 5-7 minutos hasta que estén suaves.
                5. Licúa los chiles con ajo, cebolla, orégano, sal y un poco del caldo del pozole hasta obtener una salsa homogénea.
                6. Cuela la salsa y agrégala a la olla con el maíz y la carne. Cocina a fuego medio por 30 minutos más para que los sabores se mezclen.
                7. Rectifica la sal y retira del fuego.
                8. Sirve caliente en un tazón y acompaña con lechuga, rábanos, cebolla, orégano y limón al gusto.
                9. Disfruta con tostadas y una bebida refrescante.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}