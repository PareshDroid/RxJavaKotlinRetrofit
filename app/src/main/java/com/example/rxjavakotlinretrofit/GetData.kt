package com.example.rxjavakotlinretrofit

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface GetData {

    @GET("top-headlines")
    fun getTopNews(@Query("sources") sources: String, @Query("apiKey") apiKey: String): Observable<NewsModel.Result>

}