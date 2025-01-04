package com.example.androidstudioproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidstudioproject.ui.theme.AndroidStudioProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioProjectTheme {
                ImageCard(
                    Text1 = "Jetpack Compose tutorial",
                    Text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                    Text3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                )
            }
        }
    }
}

@Composable
fun ImageCard(Text1: String, Text2: String, Text3: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background___android_) // Replace with your drawable resource
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        // Display the image
        Image(
            painter = image,
            contentDescription = null,

            modifier = Modifier
                .fillMaxWidth() // Make the image fill the width
               // Set the height of the image
        )
        // Display the text directly below the image
        Texts(
            Text1 = Text1  ,
            Text2 = Text2,
            Text3 = Text3,
            modifier = Modifier.padding(top = 8.dp) // Add space between the image and text
        )
    }
}

@Composable
fun Texts(Text1: String, Text2: String, Text3: String, modifier: Modifier = Modifier) {
    Column(modifier.padding(8.dp)) {
        Text(text = Text1,
            fontSize = 22.sp,
            modifier = Modifier.padding(bottom = 22.dp)
        )
        Text(text = Text2, modifier = Modifier.padding(bottom = 22.dp))
        Text(text = Text3)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidStudioProjectTheme {
        ImageCard(
            Text1 = "Jetpack Compose tutorial",
            Text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            Text3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
        )
    }
}
