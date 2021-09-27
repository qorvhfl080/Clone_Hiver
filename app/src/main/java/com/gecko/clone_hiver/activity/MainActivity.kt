package com.gecko.clone_hiver.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.adapters.viewpager.MainMenuViewPagerAdapter
import com.gecko.clone_hiver.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var mainMenuViewPagerAdapter: MainMenuViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        setMainViewPager()
        setActionBar()

        binding.mainBottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
//                R.id.home -> {supportFragmentManager.beginTransaction().replace(R.id.linearLayout , HomeFragment()).commitAllowingStateLoss()}
//                R.id.aiRecommend -> {}
//                R.id.category -> {}
//                R.id.wishlist -> {}
                R.id.user -> {
                    val signUpIntent = Intent(mContext, SignUpActivity::class.java)
                    startActivity(signUpIntent)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {return@setOnNavigationItemSelectedListener true}
            }
        }



    }

    fun setMainViewPager() {
        mainMenuViewPagerAdapter = MainMenuViewPagerAdapter(supportFragmentManager)
        binding.mainMenuViewPager.adapter = mainMenuViewPagerAdapter
        binding.mainMenuTabLayout.setupWithViewPager(binding.mainMenuViewPager)
    }

    fun setActionBar() {

        val defActionBar =supportActionBar!!
        defActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        defActionBar.setCustomView(R.layout.custom_action_bar)

        val toolbar = defActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0, 0)



    }

}