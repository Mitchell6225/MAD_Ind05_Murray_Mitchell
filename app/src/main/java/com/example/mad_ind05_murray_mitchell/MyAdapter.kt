package com.example.mad_ind05_murray_mitchell


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_murray_mitchell.databinding.RecyclerviewRowBinding
import layout.states



class MyAdapter(val mainActivity: MainActivity,val stateList: List<states>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItem(state: states) {
            binding.tvStates.text = state.name
            binding.tvnickName.text = state.nick
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return stateList.size
    }

    interface OnItemClickListener {
        fun onItemClick(name: String)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val state = stateList[position]
        holder.bindItem(state)
        holder.itemView.setOnClickListener {
            mainActivity.jump(state.name)
        }
    }




}