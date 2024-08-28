package com.example.kotlinbtk_3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.view.View
import android.app.AlertDialog
import android.content.DialogInterface

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Context
        //activity context , app context

        //Tost mesajı
        Toast.makeText(this@MainActivity,"test",Toast.LENGTH_LONG).show()

        /*
        // Button tanımlama şekilleri

        binding.button.setOnClickListener ( object : View.OnClickListener   {
            override fun onClick(p0: View?) {
                println("test")
            }
        })


        binding.button.setOnClickListener {
            println("test")
        }
     */
    }
    fun kaydet (view:View){
        //Alert Dialog mesajı

            val alert = AlertDialog.Builder(this@MainActivity) //context
            alert.setTitle("Kaydet")  //başlığı
            alert.setMessage("Kaydetmek istediğinize emin misiniz?") //mesajı

            //Pozitif , negatif butonlar
            alert.setPositiveButton("Evet"){
                dialogInterface, i ->
                Toast.makeText(this@MainActivity,"Evet",Toast.LENGTH_LONG).show()
            }

            alert.setNegativeButton("Hayır",object:DialogInterface.OnClickListener{

                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Toast.makeText(this@MainActivity,"Hayır",Toast.LENGTH_LONG).show()
                }
            }
                )

            alert.show()  //diaologu göster

    }

}