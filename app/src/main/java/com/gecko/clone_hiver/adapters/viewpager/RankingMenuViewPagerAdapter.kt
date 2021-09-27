package com.gecko.clone_hiver.adapters.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.gecko.clone_hiver.fragments.RankingAllFragment
import com.gecko.clone_hiver.fragments.RankingBrandFragment

class RankingMenuViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int = 7

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> RankingAllFragment()
            1 -> RankingBrandFragment()
//            2 -> RankingShoppingMallFragment()
//            3 -> RankingLuxaryFragment()
//            4 -> RankingSportFragment()
//            5 -> RankingDigitalFragment()
//            else -> RankingLifeFragment()
            else -> RankingAllFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "전체"
            1 -> "브랜드"
            2 -> "쇼핑몰"
            3 -> "럭셔리"
            4 -> "스포츠"
            5 -> "디지털"
            6 -> "라이프"
            else -> ""
        }
    }

}