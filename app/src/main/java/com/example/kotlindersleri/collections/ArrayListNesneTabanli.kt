package com.example.kotlindersleri.collections

fun main() {
    val f1 = Filmler(1, "Baba Oğlum", 50)
    val f2 = Filmler(1, "Neşeli Hayatlar", 30)
    val f3 = Filmler(1, "Kış Uykusu", 80)

    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi){
        println("${film.id} : ${film.ad} ${film.fiyat}TL")
    }

    //Sıralama - Sorting
    println("----- Fiyata Göre Artan -----")
    //Ascend - ASC
    val siralama1 = filmlerListesi.sortedWith(compareBy { it.fiyat})
    for(film in siralama1){
        println("${film.id} : ${film.ad} ${film.fiyat}TL")
    }

    println("----- Fiyata Göre Azalan -----")
    //DESC
    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat})
    for(film in siralama2){
        println("${film.id} : ${film.ad} ${film.fiyat}TL")
    }

    //Filtreleme
    println("----- Filtreleme 1 -----")
    val f1treleme1 = filmlerListesi.filter { it.fiyat > 50 }
    for(film in f1treleme1) {
        println("${film.id} : ${film.ad} ${film.fiyat}TL")
    }

    println("----- Filtreleme 2 -----")
    val f1treleme2 = filmlerListesi.filter { it.ad.contains("at") }
    for(film in f1treleme2) {
        println("${film.id} : ${film.ad} ${film.fiyat}TL")
    }





}