package com.example.mvvmtrainning.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // 숫자 TextView, 버튼

    // 값 변경시 MutableLiveData로 선언
    var count = MutableLiveData<Int>()

    // 함수가 맨 처음 실행되면 count 값을 0으로 설정
    init {
        count.value = 0
    }

    fun increase(){
        count.value = count.value?.plus(1)
    }

    fun decrease(){
        count.value = count.value?.minus(1)
    }


}