package com.example.weatherapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.Activity.MainActivity
import com.example.weatherapp.databinding.CityViewholderBinding
import com.example.weatherapp.model.CityResponseApi

class CityAdapter : RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    private val differCallback = object : DiffUtil.ItemCallback<CityResponseApi.CityResponseApiItem>() {
        override fun areItemsTheSame(
            oldItem: CityResponseApi.CityResponseApiItem,
            newItem: CityResponseApi.CityResponseApiItem
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: CityResponseApi.CityResponseApiItem,
            newItem: CityResponseApi.CityResponseApiItem
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CityViewholderBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = differ.currentList[position]

        holder.binding.cityText.text = currentItem.name
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, MainActivity::class.java).apply {
                putExtra("lat", currentItem.lat)
                putExtra("lon", currentItem.lon)
                putExtra("name", currentItem.name)
            }
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = differ.currentList.size

    inner class ViewHolder(val binding: CityViewholderBinding) : RecyclerView.ViewHolder(binding.root)
}
