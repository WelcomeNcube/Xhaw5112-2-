package com.example.empoweringthenation3

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class YourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_fees) // Ensure this matches your layout file name

        val nameEditText = findViewById<EditText>(R.id.name)
        val phoneEditText = findViewById<EditText>(R.id.phone)
        val emailEditText = findViewById<EditText>(R.id.email)

        val firstAidCheckBox = findViewById<CheckBox>(R.id.course_first_aid)
        val sewingCheckBox = findViewById<CheckBox>(R.id.course_sewing)
        val landscapingCheckBox = findViewById<CheckBox>(R.id.course_landscaping)
        val lifeSkillsCheckBox = findViewById<CheckBox>(R.id.course_life_skills)

        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val totalFeeTextView = findViewById<TextView>(R.id.total_fee)

        calculateButton.setOnClickListener {
            var total = 0.0

            // Add course fees based on selected checkboxes
            if (firstAidCheckBox.isChecked) total += 1500
            if (sewingCheckBox.isChecked) total += 1500
            if (landscapingCheckBox.isChecked) total += 1500
            if (lifeSkillsCheckBox.isChecked) total += 1500

            // Display total fee
            totalFeeTextView.text = "Total Fee: R$total"
        }
    }
}
