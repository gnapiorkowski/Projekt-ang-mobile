package com.example.myapplication.apiclient.service

import com.example.myapplication.apiclient.model.*
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ExerciseService {
    @GET("readingVideoTests")
    fun getAllRedingVideoTests(): Call<ReadingVideoTestAllResponseEmbedded>
    @GET("readingVideoTests/{id}")
    fun getReadingVideoTest(@Path("id") id: Int): Call<ReadingVideoTest>
    @GET("readingVideoTests/{id}/tags")
    fun getReadingVideoTestTags(@Path("id") id: Int): Call<TagsResponseEmbedded>
    @GET("readingVideoTests/{id}/roles")
    fun getReadingVideoTestRoles(@Path("id") id: Int): Call<RoleResponseEmbedded>

    @GET("sentences")
    fun getAllSentences(): Call<SentenceAllResponseEmbedded>
    @GET("sentences/{id}")
    fun getSentence(@Path("id") id: Int): Call<Sentence>
    @GET("sentences/{id}/tags")
    fun getSentenceTags(@Path("id") id: Int): Call<TagsResponseEmbedded>
    @GET("sentences/{id}/roles")
    fun getSentenceRoles(@Path("id") id: Int): Call<RoleResponseEmbedded>

    @GET("glossaries")
    fun getAllGlossaries(): Call<GlossarieAllResponseEmbedded>
    @GET("glossaries/{id}")
    fun getGlossarie(@Path("id") id: Int): Call<Glossarie>
    @GET("glossaries/{id}/tags")
    fun getGlossarieTags(@Path("id") id: Int): Call<TagsResponseEmbedded>
    @GET("glossaries/{id}/roles")
    fun getGlossarieRoles(@Path("id") id: Int): Call<RoleResponseEmbedded>

    @GET("users")
    fun getAllUsers(): Call<UserAllResponseEmbedded>
}
