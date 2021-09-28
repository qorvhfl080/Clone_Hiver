package com.gecko.clone_hiver.fragments.coupon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.databinding.FragmentCouponExpiredBinding
import com.gecko.clone_hiver.fragments.BaseFragment

class CouponExpiredFragment : BaseFragment() {

    lateinit var binding: FragmentCouponExpiredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCouponExpiredBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}