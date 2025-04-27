package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

open class Hayvan {
    open fun sesCikar(){ // başına open eklersek diğer sınıflarda kullanabiliriz.
        println("Ses Çıkar")
    }
}