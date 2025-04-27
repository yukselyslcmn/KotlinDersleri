package com.example.kotlindersleri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var str:String? = null
    lateinit var info:String //lateinit -> Daha sonra bu değişkene değer ataycam demek
    //lateinit sadece var ile kullanılır, val ile kullanılmaz!!çünkü val daha sonra değiştirilemez.
    var x:Int = 0
    var y:Double = 0.0
    var kontrol:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        info = "Bilgi"
    }
}