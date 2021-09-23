package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        mainMenuViewPagerAdapter = MainMenuViewPagerAdapter(supportFragmentManager)
        binding.mainMenuViewPager.adapter = mainMenuViewPagerAdapter
        binding.mainMenuTabLayout.setupWithViewPager(binding.mainMenuViewPager)

    }
}