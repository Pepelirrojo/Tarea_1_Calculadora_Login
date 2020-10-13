package com.example.tarea1_calculadora_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var txtNombre : TextView
    lateinit var txtApellido : TextView
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btn0 : Button
    lateinit var btnSumar : Button
    lateinit var btnRestar : Button
    lateinit var btnMultiplicar : Button
    lateinit var btnDividir : Button
    lateinit var btnBorrar : Button
    lateinit var btnResultado : Button
    lateinit var txtOperar : TextView
    var numeroString : String = ""
    var num1 : Int = 0
    var num2 : Int = 0
    var resultado : Int = 0
    var signo :String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido = findViewById(R.id.txtApellido)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnResta)
        btnMultiplicar = findViewById(R.id.btnMulti)
        btnDividir = findViewById(R.id.btnDividir)
        btnBorrar = findViewById(R.id.btnBorrar)
        btnResultado = findViewById(R.id.btnResultado)
        txtOperar = findViewById(R.id.txtOperar)
        var nombre : String = intent.getStringExtra("nombre").toString()
        var apellido : String = intent.getStringExtra("apellido").toString()
        txtNombre.text = nombre
        txtApellido.text = apellido
        btn1.setOnClickListener { escribir("1") }
        btn2.setOnClickListener { escribir("2") }
        btn3.setOnClickListener { escribir("3") }
        btn4.setOnClickListener { escribir("4") }
        btn5.setOnClickListener { escribir("5") }
        btn6.setOnClickListener { escribir("6") }
        btn7.setOnClickListener { escribir("7") }
        btn8.setOnClickListener { escribir("8") }
        btn9.setOnClickListener { escribir("9") }
        btn0.setOnClickListener { escribir("0") }
        btnBorrar.setOnClickListener { borrar() }
        btnSumar.setOnClickListener { saveNumber("+")  }
        btnRestar.setOnClickListener{ saveNumber("-") }
        btnMultiplicar.setOnClickListener { saveNumber("*") }
        btnDividir.setOnClickListener { saveNumber("/")}
        btnResultado.setOnClickListener { operar(signo) }
    }
    fun borrar(){
        this.numeroString = ""
        txtOperar.text = numeroString
    }
    fun saveNumber(simbolo : String){
        signo = simbolo
        num1 = this.numeroString.toInt()
        this.numeroString = ""
    }
    fun escribir(num : String){
        this.numeroString += num
        txtOperar.text = numeroString
    }
   fun operar(signo : String){
       num2 = this.numeroString.toInt()
       when(signo){
           "+" -> resultado = (num1 + num2)
           "-" -> resultado = (num1 - num2)
           "*" -> resultado = (num1 * num2)
           "/" -> resultado = (num1 / num2)
       }
       txtOperar.text = resultado.toString()
       num1 = resultado
       num2 = 0
       numeroString = ""
   }
}