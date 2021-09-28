package com.gecko.clone_hiver.adapters.viewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.databinding.BannerListItemBinding

class ViewPagerAdapter(mList: ArrayList<Int>) : RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {

    var item = mList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder = PagerViewHolder(parent)

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.img.setImageResource(item[position])
    }

    override fun getItemCount(): Int = item.size

    class PagerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.banner_list_item, parent, false)) {

        val img: ImageView = itemView.findViewById(R.id.bannerImg)
    }

}