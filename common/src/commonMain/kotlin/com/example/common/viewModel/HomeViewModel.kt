package com.example.common.viewModel

import com.example.common.viewModel.appState.HomeState
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel {
    val stateFlow: StateFlow<HomeState>
        get() = stateManager.mutableStateFlow
    internal val stateManager by lazy { StateManager() }
}