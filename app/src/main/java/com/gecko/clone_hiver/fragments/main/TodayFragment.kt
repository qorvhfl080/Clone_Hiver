package com.gecko.clone_hiver.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.adapters.viewpager.ViewPagerAdapter
import com.gecko.clone_hiver.databinding.FragmentTodayBinding
import com.gecko.clone_hiver.fragments.BaseFragment
import com.gecko.clone_hiver.utils.FontChanger


class TodayFragment : BaseFragment() {

    lateinit var binding: FragmentTodayBinding

    val bannerImgList = arrayListOf<Int>(R.drawable.banner_1, R.drawable.banner_2, R.drawable.banner_3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodayBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()

        FontChanger.setGlobalFont(mContext, binding.root)
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        binding.TodayBannerViewPager.adapter = ViewPagerAdapter(bannerImgList)
//        binding.TodayBannerViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//        binding.TodayBannerViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//                binding.countThisBannerTxt.text = "${position + 1}"
//            }
//        })
    }
}