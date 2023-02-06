package com.sistecredito.cliente_android.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen()
{
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
          )
            {
                Text(text = "Cliente suscriptor android")
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                    shape = CutCornerShape(20)
                ) {
                    Text(text = "ON",
                        fontSize = 30.sp,
                        color = Color.White
                    )

                }
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                    shape = CutCornerShape(20)
                    ) {
                    Text(text = "OFF",
                        fontSize = 30.sp,
                        color = Color.White
                    )


                }

            }
}