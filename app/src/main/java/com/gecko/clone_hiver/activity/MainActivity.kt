package com.gecko.clone_hiver.activity

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.Toast
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.adapters.viewpager.MainMenuViewPagerAdapter
import com.gecko.clone_hiver.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize
import java.security.MessageDigest

class MainActivity : BaseActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var mainMenuViewPagerAdapter: MainMenuViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello World!")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                Log.d("db", "${value}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d("db", "Fail to read value", error.toException())
            }
        })

    }

    override fun setupEvents() {

        binding.mainBottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val mainActivity = Intent(mContext, MainActivity::class.java)
                    startActivity(mainActivity)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.aiRecommend -> {
                    Toast.makeText(mContext, "액티비티 미생성됨", Toast.LENGTH_SHORT).show()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.category -> {
                    keyHash()
                    Toast.makeText(mContext, "액티비티 미생성됨", Toast.LENGTH_SHORT).show()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.wishlist -> {
                    val myPageIntent = Intent(mContext, MyActivity::class.java)
                    startActivity(myPageIntent)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.user -> {
                    val signUpIntent = Intent(mContext, SignUpActivity::class.java)
                    startActivity(signUpIntent)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {return@setOnNavigationItemSelectedListener true}
            }
        }

    }

    override fun setValues() {

        setMainViewPager()
        setActionBar()


    }

    override fun setActionBar() {
        actionBarTitleTxt.visibility = View.VISIBLE
        actionBarSearchImg.visibility = View.VISIBLE
        actionBarShoppingImg.visibility = View.VISIBLE
    }

    fun setMainViewPager() {
        mainMenuViewPagerAdapter = MainMenuViewPagerAdapter(supportFragmentManager)
        binding.mainMenuViewPager.adapter = mainMenuViewPagerAdapter
        binding.mainMenuTabLayout.setupWithViewPager(binding.mainMenuViewPager)
    }

    fun keyHash() {
        val info = packageManager.getPackageInfo(
            "com.gecko.clone_hiver",
            PackageManager.GET_SIGNATURES
        )
        for (signature in info.signatures) {
            val md: MessageDigest = MessageDigest.getInstance("SHA")
            md.update(signature.toByteArray())
            Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
        }
    }

}