package com.gecko.clone_hiver.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.adapters.viewpager.RankingMenuViewPagerAdapter
import com.gecko.clone_hiver.databinding.FragmentRankingBinding
import com.gecko.clone_hiver.fragments.BaseFragment


class RankingFragment : BaseFragment() {

    lateinit var binding: FragmentRankingBinding

    lateinit var rankingMenuViewPagerAdapter: RankingMenuViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRankingBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        setRankingViewPager()

    }

    fun setRankingViewPager() {

        rankingMenuViewPagerAdapter = RankingMenuViewPagerAdapter(childFragmentManager)
        binding.rankingMenuViewPager.adapter = rankingMenuViewPagerAdapter
        binding.rankingMenuTabLayout.setupWithViewPager(binding.rankingMenuViewPager)
    }

}