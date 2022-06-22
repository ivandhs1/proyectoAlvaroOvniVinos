package com.ivan.conexionbasededatos

import android.content.Intent
import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class registrar : AppCompatActivity() {

    lateinit var email: TextView
    lateinit var password: TextView
    lateinit var celular: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        var button: Button =findViewById(R.id.btnRegistrar)
        button.setOnClickListener{registrar()}

    }

    fun login(view: View) {
        var miIntent: Intent = Intent(this, login::class.java)
        startActivity(miIntent)
    }

    private fun registrar() {

        Toast.makeText(this, "entro",Toast.LENGTH_SHORT).show()

        val db = Firebase.firestore


        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        celular = findViewById(R.id.celular)


        val user = hashMapOf(
            "email" to email.toString(),
            "password" to password.toString(),
            "celular" to celular.toString()
        )

        db.collection("users").document(email.toString())
            .set(user)
            .addOnSuccessListener { _ ->
                Log.d(TAG, "DocumentSnapshot added with ID:")
            }
            .addOnFailureListener { _ ->
                Log.w(TAG, "Error adding document")
            }
    }

}


class User {

    var emailUser = ""
    var passwordUser = ""
    var celularUser = ""

    constructor()

    constructor(emailUser: String, passwordUser: String, celularUser: String) {
        this.emailUser = emailUser
        this.passwordUser = passwordUser
        this.celularUser = celularUser

    }

}