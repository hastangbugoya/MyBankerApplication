package com.example.mybankerapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.mybankerapplication.model.DrawRecepient
import com.example.mybankerapplication.viewmodel.BaccaratViewModel

@Composable
fun BaccaratScreen(viewModel: BaccaratViewModel) {
    val bankerHand by viewModel.bankerHand
    val playerHand by viewModel.playerHand
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth().height(300.dp).background(Color.Green).padding(8.dp)) {
            LazyRow() {
                items(bankerHand) {
                    val painter = rememberImagePainter(data = it.cardImage)
                    Image(painter, null, modifier = Modifier.width(200.dp))
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth().height(300.dp).background(Color.Green).padding(8.dp)) {
            LazyRow() {
                items(playerHand) {
                    val painter = rememberImagePainter(data = it.cardImage)
                    Image(painter, null, modifier = Modifier.width(200.dp))
                }
            }
        }
    }
}
