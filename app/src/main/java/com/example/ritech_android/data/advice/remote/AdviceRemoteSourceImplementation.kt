package com.example.ritech_android.data.advice.remote

class AdviceRemoteSourceImplementation(private val adviceService: AdviceService) : AdviceRemoteSource {
    override suspend fun getAdvice(): String = adviceService.getAdvice().slip.advice
}
