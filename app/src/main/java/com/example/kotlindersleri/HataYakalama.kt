package com.example.kotlindersleri

fun main() {
    //1.Compile Error : Kodlama yaparken oluşur.
    val sayi = 100
    //sayi = 500

    //2.Runtime Eroor (Exceptions) -> run edince çalışma sırasında çöker
    val x = 10
    val y = 0 // sıfıra bölünmez. o yuzden program çökmemesi için try catch yapıyoruz.

    try{
        println("Sonuç : ${x/y}")
        println("İşlem Tamamlandı")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz.")
    }

}