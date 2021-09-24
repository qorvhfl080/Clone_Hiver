package com.gecko.clone_hiver.adapters.recycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.activity.ViewProductDetailActivity
import com.gecko.clone_hiver.databinding.ProductListItemBinding
import com.gecko.clone_hiver.databinding.SaleProductListItemBinding
import com.gecko.clone_hiver.datas.ProductData

class ProductAdapter(val mContext: Context, val mList: List<ProductData>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = SaleProductListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding).apply {
            itemView.setOnClickListener {
                val toViewDetailIntent = Intent(mContext, ViewProductDetailActivity::class.java)
                toViewDetailIntent.putExtra("product", mList[position])
                mContext.startActivity(toViewDetailIntent)
            }
        }
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val data = mList[position]

        holder.bind(mContext, data)
    }

    override fun getItemCount(): Int = mList.size

    class ProductViewHolder(binding: SaleProductListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val productImg = binding.productImg
        val brandName = binding.brandTxt
        val productName = binding.productNameTxt
        val productPrice = binding.productPriceTxt

        fun bind(context: Context, data: ProductData) {
            Glide.with(context).load(data.Img).into(productImg)
            brandName.text = data.brandName
            productName.text = data.productName
            productPrice.text = "${data.price}"
        }
    }

}