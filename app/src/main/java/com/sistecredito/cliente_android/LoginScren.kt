package com.sistecredito.cliente_android.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sistecredito.cliente_android.R

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    )
    {

        Text(
            text = "Cliente publicador Android",
            fontSize = 28.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(400.dp),
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = { Log.i("On", "On")},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
            shape = RoundedCornerShape(50),
        )
        {
            Text(

                text = "ON",
                fontSize = 30.sp,
                color = Color.White
            )
        }
        Button(
            onClick = { Log.i("OFF", "OFF")},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
            shape = RoundedCornerShape(50)
        ) {
            Text(
                text = "OFF",
                fontSize = 30.sp,
                color = Color.White
            )
        }
        Image(
            painter = painterResource(id = R.drawable.logoazul),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )

    }
}