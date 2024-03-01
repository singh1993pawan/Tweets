package com.freeelective.tweets.api

import com.freeelective.tweets.models.TweetsListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyApi {

    @GET("/v3/b/65bf1129dc746540189ff9c0?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String):Response<List<TweetsListItem>>

    @GET("/v3/b/65bf1129dc746540189ff9c0?meta=false")
    @Headers("X-JSON-Path:tweets..category")
    suspend fun getCategory():Response<List<String>>
}