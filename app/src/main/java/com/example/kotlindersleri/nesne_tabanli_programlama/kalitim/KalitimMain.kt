package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val köpek = Köpek()

    hayvan.sesCikar()//kalıtım yok, kendi metoduna erişti.
    memeli.sesCikar()//kalıtım var, bir üst sınıfın metoduna erişti.
    kedi.sesCikar()//kalıtım var, kendi metoduna erişti.
    köpek.sesCikar()//kalıtım var, kendi metoduna erişti.

}