package com.example.livetips.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.livetips.R
import com.example.livetips.data.model.Match

class MatchListAdapter(private val listM: List<Match>): RecyclerView.Adapter<MatchListAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val team1 = view.findViewById<TextView>(R.id.team1)
        val goal1 = view.findViewById<TextView>(R.id.goalNum)
        val corner1 = view.findViewById<TextView>(R.id.cornerNum)
        val team2 = view.findViewById<TextView>(R.id.team1)
        val goal2 = view.findViewById<TextView>(R.id.goalNum2)
        val corner2 = view.findViewById<TextView>(R.id.cornerNum2)
        val duration = view.findViewById<TextView>(R.id.duration)
        val goalTip  = view.findViewById<TextView>(R.id.goalT)
        val cornerTip = view.findViewById<TextView>(R.id.cornerT)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.match,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val match = listM[position]
        holder.team1.text = match.team1.name
        holder.team2.text = match.team2.name
        holder.goal1.text = match.team1.score.toString()
        holder.goal2.text = match.team2.score.toString()
        holder.corner1.text = match.team1.corner.toString()
        holder.corner2.text = match.team2.corner.toString()
        holder.duration.text = match.duration.toString()
        holder.goalTip.text = match.goalTip.toString()
        holder.cornerTip.text = match.cornerTip.toString()
    }

    override fun getItemCount(): Int {
        return listM.size
    }
}