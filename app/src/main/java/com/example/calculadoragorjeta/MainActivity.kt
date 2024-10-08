package com.example.calculadoragorjeta

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadoragorjeta.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        
        binding.rbTen.setOnCheckedChangeListener { _, isChecked ->

        }

        binding.rbFifteen.setOnCheckedChangeListener { _, isChecked ->

        }

        binding.rbTwenty.setOnCheckedChangeListener { _, isChecked ->

        }

        binding.btnClean.setOnClickListener {

        }

        binding.btnCalculate.setOnClickListener {

            val Total: Float = binding.total.text.toString().toFloat()
            val People: Float = binding.people.text.toString().toFloat()

        }
    }
}