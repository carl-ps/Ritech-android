package com.example.ritech_android.data.advice

import com.example.ritech_android.data.advice.remote.AdviceRemoteSource
import com.example.ritech_android.data.advice.remote.AdviceRemoteSourceImplementation
import com.example.ritech_android.data.advice.remote.AdviceService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AdviceProvider {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.adviceslip.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideAdviceService(retrofit: Retrofit): AdviceService =
        retrofit.create(AdviceService::class.java)

    @Provides
    @Singleton
    fun provideAdviceRemoteSource(adviceService: AdviceService): AdviceRemoteSource =
        AdviceRemoteSourceImplementation(adviceService)

    @Provides
    @Singleton
    fun provideAdviceRepository(remoteSource: AdviceRemoteSource): AdviceRepository =
        AdviceRepositoryImplementation(remoteSource)
}
