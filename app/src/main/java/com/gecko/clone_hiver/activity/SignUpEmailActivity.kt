package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gecko.clone_hiver.databinding.ActivitySignUpEmailBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class SignUpEmailActivity : BaseActivity() {

    val binding by lazy { ActivitySignUpEmailBinding.inflate(layoutInflater) }

    var allChecked: Boolean = true

    val db = Firebase.database
    val userRef = db.getReference("User")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        binding.allCheckBox.setOnClickListener {
            if (allChecked) {
                allChecked = false
                binding.over14YearsOldCheckBox.isChecked = true
                binding.agreeHiverTermsCheckBox.isChecked = true
                binding.essentialPersonalInfoCheckBox.isChecked = true
                binding.optionalPersonalInfoCheckBox.isChecked = true
                binding.eventMarketingCheckBox.isChecked = true
                binding.nightAlarmCheckBox.isChecked = true

            } else {
                allChecked = true
                binding.over14YearsOldCheckBox.isChecked = false
                binding.agreeHiverTermsCheckBox.isChecked = false
                binding.essentialPersonalInfoCheckBox.isChecked = false
                binding.optionalPersonalInfoCheckBox.isChecked = false
                binding.eventMarketingCheckBox.isChecked = false
                binding.nightAlarmCheckBox.isChecked = false
            }

        }

        binding.signUpSubmitBtn.setOnClickListener {
            val id = binding.inputIdEdt.text.toString()
            val pw = binding.inputPasswordEdt.text.toString()
            val email = binding.inputEmailEdt.text.toString()
            var phone = binding.phoneFirstEdt.text.toString()
            phone += binding.phoneSecondEdt.text.toString()
            phone += binding.phoneThirdEdt.text.toString()

        }

    }

    override fun setValues() {

        setActionBar()

    }

    override fun setActionBar() {
        actionBarBackImg.visibility = View.VISIBLE
        actionBarPageNameTxt.text = "회원가입"
        actionBarPageNameTxt.visibility = View.VISIBLE
    }
}