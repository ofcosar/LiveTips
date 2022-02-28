package com.example.livetips.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.livetips.R
import com.example.livetips.adapters.MatchListAdapter
import com.example.livetips.viewModel.MatchesViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var liveTipsViewModel: MatchesViewModel
    private lateinit var matchListAdapter: MatchListAdapter
    private lateinit var recV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recV = findViewById(R.id.rec)
        liveTipsViewModel = ViewModelProvider(this)[MatchesViewModel::class.java]
        liveTipsViewModel.matchList.observe(this) {
            matchListAdapter.notifyDataSetChanged()
        }
        initRecyclerList()
    }

    private fun initRecyclerList() {
        matchListAdapter = MatchListAdapter(liveTipsViewModel.matchList.value!!)
        recV.adapter = matchListAdapter
    }
}