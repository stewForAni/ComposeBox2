package com.stew.composebox2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

/**
 * Created by stew on 2022/11/15.
 * mail: stewforani@gmail.com
 */
class TestViewModel : ViewModel() {
    var bannerList = MutableLiveData<List<Banner>>()
    var repo = TestRepo()
    fun test() {
        viewModelScope.launch {
            repo.getBanner(bannerList)
        }
    }

}