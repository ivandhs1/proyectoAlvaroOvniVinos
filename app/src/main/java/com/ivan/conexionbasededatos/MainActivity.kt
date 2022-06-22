package com.ivan.conexionbasededatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnLogin(view: View) {
        var miIntent: Intent = Intent(this,login::class.java)
        startActivity(miIntent)
    }

}