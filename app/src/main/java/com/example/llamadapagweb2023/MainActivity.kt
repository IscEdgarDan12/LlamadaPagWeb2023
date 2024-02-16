package com.example.llamadapagweb2023

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //boton de Llamada
        var miBotonLlamar : Button = findViewById(R.id.btnLlamar)
        miBotonLlamar.setOnClickListener(){
            val intentLlamar = Intent(Intent.ACTION_DIAL).apply{
                data = Uri.parse("tel:7331529198")
            }
            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intentLlamar)
            }
        }
        //boton de págian web
        val miBotonPaginaWeb: Button = findViewById(R.id.btnWeb)
        miBotonPaginaWeb.setOnClickListener {
            val intentWeb: Intent = Intent(this, Activity_Web::class.java)
            startActivity(intentWeb)
        }


    }
    
}