package com.gecko.clone_hiver.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.adapters.viewpager.RankingMenuViewPagerAdapter
import com.gecko.clone_hiver.databinding.FragmentBrandBinding
import com.gecko.clone_hiver.databinding.FragmentRankingBinding


class RankingFragment : BaseFragment() {

    lateinit var binding: FragmentRankingBinding

    lateinit var rankingMenuViewPagerAdapter: RankingMenuViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRankingBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        setRankingViewPager()

    }

    fun setRankingViewPager() {
        rankingMenuViewPagerAdapter = RankingMenuViewPagerAdapter(requireActivity().supportFragmentManager)
        binding.rankingMenuViewPager.adapter = rankingMenuViewPagerAdapter
        binding.rankingMenuTabLayout.setupWithViewPager(binding.rankingMenuViewPager)
    }

}