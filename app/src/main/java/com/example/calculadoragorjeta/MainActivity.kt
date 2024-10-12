package com.example.calculadoragorjeta

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadoragorjeta.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        var percentage: Int = 0
        
        binding.rbTen.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 10
            }
        }

        binding.rbFifteen.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 15
            }
        }

        binding.rbTwenty.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                percentage = 20
            }
        }

        binding.btnClean.setOnClickListener {
            binding.tvResult.text = ""
            binding.total.setText ("")
            binding.people.setText ("")
            binding.rbTen.isChecked = false
            binding.rbFifteen.isChecked = false
            binding.rbTwenty.isChecked = false
        }

        binding.btnCalculate.setOnClickListener {

            val Pricetemp = binding.total.text
            val Peopletemp = binding.people.text

            if (Pricetemp?.isEmpty() == true ||
                Peopletemp?.isEmpty() == true) {

                Snackbar.make(binding.total, "Preencha todos os campos", Snackbar.LENGTH_LONG)
                    .show()

            } else {
                val Totalprice: Float = Pricetemp.toString().toFloat()
                val People: Int = Peopletemp.toString().toInt()

                val Totaltemp = Totalprice / People
                val Tips = Totaltemp * percentage / 100
                val Total = Totaltemp + Tips
                binding.tvResult.text = "$Total"
            }
        }
    }
}