package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.databinding.ActivitySignInBinding

class SignInActivity : BaseActivity() {

    val binding by lazy { ActivitySignInBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

    override fun setActionBar() {

    }
}