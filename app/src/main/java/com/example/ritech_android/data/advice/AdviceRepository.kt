package com.example.ritech_android.data.advice

import com.example.ritech_android.data.advice.remote.AdviceRemoteSource

interface AdviceRepository {
    suspend fun getAdvice(): String
}
