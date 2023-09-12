package com.neta.pertemuan5_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neta.pertemuan5_activity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)

        with(binding) {
            txtName.text = name
        }
    }
}