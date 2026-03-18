package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GreetingApp()
        }
    }
}

@Composable
fun GreetingApp() {

    var name by remember { mutableStateOf("") }
    var greeting by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(20.dp)
    ) {

        Text(
            text = "Greeting App",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Enter your name") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            greeting = "Hello $name!"
        }) {
            Text("Greet Me")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = greeting)
    }
}