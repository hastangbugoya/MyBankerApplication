package com.example.mybankerapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mybankerapplication.ui.theme.MyBankerApplicationTheme
import com.example.mybankerapplication.viewmodel.BaccaratViewModel

class MainActivity : ComponentActivity() {
    val baccaratViewModel: BaccaratViewModel by lazy {
        BaccaratViewModel()
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBankerApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                backgroundColor = MaterialTheme.colors.primary,
                            ) {
                                TopAppBarContent()
                            }
                        },
                        bottomBar = {
                            BottomAppBar(
                                backgroundColor = MaterialTheme.colors.primary,
                            ) {
                                BottomAppBarContent()
                            }
                        },
                        content = {
                            BaccaratScreen(viewModel = baccaratViewModel)
                        },
                        drawerContent = {
                        },
                    )
                }
            }
        }
    }
}

@Composable
fun MyContent() {
    Column {
        Text(text = "Hello, World!")
        // Add your content here
    }
}

@Composable
fun BottomAppBarContent() {
    // Add your bottom app bar content here
}

@Composable
fun TopAppBarContent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Hello", modifier = Modifier.fillMaxWidth())
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyBankerApplicationTheme {
        Greeting("Android")
    }
}
