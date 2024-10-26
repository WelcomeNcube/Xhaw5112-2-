package com.example.empoweringthenation3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SummarySixMonth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summarysixmonth)

        // Set up button listeners
        findViewById<Button>(R.id.firstAidButton).setOnClickListener {
            // Handle button click for First Aid
            startCourseDetailActivity("First Aid", 1500.0)
        }

        findViewById<Button>(R.id.sewingButton).setOnClickListener {
            // Handle button click for Sewing
            startCourseDetailActivity("Sewing", 1500.0)
        }

        findViewById<Button>(R.id.landscapingButton).setOnClickListener {
            // Handle button click for Landscaping
            startCourseDetailActivity("Landscaping", 1500.0)
        }

        findViewById<Button>(R.id.lifeSkillsButton).setOnClickListener {
            // Handle button click for Life Skills
            startCourseDetailActivity("Life Skills", 1500.0)
        }
    }

    private fun startCourseDetailActivity(courseName: String, price: Double) {
        // Your implementation for starting the course detail activity
    }
}
