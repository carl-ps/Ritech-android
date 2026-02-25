package com.example.ritech_android.data.advice.remote

import retrofit2.http.GET

data class AdviceSlip(val id: Int, val advice: String)
data class AdviceResponse(val slip: AdviceSlip)

interface AdviceService {
    @GET("advice")
    suspend fun getAdvice(): AdviceResponse
}
