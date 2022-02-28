package com.example.livetips.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livetips.data.model.Match

class MatchesViewModel : ViewModel() {
    private var _matchList = MutableLiveData < List <Match>>()
    val matchList: LiveData<List<Match>>
        get() = _matchList
}