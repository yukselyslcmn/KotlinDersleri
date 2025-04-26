package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1() // fonksiyonlar classına gidip sadece işlem yaptı konsola yazdırdı.

    //return  (veri transferi yoluyla geliyor)
    val gelenSonuc = f.selamla2() // fonksiyonlar classına gider veri transferi yaparak aktarır daha sonra println ile yazdırır.
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep") // run ettiğimizde selamla3 fonksyinuna gidip getirir ve çalıştırır.

    f.topla(10,20,"Beyza")
}