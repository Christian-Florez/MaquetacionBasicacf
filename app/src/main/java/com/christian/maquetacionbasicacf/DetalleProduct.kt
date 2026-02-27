package com.christian.maquetacionbasicacf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetalleProducto() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(id = R.drawable.pcdecf),
            contentDescription = "Producto",
            modifier = Modifier
                .size(250.dp)
                .padding(16.dp)
        )


        Text(
            text = "Computadora de CF",
            fontSize = 22.sp,
            modifier = Modifier.padding(top = 8.dp)
        )


        Text(
            text = "$99.99",
            fontSize = 28.sp,
            color = Color(0xFF00C853),
            modifier = Modifier.padding(top = 4.dp)
        )


        Text(
            text = "Descripción del producto con detalles importantes, características y beneficios.",
            modifier = Modifier.padding(top = 8.dp)
        )


        Row(
            modifier = Modifier.padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Editar",
                color = Color.White,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Magenta)
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            )

            Text(
                text = "Eliminar",
                color = Color.White,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Red)
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DetalleProductoPreview() {
    DetalleProducto()
}