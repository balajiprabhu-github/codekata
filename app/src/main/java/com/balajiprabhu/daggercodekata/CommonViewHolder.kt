package com.balajiprabhu.daggercodekata

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


class CommonViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun <VM> bind(viewModel: VM){
        viewDataBinding.setVariable(BR.viewModel,viewModel)
        viewDataBinding.executePendingBindings()
    }

}
