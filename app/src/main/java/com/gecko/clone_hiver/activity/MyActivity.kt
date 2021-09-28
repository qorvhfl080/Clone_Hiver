package com.gecko.clone_hiver.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gecko.clone_hiver.databinding.ActivityMyBinding

class MyActivity : BaseActivity() {

    val binding by lazy { ActivityMyBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        actionBarSettingImg.setOnClickListener {
            val settingIntent = Intent(mContext, MySettingActivity::class.java)
            startActivity(settingIntent)
        }

    }

    override fun setValues() {

        setActionBar()

    }

    override fun setActionBar() {
        actionBarProfileImg.visibility = View.VISIBLE
        actionBarIdTxt.visibility = View.VISIBLE
        actionBarSettingImg.visibility = View.VISIBLE
    }
}