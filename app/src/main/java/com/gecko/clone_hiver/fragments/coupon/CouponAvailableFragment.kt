package com.gecko.clone_hiver.fragments.coupon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.databinding.FragmentCouponAvailableBinding
import com.gecko.clone_hiver.fragments.BaseFragment


class CouponAvailableFragment : BaseFragment() {

    lateinit var binding: FragmentCouponAvailableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCouponAvailableBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}