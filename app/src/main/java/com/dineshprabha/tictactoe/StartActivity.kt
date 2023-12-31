package com.dineshprabha.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dineshprabha.tictactoe.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}