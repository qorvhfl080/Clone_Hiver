package com.gecko.clone_hiver.adapters.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.gecko.clone_hiver.fragments.coupon.CouponAvailableFragment
import com.gecko.clone_hiver.fragments.coupon.CouponExpiredFragment

class CouponMenuViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> CouponAvailableFragment()
            else -> CouponExpiredFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "사용가능 (0)"
            1 -> "사용완료/만료 (0)"
            else -> ""
        }
    }

}