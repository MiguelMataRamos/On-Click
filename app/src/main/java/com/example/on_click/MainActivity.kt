package com.example.on_click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button);
        val texto = findViewById<TextView>(R.id.textView);
        val texto2 = findViewById<TextView>(R.id.textView2);
        var cont = 0;

        boton.setOnClickListener {
            cont ++;
            boton.text = "Has hecho click $cont veces";

            if (cont == 11){
                boton.visibility = Button.INVISIBLE;
                texto2.visibility = TextView.VISIBLE;
                texto.text = "¡¡¡¡¡FELICIDADES!!!!!";
                texto.textSize = 40f;

            }

        }



    }
}