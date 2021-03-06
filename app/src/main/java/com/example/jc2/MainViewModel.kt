package com.example.jc2

import androidx.lifecycle.ViewModel
import com.example.common.viewModel.HomeViewModel
import com.example.common.viewModel.events.getList

class MainViewModel : ViewModel() {
    val homeViewModel = HomeViewModel()

    fun getListOfNames() {
        homeViewModel.getList()
    }
}