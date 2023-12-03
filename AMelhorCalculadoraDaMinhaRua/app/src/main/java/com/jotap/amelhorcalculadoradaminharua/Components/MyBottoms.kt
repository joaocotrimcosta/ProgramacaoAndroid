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


@Composable

fun RegularBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
            .height(56.dp)
            .width(50.dp)
            //.weight(2f)
            .background(
                color = myColor1,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
    }
}
@Composable

fun BigBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
        .height(56.dp)
        .width(75.dp)
        .background(
            color = myColor1,
            shape = RoundedCornerShape(16.dp)
        )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
    }
}
@Composable
fun BigEqualBottom(text: String, myColor1: Color, onClick: (String) -> Unit) {
    Button(
        onClick = {  onClick(text) },
        colors = ButtonDefaults.buttonColors(myColor1),
        modifier = Modifier
            .height(56.dp)
            .width(150.dp)
            .background(
                color = myColor1,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
    }
}