package com.balajiprabhu.daggercodekata.view.adapter

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("android:loadIconUrl")
    fun setLoadIconUrl(view: View, iconCode: String) {
        val iconUrl = "https://openweathermap.org/img/wn/$iconCode@2x.png"
        val imageView: ImageView = view as ImageView
        Picasso.get().load(iconUrl).into(imageView)
    }

}