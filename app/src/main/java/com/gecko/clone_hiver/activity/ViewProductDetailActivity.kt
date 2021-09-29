package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gecko.clone_hiver.databinding.ActivityViewProductDetailBinding

class ViewProductDetailActivity : BaseActivity() {

    val binding by lazy { ActivityViewProductDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        setActionBar()

    }

    override fun setActionBar() {
        actionBarBackImg.visibility = View.VISIBLE
        actionBarHomeImg.visibility = View.VISIBLE
        actionBarSearchImg.visibility = View.VISIBLE
        actionBarShoppingImg.visibility = View.VISIBLE
    }

}