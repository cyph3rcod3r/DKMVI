package com.example.common.viewModel.appState

import com.example.common.model.Names

data class HomeState(val names: List<Names> = emptyList(), val isLoading: Boolean = true, val error: Throwable? = null)
