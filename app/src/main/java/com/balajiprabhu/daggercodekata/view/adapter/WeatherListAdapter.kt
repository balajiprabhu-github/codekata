package com.balajiprabhu.daggercodekata.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balajiprabhu.daggercodekata.CommonViewHolder
import com.balajiprabhu.daggercodekata.databinding.ItemCityWeatherBinding
import com.balajiprabhu.daggercodekata.viewmodel.HomeWeatherItemViewModel

class WeatherListAdapter : RecyclerView.Adapter<CommonViewHolder>() {

    private val weatherItemList = mutableListOf<HomeWeatherItemViewModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemCityWeatherBinding = ItemCityWeatherBinding.inflate(layoutInflater, parent,false)
        return CommonViewHolder(itemCityWeatherBinding)
    }

    override fun getItemCount(): Int {
        return weatherItemList.size
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) = holder.bind(weatherItemList[position])

    fun setWeatherItemListData(weatherList:List<HomeWeatherItemViewModel>){
        weatherItemList.clear()
        weatherItemList.addAll(weatherList)
        notifyDataSetChanged()
    }

}


