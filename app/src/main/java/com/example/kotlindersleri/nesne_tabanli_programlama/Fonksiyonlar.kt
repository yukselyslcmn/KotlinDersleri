package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan
    fun selamla1() {//Swift -> func
        val sonuc = "Merhana Ahmet"
        println(sonuc)
    }

    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhana Ahmet"
        return sonuc
    }

    //parametre ( bu fonksiyon void ya da returndan bağımsız)
    fun selamla3(isim:String) {
        val sonuc = "Merhana $isim"
        println(sonuc)
    }

    //Overloading --> Mülakatlarda çıkar.
    //Bir sınıf içinde aynı isimde fonksiyonları tekrar kullanmak.
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplama : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double,sayi2:Double){ //parametre değişimiyle int -> double
        println("Toplama : ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Int,isim:String){ // ekleme yaptık  -> işlem yapan : beyza
        println("Toplama : ${sayi1+sayi2} - İşlem Yapan: $isim")
    }
}