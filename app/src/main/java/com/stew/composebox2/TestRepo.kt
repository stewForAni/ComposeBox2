package com.stew.composebox2

import androidx.lifecycle.MutableLiveData

/**
 * Created by stew on 2022/11/19.
 * mail: stewforani@gmail.com
 */
class TestRepo {
    var api = RetrofitManager.getService(HomeApi::class.java)
        suspend fun getBanner(data: MutableLiveData<List<Banner>>){
            data.value = api.getBanner().data
        }
}