package com.example.customtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var btn_clickMe : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_clickMe = findViewById(R.id.btn_clickMe)
        var layoutInflater : LayoutInflater = layoutInflater

        var viewLay = layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.custom_toast))

        btn_clickMe?.setOnClickListener(View.OnClickListener {
            var custom_toast = Toast.makeText(this,"Toast.Gravity.Top",Toast.LENGTH_SHORT)
            custom_toast.setGravity(Gravity.BOTTOM,0,0)
            custom_toast.view = viewLay
            custom_toast.show()
        })

    }
}
