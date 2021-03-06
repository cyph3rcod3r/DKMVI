package com.example.jc2

import androidx.lifecycle.ViewModel
import com.example.common.viewModel.HomeViewModel
import com.example.common.viewModel.appState.HomeState
import com.example.common.viewModel.events.getList
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
     val homeViewModel get() = HomeViewModel()

    fun getListOfNames(){
        homeViewModel.getList()
    }
}