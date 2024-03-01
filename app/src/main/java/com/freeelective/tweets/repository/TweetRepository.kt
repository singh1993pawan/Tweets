package com.freeelective.tweets.repository

import com.freeelective.tweets.api.TweetsyApi
import com.freeelective.tweets.models.TweetsListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetRepository @Inject constructor(private val tweetsyApi: TweetsyApi) {

    private val _category = MutableStateFlow<List<String>>(emptyList())
    val category: StateFlow<List<String>> get() = _category

    private val _tweets = MutableStateFlow<List<TweetsListItem>>(emptyList())
    val tweets: StateFlow<List<TweetsListItem>> get() = _tweets

    suspend fun getCategory() {
        val response = tweetsyApi.getCategory()
        if (response.isSuccessful && response.body() != null) {
            _category.emit(response.body()!!)
        }
    }

    suspend fun getTweets(category: String) {
        val response = tweetsyApi.getTweets("tweets[?(@.category==\"$category\")]")
        if (response.isSuccessful && response.body() != null) {
            _tweets.emit(response.body()!!)
        }
    }
}