package com.example.common.viewModel

import com.example.common.viewModel.appState.HomeState
import kotlinx.coroutines.flow.MutableStateFlow

class StateManager {
    internal val mutableStateFlow = MutableStateFlow(HomeState())
    internal var state : HomeState
        get() = mutableStateFlow.value
        set (value) {
            mutableStateFlow.value = value
        }
    internal val repository by lazy { Repository() }
}