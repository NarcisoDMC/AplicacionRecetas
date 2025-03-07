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
fun TamalesOaxaquenos(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Tamales Oaxaqueños")
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
                painter = painterResource(id = R.drawable.tamales_oaxaquenos),
                contentDescription = "Tamales Oaxaqueños",
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
                - 1 kg de masa para tamales
                - 300 g de carne de cerdo deshebrada
                - 2 hojas de aguacate
                - 4 chiles guajillos
                - 2 dientes de ajo
                - 1/2 cebolla
                - 1/2 cucharadita de comino
                - 1/2 cucharadita de orégano
                - 1/4 taza de manteca derretida
                - Sal al gusto
                - Hojas de maíz para envolver los tamales
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
                1. Limpia las hojas de maíz, remójalas en agua caliente y déjalas reposar.
                2. Asa los chiles guajillos en un sartén caliente, quítales las semillas y colócalos en agua caliente por unos minutos para ablandarlos.
                3. Licúa los chiles con los dientes de ajo, la cebolla, el comino, orégano y sal al gusto.
                4. En un sartén, agrega un poco de aceite y sofríe la carne deshebrada con la salsa que preparaste.
                5. Cocina la carne por 15 minutos, removiendo ocasionalmente, hasta que esté bien integrada con la salsa.
                6. En un recipiente grande, mezcla la masa para tamales con la manteca derretida y sal al gusto, hasta que tenga una consistencia suave.
                7. Agrega el caldo de la carne poco a poco a la masa hasta lograr una consistencia suave pero que se pueda manejar.
                8. Coloca un poco de masa en cada hoja de maíz, agrega un poco de la carne deshebrada con salsa y cierra el tamal.
                9. Cocina los tamales al vapor en una olla de vapor durante 1.5 a 2 horas, o hasta que la masa se despegue de las hojas.
                10. Deja enfriar un poco y disfruta tus tamales oaxaqueños con una salsa roja o verde al gusto.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}