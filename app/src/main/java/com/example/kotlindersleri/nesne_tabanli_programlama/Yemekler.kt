package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler(var id: Int,var ad: String,var fiyat: Int) {
    //Constructor - init fonksiyonu  (init demek başlangıç demektir.)
    //Bu sınıftan nesne oluştuğunda çalışan yapılardır constructorlar.
    init {
        println("****** Nesne Oluştu *****")
    }
    fun bilgiAl(){
        println("-----------------")
        println("Id    : ${id}")
        println("Ad    : ${ad}")
        println("Fiyat : ${fiyat}")
    }
    //this : bulunduğu sınıfı temsil eder.Swift dilinde self olarak kullanılır.
    //super : Kalıtım ile bir üst sınıfı temsil eder.


}