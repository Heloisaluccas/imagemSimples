package com.example.imagemsimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ivavatar = findViewById<ImageView>(R.id.ivavatar)
        var btalterar = findViewById<Button>(R.id.btnAlterar)

        var numImagem = 1

        btalterar.setOnClickListener {
            if (numImagem == 1){
                ivavatar.setImageResource(R.drawable.mulher)
                numImagem = 2
            }else{
                ivavatar.setImageResource(R.drawable.homem)
                numImagem = 1
            }
        }
    }
}