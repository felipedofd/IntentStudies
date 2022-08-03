package com.example.intentstudies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentstudies.databinding.ActivityReceiveIntentBinding

class ReceiveIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReceiveIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityReceiveIntentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataIntent = intent.extras
        val messageToIntent = dataIntent?.getString("editTextViaIntent")

        binding.textReceivedViaIntent.text = messageToIntent

        binding.backButton.setOnClickListener {
            finish()
        }

    }
}
