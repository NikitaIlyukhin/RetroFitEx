package com.example.retrofitex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels

class MainActivity : AppCompatActivity() {
    private lateinit var work:Button
    private lateinit var error:Button
    private val viewModel by viewModels<ViewModel>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        error = findViewById(R.id.error)
        work = findViewById(R.id.work)

        error.setOnClickListener {
            println("AAA")
            viewModel.getCountryWithError()
            viewModel.listCountry.observe(this,{ list ->
                list.body()?.let { println(it) }
            })
            println(viewModel.listCountry)
        }
        work.setOnClickListener {
            println("BBB")
            viewModel.getCountry()
            viewModel.listCountry.observe(this,{ list ->
                list.body()?.let { println(it) }
            })
            println(viewModel.listCountry)
        }


    }
}