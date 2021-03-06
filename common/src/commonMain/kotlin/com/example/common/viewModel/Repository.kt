package com.example.common.viewModel

import com.example.common.model.Names

class Repository {
    fun getList(): ArrayList<Names> {
        val list = ArrayList<Names>()
        for (i in 0..10){
            list.add(Names("Person $i"))
        }
        return list
    }
}
