package com.gecko.clone_hiver.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.adapters.recycler.ProductAdapter
import com.gecko.clone_hiver.databinding.FragmentBrandBinding
import com.gecko.clone_hiver.databinding.FragmentLuxaryBinding
import com.gecko.clone_hiver.datas.ProductData


class LuxaryFragment : BaseFragment() {

    lateinit var binding: FragmentLuxaryBinding

    val mSuareProductList = ArrayList<ProductData>()

    lateinit var mSuareProductAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLuxaryBinding.inflate(inflater, container, false)

        mSuareProductAdapter = ProductAdapter(requireContext(), mSuareProductList)
        binding.suareRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.suareRecyclerView.adapter = mSuareProductAdapter

        return binding.root
    }


    override fun setupEvents() {

    }

    override fun setValues() {
        mSuareProductList.add(ProductData(1, "베이직 아노락 롱팬츠 셋업[카키그레이]", "레투", 69900, "data:image/jpeg;base64,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"))
        mSuareProductList.add(ProductData(2, "[세트]나일론 이지 아노락 조거 셋업", "카멜워크", 86400, "data:image/jpeg;base64,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"))
        mSuareProductList.add(ProductData(3, "YOWL CAT 자수 후드 블랙", "꼼파뇨", 45500, "data:image/jpeg;base64,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"))
        mSuareProductList.add(ProductData(4, "[21FW] 캐시미어 블렌드 가디건", "바쏘옴므", 49000, "data:image/jpeg;base64,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"))
    }
}