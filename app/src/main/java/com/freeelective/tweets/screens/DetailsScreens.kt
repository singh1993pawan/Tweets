package com.freeelective.tweets.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.freeelective.tweets.models.TweetsListItem
import com.freeelective.tweets.viewmodels.DetailsViewModel

@Composable
fun DetailsScreen() {
    val detailsViewModel: DetailsViewModel = hiltViewModel ()
    val tweets = detailsViewModel.tweets.collectAsState()

    LazyColumn(content = {
        items(tweets.value) {
            TweetsListItem(it.text)
        }
    })
}

@Composable
fun TweetsListItem(tweet: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        border = BorderStroke(1.dp, Color(0xFFCCCCCC)),
        content = {
            Text(
                text = tweet,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.body2
            )
        }
    )
}