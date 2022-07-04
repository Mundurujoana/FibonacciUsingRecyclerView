package dev.mundu.fibonacciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mundu.fibonacciapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

  fibonacci()
    }

    private fun fibonacci() {
        val end = 100
        var start= 0
        var next = 1
        print("First $end terms: ")
        var numbers = mutableListOf<Int>()
        for (i in 1..end) {
            print("$start + ")
          numbers.add(start)
            val sum = start + next
            start = next
            next = sum
        }

        var numAdapter = NumberRecyclerViewAdapter(numbers)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numAdapter

    }


}