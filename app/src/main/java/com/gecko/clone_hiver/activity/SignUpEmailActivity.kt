package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gecko.clone_hiver.databinding.ActivitySignUpEmailBinding

class SignUpEmailActivity : BaseActivity() {

    val binding by lazy { ActivitySignUpEmailBinding.inflate(layoutInflater) }

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