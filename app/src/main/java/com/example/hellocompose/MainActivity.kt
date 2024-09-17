package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InputText()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputText() {
    var name by remember { mutableStateOf("Compose") }
    OutlinedTextField(
        value = name,
        onValueChange = {name = it},
        label = { Text("Name")}
    )
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    InputText()
}
