package com.gecko.clone_hiver.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.gecko.clone_hiver.R
import com.gecko.clone_hiver.databinding.ActivitySignUpBinding
import com.nhn.android.naverlogin.OAuthLogin
import com.nhn.android.naverlogin.OAuthLoginHandler
import org.json.JSONObject

class SignUpActivity : BaseActivity() {

    val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }

    lateinit var mNaverLoginModule: OAuthLogin

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

            mNaverLoginModule.startOauthLoginActivity(this, object : OAuthLoginHandler() {
                override fun run(success: Boolean) {
                    if (success) {

                        val accessToken = mNaverLoginModule.getAccessToken(mContext)
                        Log.d("token", "네이버토큰=${accessToken}")

                        Thread {
                            val url = "https://openapi.naver.com/v1/nid/me"
                            val jsonObj = JSONObject(mNaverLoginModule.requestApi(mContext, accessToken, url))
                            Log.d("naver", jsonObj.toString())

                            val responseObj = jsonObj.getJSONObject("response")

                            val uid = responseObj.getString("id")
                            val name = responseObj.getString("name")

                            // apiService.postRequestSocialLogin()

                        }.start()



                    } else {
                        Toast.makeText(mContext, "네이버 로그인 실패", Toast.LENGTH_SHORT).show()
                    }
                }
            })

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

        setActionBar()

        mNaverLoginModule = OAuthLogin.getInstance()
        mNaverLoginModule.init(mContext,
            getString(R.string.naver_client_id),
            getString(R.string.naver_secret_key),
            getString(R.string.naver_client_name)
        )

    }

    override fun setActionBar() {
        actionBarLayout.visibility = View.GONE
    }
}