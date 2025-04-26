package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carp 2//(2)
    println(sonuc)
}

infix fun Int.carp(sayi:Int) : Int { // main dışında yazılınca heryerden ulaşabilmek için yoksa her yerden ulaşamayız.
    return this * sayi//this(Int) // istediğimiz sınıfı extension olarak ekleyebiliriz.
}