package com.example.guillermo

import android.content.ClipData
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MyAPI {
    @GET("/items/{id}")
    fun getItem(@Path("id") id: Int): Deferred<ClipData.Item>

    @POST("/items")
    fun createItem(@Body item: ClipData.Item): Deferred<ClipData.Item>
}

