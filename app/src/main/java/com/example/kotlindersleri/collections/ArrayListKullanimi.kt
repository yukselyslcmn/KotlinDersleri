package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri ekleme : en sonuna ekleme yapar.
    meyveler.add("Elma")//0. index
    meyveler.add("Muz")//1. index
    meyveler.add("Kiraz")//2. index
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert : İstediğimiz bir indexe ekleme yapar.
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma
    val m = meyveler.get(3)
    println(m)
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")

    meyveler.reverse()
    println(meyveler)

    for(meyve in meyveler){
    println("Sonuç : $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift : enumarated
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(1)//Elma silindi
    println(meyveler)

    meyveler.clear()
    println(meyveler)



}