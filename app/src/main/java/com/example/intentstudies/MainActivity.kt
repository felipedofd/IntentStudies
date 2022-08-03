package com.example.intentstudies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intentstudies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val messageInEditText = binding.editText.text.toString()
            val intent = Intent(this, ReceiveIntentActivity::class.java)
            intent.putExtra("editTextViaIntent", messageInEditText)
            startActivity(intent)
        }
    }
}