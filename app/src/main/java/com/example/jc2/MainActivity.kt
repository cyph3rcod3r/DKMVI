package com.example.jc2

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.common.viewModel.HomeViewModel
import com.example.jc2.ui.Jc2Theme
import androidx.compose.runtime.*

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jc2Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ListOfNames(mainViewModel.homeViewModel)
                }
            }
        }
        mainViewModel.getListOfNames()
    }
}

@Composable
fun ListOfNames(homeViewModel: HomeViewModel) {
    val appState by homeViewModel.stateFlow.collectAsState()

    if (appState.isLoading) {
        CircularProgressIndicator()
    }
    MaterialTheme {
        LazyColumn {
            items(appState.names) { name ->
                Name(name = name.name)
            }
        }
    }
}

@Composable
fun Name(name: String) {
    Text(text = name, Modifier.padding(16.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jc2Theme {
        Name("Android")
    }
}