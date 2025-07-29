package com.example.agegroupapp

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agegroupapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hide result texts initially
        binding.greetingText.visibility = View.GONE
        binding.ageGroupText.visibility = View.GONE

        binding.submitButton.setOnClickListener { handleSubmission() }
        binding.ageInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                handleSubmission()
                true
            } else {
                false
            }
        }
    }

    private fun handleSubmission() {
        val name = binding.nameInput.text.toString().trim()
        val ageText = binding.ageInput.text.toString().trim()
        val age = ageText.toIntOrNull()

        if (TextUtils.isEmpty(name) || age == null || age < 0) {
            Toast.makeText(this, "Enter a valid name and age", Toast.LENGTH_SHORT).show()
            return
        }

        binding.greetingText.apply {
            text = "Hello, $name!"
            visibility = View.VISIBLE
        }

        val ageGroup = when {
            age < 13 -> "Child"
            age in 13..19 -> "Teenager"
            age in 20..59 -> "Adult"
            else -> "Senior"
        }

        binding.ageGroupText.apply {
            text = "You are a $ageGroup."
            visibility = View.VISIBLE
        }

        binding.nameInput.clearFocus()
        binding.ageInput.clearFocus()
    }
}
