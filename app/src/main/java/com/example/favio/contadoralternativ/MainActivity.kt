package com.example.favio.contadoralternativ

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var entradaUsuario: EditText? = null
    private var boton:Button?=null
    private var texto:TextView?=null

    var contadorNuevo = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById<Button>(R.id.botoncito)
        entradaUsuario = findViewById<EditText>(R.id.editText)
        texto = findViewById<TextView>(R.id.textView)

        boton?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {
                var nombre = entradaUsuario!!.getText().toString()
                contadorNuevo +=1

                if(contadorNuevo>=2) {
                    texto?.append("\n\r"+"El usuario: "+nombre+"!! ha clickeado $contadorNuevo veces")
                }else{
                    texto?.append("\n\r"+"El usuario: "+nombre+"!! ha clickeado $contadorNuevo vez")}
                if (contadorNuevo==10)
                Toast.makeText(this@MainActivity,"El boton se ha clickeado 10 veces",Toast.LENGTH_SHORT).show()


            }

        })

    }

    private fun avisoEmergente(view:View){

        Toast.makeText(this,"se boton se ha clickeado 10 veces",Toast.LENGTH_SHORT).show()
    }
}
