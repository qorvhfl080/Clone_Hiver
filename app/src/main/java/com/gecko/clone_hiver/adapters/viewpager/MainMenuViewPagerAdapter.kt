package com.gecko.clone_hiver.adapters.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.gecko.clone_hiver.fragments.TimeSaleragment
import com.gecko.clone_hiver.fragments.TodayFragment

class MainMenuViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int = 10

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TodayFragment()
            2 -> TimeSaleragment()
            else -> TodayFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "투데이"
            1 -> "랭킹"
            2 -> "특가"
            3 -> "혜택존"
            4 -> "브랜드"
            5 -> "쇼핑몰"
            6 -> "럭셔리"
            7 -> "스포츠"
            8 -> "디지털"
            9 -> "라이프"
            else -> ""
        }
    }

}