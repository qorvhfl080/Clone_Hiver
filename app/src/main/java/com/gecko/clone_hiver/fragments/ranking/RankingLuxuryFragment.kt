package com.gecko.clone_hiver.fragments.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.databinding.FragmentRankingLuxuryBinding
import com.gecko.clone_hiver.fragments.BaseFragment


class RankingLuxuryFragment : BaseFragment() {

    lateinit var binding: FragmentRankingLuxuryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRankingLuxuryBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}