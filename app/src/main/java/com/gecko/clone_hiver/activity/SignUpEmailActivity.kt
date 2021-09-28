package com.gecko.clone_hiver.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gecko.clone_hiver.databinding.ActivitySignUpEmailBinding

class SignUpEmailActivity : BaseActivity() {

    val binding by lazy { ActivitySignUpEmailBinding.inflate(layoutInflater) }

    var allChecked: Boolean = true

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