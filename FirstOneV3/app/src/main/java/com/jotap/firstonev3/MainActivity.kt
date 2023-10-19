package com.jotap.firstonev3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jotap.firstonev3.ui.theme.FirstOneV3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstOneV3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row {
        Column{
            Text(
                text = "João Costa",
                color = Color.Blue,
                //modifier = modifier
            )
            Text(
                text = "19.10.2023",
                color = Color.DarkGray,
                //modifier = modifier
            )

        }
        Image(painter = painterResource(id = R.drawable.eu_52_transparente), contentDescription = "Bad Model", modifier=Modifier.size(48.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstOneV3Theme {
        Greeting("Android")
    }
}