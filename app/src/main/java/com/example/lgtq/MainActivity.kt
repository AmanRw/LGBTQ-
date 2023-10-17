package com.example.lgtq

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import kotlin.random.Random

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val colors = intArrayOf(
        R.color.coral,
        R.color.aqua,
        R.color.lime,
        R.color.olive,
        Color.CYAN,
        Color.WHITE
    )


    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val linearlayout = findViewById<LinearLayout>(R.id.Linearlayout)
        val linearlayout1 = findViewById<LinearLayout>(R.id.Linearlayout1)
        val go = findViewById<Button>(R.id.button)

        button1.setOnClickListener {
            linearlayout.setBackgroundColor(resources.getColor(R.color.coral))
            button1.elevation = 16f
            button2.elevation = 0f
            button3.elevation = 0f
            button4.elevation = 0f
            button5.elevation = 0f
            go.elevation = 0f
        }
        button2.setOnClickListener {
            linearlayout.setBackgroundColor(resources.getColor(R.color.salmon))
            button1.elevation = 0f
            button2.elevation = 16f
            button3.elevation = 0f
            button4.elevation = 0f
            button5.elevation = 0f
            go.elevation = 0f
        }
        button3.setOnClickListener {
            linearlayout.setBackgroundColor(resources.getColor(R.color.yellow))
            button1.elevation = 0f
            button2.elevation = 0f
            button3.elevation = 16f
            button4.elevation = 0f
            button5.elevation = 0f
            go.elevation = 0f
        }
        button4.setOnClickListener {
            linearlayout.setBackgroundColor(resources.getColor(R.color.green))
            button1.elevation = 0f
            button2.elevation = 0f
            button3.elevation = 0f
            button4.elevation = 16f
            button5.elevation = 0f
            go.elevation = 0f
        }
        button5.setOnClickListener {
            linearlayout.setBackgroundColor(resources.getColor(R.color.voilet))
            button1.elevation = 0f
            button2.elevation = 0f
            button3.elevation = 0f
            button4.elevation = 0f
            button5.elevation = 16f
            go.elevation = 0f
        }

        go.setOnClickListener {
            val randomColor = colors[Random.nextInt(colors.size)]
            linearlayout.setBackgroundColor(randomColor)
            button1.elevation = 0f
            button2.elevation = 0f
            button3.elevation = 0f
            button4.elevation = 0f
            button5.elevation = 0f
            linearlayout1.elevation = 16f
        }

    }
}