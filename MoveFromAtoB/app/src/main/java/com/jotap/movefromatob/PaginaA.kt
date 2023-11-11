package com.jotap.movefromatob

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, widthDp = 380, heightDp = 800)

fun PaginaA(navController: NavHostController = rememberNavController()): Unit {
    var text by remember { mutableStateOf("Hello") }
    Column {
        Text(text = "Sou a Página A ${text}")
        Button(onClick = { navController.navigate("PaginaB") }) {
            Text(text = "Ir para a Pág B")
        }
        Button(onClick = {
            navController.navigate("PaginaC/A")
        })
        {
            Text(text = "Ir para a Pág C")
        }
        //////////////////////////////////////////
        TextField(value = text,
            onValueChange = {text = it },
            label = { Text(text = "Label") }
        )
        /*var text by remember { mutableStateOf("Hello") }

            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Label") }
            )
        }
        */
    }
}