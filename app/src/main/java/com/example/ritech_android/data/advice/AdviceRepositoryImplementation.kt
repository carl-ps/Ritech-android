package com.example.ritech_android.data.advice

import com.example.ritech_android.data.advice.remote.AdviceRemoteSource

class AdviceRepositoryImplementation(private val remoteSource: AdviceRemoteSource) : AdviceRepository {
    override suspend fun getAdvice(): String = remoteSource.getAdvice()
}
