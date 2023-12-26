package com.jotap.amelhorcalculadoradaminharua

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var estadoAtual by mutableStateOf(Estado())
    private set

}