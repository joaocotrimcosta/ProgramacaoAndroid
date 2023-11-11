package com.jotap.movefromatob

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
@Preview(showBackground = true, widthDp = 380, heightDp = 800)

fun PaginaC(navController: NavHostController = rememberNavController(),
            Pagina : String? = "" ): Unit {
    Column {
        Text(text = "Sou a Página C Vim da Página ${Pagina}")
        Button(onClick = {
            navController.navigate("PaginaA")
        })
        {
            Text(text = "Ir para a Pág A")
        }
        Button(onClick = {
            navController.navigate("PaginaB")
        })
        {
            Text(text = "Ir para a Pág B")
        }

    }
}