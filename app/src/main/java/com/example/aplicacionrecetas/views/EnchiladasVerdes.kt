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
fun EnchiladasVerdes(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Enchiladas Verdes")
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
                painter = painterResource(id = R.drawable.enchiladas_verdes),
                contentDescription = "Enchiladas Verdes",
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
                - 12 tortillas de maíz
                - 2 pechugas de pollo deshebradas
                - 500 g de tomates verdes
                - 2 chiles serranos
                - 1/4 de cebolla
                - 1 diente de ajo
                - 1/2 taza de cilantro fresco
                - 1 taza de crema ácida
                - 1 taza de queso fresco rallado
                - 1/2 taza de caldo de pollo
                - 2 cucharadas de aceite vegetal
                - Sal al gusto
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
                1. Hierve los tomates verdes junto con los chiles serranos en agua hasta que estén suaves.
                2. Licúa los tomates, chiles, cebolla, ajo, cilantro y caldo de pollo hasta obtener una salsa homogénea.
                3. En un sartén, calienta el aceite y sofríe la salsa verde durante 5 minutos. Agrega sal al gusto y deja cocinar.
                4. Calienta las tortillas en un comal o sartén para que sean más flexibles.
                5. Rellena cada tortilla con pollo deshebrado y enróllalas formando las enchiladas.
                6. Coloca las enchiladas en un plato y báñalas con la salsa verde caliente.
                7. Agrega crema, queso fresco rallado y cilantro al gusto.
                8. Sirve inmediatamente y disfruta de unas deliciosas enchiladas verdes.
                """.trimIndent(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}