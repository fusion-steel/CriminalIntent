package com.example.criminalintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.criminalintent.databinding.ActivityCrimeBinding

class CrimeActivity : AppCompatActivity() {
    lateinit var binding: ActivityCrimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentFragment = supportFragmentManager.findFragmentById(binding.fragmentContainer.id)

        if (currentFragment == null) {
            val fragment = CrimeFragment()
            supportFragmentManager
                .beginTransaction()
                .add(binding.fragmentContainer.id, fragment)
                .commit()
        }
    }
}