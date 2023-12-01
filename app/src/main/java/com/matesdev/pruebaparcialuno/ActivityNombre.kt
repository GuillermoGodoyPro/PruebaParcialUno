package com.matesdev.pruebaparcialuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityNombre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre)

        val bundle = intent.extras
        val nombre = bundle!!.getString("nombre", "")

        val listadoAlumnos = mutableListOf<Alumnos>()
        val alumnos = Alumnos(nombre, 32, " "  )
        listadoAlumnos.add(alumnos)

        // Evitar: YAGNI y SOBREINGENIERIA
        

    }

    /*
        private fun getListadoAlumnos(nombre: String?): List<String?> {

            return listOf(nombre, "Marta", "Diego", "lio")
        }

    */
}