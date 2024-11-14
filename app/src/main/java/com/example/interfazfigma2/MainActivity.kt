package com.example.interfazfigma2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfazfigma2.ui.theme.InterfazFigma2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfazFigma2Theme {
                MyInterface()
            }
        }
    }
}

@Preview
@Composable
fun MyInterface() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Titulo()
            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f)
                ) {
                    Florero()
                    Bosque()
                    Clase()
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f)
                ) {
                    OtroBosque()
                    Tulipanes()
                    Rugby()
                }
            }
        }
    }
}

@Composable
fun Titulo() {
    Box(
        modifier = Modifier
            .border(width = 3.dp, color = Color(0xFF354699))
            .width(305.dp)
            .height(93.dp)
            .background(color = Color(0xFFDFE4FF))
    ) {
        Text(
            text = "Mis Películas",
            fontSize = 47.sp,
            fontFamily = FontFamily.Serif,
            color = Color(0xFF354699),
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun Florero() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.florero),
            contentDescription = "Florero",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "El florero",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}

@Composable
fun Bosque() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bosque),
            contentDescription = "Bosque",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "Otro Bosque",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}

@Composable
fun Clase() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.clase),
            contentDescription = "clase",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "Clase",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}

@Composable
fun OtroBosque() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.el_bosque),
            contentDescription = "OtroBosque",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "El Bosque",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}

@Composable
fun Tulipanes() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.tulipanes),
            contentDescription = "tulipanes",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "Tulipanes",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}

@Composable
fun Rugby() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(200.dp)
            .height(215.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.onvretones),
            contentDescription = "Rugby",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(id = R.drawable.play),
            contentDescription = "Botón Play",
            modifier = Modifier
                .size(80.dp)
                .offset(x = 0.dp, y = -10.dp)
        )

        Text(
            text = "Rugby",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 0.dp)
        )
    }
}
