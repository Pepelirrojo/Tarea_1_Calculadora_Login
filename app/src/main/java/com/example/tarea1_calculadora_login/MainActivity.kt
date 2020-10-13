package com.example.tarea1_calculadora_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtNombre : TextView
    lateinit var txtApellido : TextView
    lateinit var btnEntrar : Button
    lateinit var btnSalir : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombre = findViewById(R.id.txtName)
        txtApellido = findViewById(R.id.txtSurname)
        btnEntrar = findViewById(R.id.btnEntrar)
        btnSalir = findViewById(R.id.btnSalir)
        btnSalir.setOnClickListener { finish() }
        btnEntrar.setOnClickListener { entrar() }
    }
    fun entrar(){
        var name = txtNombre.text.toString()
        var surname = txtApellido.text.toString()
        var miIntent = Intent(this, MainActivity2::class.java)
        miIntent.putExtra("nombre", name)
        miIntent.putExtra("apellido", surname)
        startActivity(miIntent)
    }
}