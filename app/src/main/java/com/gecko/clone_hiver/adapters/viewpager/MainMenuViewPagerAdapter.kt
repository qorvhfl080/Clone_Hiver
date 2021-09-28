package com.gecko.clone_hiver.adapters.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.gecko.clone_hiver.fragments.main.*

class MainMenuViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int = 10

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TodayFragment()
            1 -> RankingFragment()
            2 -> TimeSaleragment()
            3 -> BenefitFragment()
            4 -> BrandFragment()
            5 -> ShoppingMallFragment()
            6 -> LuxuryFragment()
            7 -> SportFragment()
            8 -> DigitalFragment()
            else -> LifeFragment()
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
            else -> "라이프"
        }
    }

}