package com.gecko.clone_hiver.adapters

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gecko.clone_hiver.utils.FontChanger

class BaseViewHolder(context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {

    init {
        FontChanger.setGlobalFont(context, itemView)
    }

}