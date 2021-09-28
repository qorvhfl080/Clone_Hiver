package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gecko.clone_hiver.databinding.ActivityMyCouponBinding

class MyCouponActivity : BaseActivity() {

    val binding by lazy { ActivityMyCouponBinding.inflate(layoutInflater) }

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
        actionBarPageNameTxt.text = "쿠폰함"
        actionBarPageNameTxt.visibility = View.VISIBLE
    }

}