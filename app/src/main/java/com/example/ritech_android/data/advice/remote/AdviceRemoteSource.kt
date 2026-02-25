package com.example.ritech_android.data.advice.remote

interface AdviceRemoteSource {
    suspend fun getAdvice(): String
}
