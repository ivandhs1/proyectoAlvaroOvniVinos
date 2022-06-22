package com.ivan.conexionbasededatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun btnHome(view: View) {
        var miIntent: Intent = Intent(this,MainActivity::class.java)
        startActivity(miIntent)
    }

    fun registrarse(view: View) {
        var miIntent: Intent = Intent(this,registrar::class.java)
        startActivity(miIntent)
    }

}