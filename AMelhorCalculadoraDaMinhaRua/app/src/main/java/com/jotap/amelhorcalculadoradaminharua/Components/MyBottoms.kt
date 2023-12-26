package com.jotap.amelhorcalculadoradaminharua.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun RegularBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
            .height(70.dp)
            .width(68.dp)
            .background(
                color = myColor1,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 22.sp,
        )
    }
}
@Composable

fun BigBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
        .height(75.dp)
        .width(78.dp)
        .background(
            color = myColor1,
            shape = RoundedCornerShape(16.dp)
        )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
        )
    }
}
@Composable
fun BigEqualBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = {  onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
            .height(75.dp)
            .width(145.dp)
            .background(
                color = myColor1,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 22.sp,
        )
    }
}