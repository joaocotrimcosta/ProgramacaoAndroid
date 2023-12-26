package com.jotap.calculadoratioabilio

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jotap.calculadoratioabilio.ui.theme.CalculadoraTioAbilioTheme


class MainActivity : AppCompatActivity() {

    private lateinit var displayTextView: TextView
    private var currentInput: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)
    }

    fun onButtonClick(view: View) {
        if (view is Button) {
            currentInput += view.text
            displayTextView.text = currentInput
        }
    }

    fun onCalculateClick(view: View) {
        try {
            val result = eval(currentInput)
            displayTextView.text = result.toString()
            currentInput = result.toString()
        } catch (e: Exception) {
            displayTextView.text = "Error"
            currentInput = ""
        }
    }

    private fun eval(expression: String): Double {
        return expression.replace('×', '*').replace('÷', '/')
            .let { it.toDouble() }
    }
}
