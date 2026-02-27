package com.christian.maquetacionbasicacf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource


@Composable
fun PantallaPerfil() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.elcf),
            contentDescription = "el cf posando",
            modifier = Modifier
                .padding(top = 16.dp)
                .size(120.dp)
                .clip(CircleShape)
        )

        // NOMBRE
        Text(
            text = "Christian Florez",
            fontSize = 22.sp,
            modifier = Modifier.padding(top = 12.dp)
        )

        // DESCRIPCIÓN
        Text(
            text = "Estudiante de ing de sistemas UNAB",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        // ESTADÍSTICAS
        Row(
            modifier = Modifier.padding(top = 16.dp)
        ) {

            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("150")
                Text("Posts", fontSize = 12.sp)
            }

            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("180")
                Text("Seguidores", fontSize = 12.sp)
            }

            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("980")
                Text("Likes", fontSize = 12.sp)
            }
        }


        Row(
            modifier = Modifier.padding(top = 16.dp)
        ) {

            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color(0xFF6A5ACD), CircleShape)
                    .padding(horizontal = 24.dp, vertical = 8.dp)
            ) {
                Text("Seguir", color = Color.White)
            }

            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.LightGray, CircleShape)
                    .padding(horizontal = 24.dp, vertical = 8.dp)
            ) {
                Text("Mensaje")
            }
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {

            Text(text = "Intereses")

            Row(modifier = Modifier.padding(top = 8.dp)) {

                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Gimnasio", fontSize = 12.sp)
                }

                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Baloncesto", fontSize = 12.sp)
                }

                Box(
                    modifier = Modifier
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("UI/UX", fontSize = 12.sp)
                }
            }

            Row(modifier = Modifier.padding(top = 8.dp)) {

                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Música", fontSize = 12.sp)
                }

                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Viajes", fontSize = 12.sp)
                }

                Box(
                    modifier = Modifier
                        .background(Color.LightGray, CircleShape)
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text("Gaming", fontSize = 12.sp)
                }
            }
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaPerfilPreview() {
    PantallaPerfil()
}