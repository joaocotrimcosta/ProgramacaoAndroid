package com.jotap.amelhorcalculadoradaminharua

import CalculatorLayout
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jotap.amelhorcalculadoradaminharua.ui.theme.AMelhorCalculadoraDaMinhaRuaTheme
import com.jotap.amelhorcalculadoradaminharua.ui.theme.MyBlue3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AMelhorCalculadoraDaMinhaRuaTheme {
                val viewModel = viewModel<MyViewModel>()
                val estadoAtual = viewModel.estadoAtual
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MyBlue3
                ) {
                    CalculatorLayout(estadoAtual)
                }
            }
        }
    }
}
/*
@Preview
@Composable
fun Base() {
    CalculatorLayout()
}

*/

