package com.example.ritech_android

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    private val _advice = MutableSharedFlow<String>()
    val advice: SharedFlow<String> = _advice

    fun getAdvice() {
    }
}
