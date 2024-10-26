package com.example.empoweringthenation3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SummarySixWeek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summarysixweek)

        // Set up button listeners
        findViewById<Button>(R.id.childMindingButton).setOnClickListener {
            // Handle button click for Child Minding
            startCourseDetailActivity("Child Minding", 750.0)
        }

        findViewById<Button>(R.id.cookingButton).setOnClickListener {
            // Handle button click for Cooking
            startCourseDetailActivity("Cooking", 750.0)
        }

        findViewById<Button>(R.id.gardenMaintenanceButton).setOnClickListener {
            // Handle button click for Garden Maintenance
            startCourseDetailActivity("Garden Maintenance", 750.0)
        }
    }

    private fun startCourseDetailActivity(courseName: String, price: Double) {
        // Your implementation for starting the course detail activity
    }
}
