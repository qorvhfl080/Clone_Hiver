package com.gecko.clone_hiver.activity

import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.web.ServerAPI
import com.gecko.clone_hiver.web.ServerAPIService
import retrofit2.Retrofit

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext: Context

    lateinit var retrofit: Retrofit
    lateinit var apiService: ServerAPIService

    lateinit var actionBarTitleTxt: TextView
    lateinit var actionBarPageNameTxt: TextView
    lateinit var actionBarIdTxt: TextView
    lateinit var actionBarBackImg: ImageView
    lateinit var actionBarHomeImg: ImageView
    lateinit var actionBarSearchImg: ImageView
    lateinit var actionBarShoppingImg: ImageView
    lateinit var actionBarSettingImg: ImageView
    lateinit var actionBarProfileImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this

//        retrofit = ServerAPI.getRetrofit(mContext)
//        apiService = retrofit.create(ServerAPIService::class.java)
//
        supportActionBar?.let {
            setCustomActionBar()
        }
    }

    abstract fun setupEvents()
    abstract fun setValues()
    abstract fun setActionBar()

    fun setCustomActionBar() {

        val defActionBar = supportActionBar!!

        defActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        defActionBar.setCustomView(R.layout.custom_action_bar)

        val toolbar = defActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0, 0)

        actionBarTitleTxt = defActionBar.customView.findViewById(R.id.actionTitleTxt)
        actionBarPageNameTxt = defActionBar.customView.findViewById(R.id.actionPageNameTxt)
        actionBarIdTxt = defActionBar.customView.findViewById(R.id.actionIdTxt)
        actionBarBackImg = defActionBar.customView.findViewById(R.id.actionBackImg)
        actionBarHomeImg = defActionBar.customView.findViewById(R.id.actionHomeImg)
        actionBarSearchImg = defActionBar.customView.findViewById(R.id.actionSearchImg)
        actionBarShoppingImg = defActionBar.customView.findViewById(R.id.actionShoppingImg)
        actionBarSettingImg = defActionBar.customView.findViewById(R.id.actionSettingImg)
        actionBarProfileImg = defActionBar.customView.findViewById(R.id.actionProfileImg)
    }

}