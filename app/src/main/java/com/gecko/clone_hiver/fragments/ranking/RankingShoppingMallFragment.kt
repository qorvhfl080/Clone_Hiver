package com.gecko.clone_hiver.fragments.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gecko.clone_hiver.databinding.FragmentRankingShoppingMallBinding
import com.gecko.clone_hiver.fragments.BaseFragment


class RankingShoppingMallFragment : BaseFragment() {

    lateinit var binding: FragmentRankingShoppingMallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRankingShoppingMallBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}