package com.example.common.viewModel.reducers

import com.example.common.viewModel.StateManager

fun StateManager.setLoading(loading: Boolean) {
    state = state.copy(isLoading = loading)
}

fun StateManager.getList() {
    val list = repository.getList()
    state = state.copy(names = list, isLoading = false)
}