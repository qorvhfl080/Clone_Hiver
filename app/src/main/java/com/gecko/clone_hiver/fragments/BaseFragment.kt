package com.gecko.clone_hiver.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.gecko.clone_hiver.utils.FontChanger
import com.gecko.clone_hiver.web.ServerAPI
import com.gecko.clone_hiver.web.ServerAPIService
import retrofit2.Retrofit

abstract class BaseFragment : Fragment() {

    lateinit var mContext: Context

//    private lateinit var retrofit: Retrofit
//    lateinit var apiService: ServerAPIService

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = requireContext()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        FontChanger.setGlobalFont(mContext, requireView())
        //retrofit = ServerAPI.getRetrofit(mContext)
        //apiService = retrofit.create(ServerAPIService::class.java)
    }

    abstract fun setupEvents()
    abstract fun setValues()

}