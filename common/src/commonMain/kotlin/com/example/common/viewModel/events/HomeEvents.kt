package com.example.common.viewModel.events

import com.example.common.viewModel.HomeViewModel
import com.example.common.viewModel.reducers.getList
import com.example.common.viewModel.reducers.setLoading
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun HomeViewModel.getList(){
    stateManager.setLoading(true)
    GlobalScope.launch {
        delay(3000)
        stateManager.getList()
    }
}