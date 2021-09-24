package com.gecko.clone_hiver.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gecko.clone_hiver.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity() {

    val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        binding.xBtn.setOnClickListener {
            finish()
        }

        binding.signUpNaverBtn.setOnClickListener {

        }

        binding.signUpFacebookBtn.setOnClickListener {

        }

        binding.signUpGoogleBtn.setOnClickListener {

        }

        binding.signUpAppleBtn.setOnClickListener {

        }

        binding.signUpEmailBtn.setOnClickListener {
            startActivity(Intent(mContext, SignUpEmailActivity::class.java))
        }

        binding.toSignInBtn.setOnClickListener {
            startActivity(Intent(mContext, SignInActivity::class.java))
            finish()
        }

    }

    override fun setValues() {

    }

}