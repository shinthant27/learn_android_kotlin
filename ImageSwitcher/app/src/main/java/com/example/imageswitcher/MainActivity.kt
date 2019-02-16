package com.example.imageswitcher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imageSwitcher : ImageSwitcher
    lateinit var btnNext : Button
    lateinit var btnBack : Button
    lateinit var arrImage : IntArray
    var position : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSwitcher = findViewById(R.id.imageSwitcher)
        btnNext = findViewById(R.id.next)
        btnBack = findViewById(R.id.back)

        arrImage = intArrayOf(R.drawable.king1,R.drawable.king2,R.drawable.king3,R.drawable.king4,R.drawable.king5)

        imageSwitcher.setFactory {
            val imageView = ImageView(applicationContext)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView
        }

        btnBack.setOnClickListener {
            if (position>0){
                position -= 1
                imageSwitcher.setImageResource(arrImage[position])
            }
        }

        btnNext.setOnClickListener {
            if (position<arrImage.size-1){
                position += 1
                imageSwitcher.setImageResource(arrImage[position])
            }
        }

    }
}
