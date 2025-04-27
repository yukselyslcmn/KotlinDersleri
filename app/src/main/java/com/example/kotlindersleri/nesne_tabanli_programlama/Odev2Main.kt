package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val o2 = Odev2()

    val derece = 25.0
    val fahrenheit = o2.soru1(derece)
    println("$derece °C = $fahrenheit °C fahrenheit")

    val sonuc = o2.soru2(20.0,10.0)
    println("Dikdortgenin çevresi : $sonuc cm")

    println("5! = ${o2.faktoriyel(5)}")

    val aHarfiSayisiSonuc = o2.aHarfiSayisi("Merhaba Ankara")
    println("a harfi sayısı : $aHarfiSayisiSonuc")

    val gelenSonuc = o2.icAcilarToplami(5)
    println("İç açılar toplamı : $gelenSonuc")

    println("20 gün çalışınca mesaisiz maaş = ${o2.maasHesapla(20)}")
    println("22 gün çalışınca mesaili maaş = ${o2.maasHesapla(22)}")

    println("40 GB internet fiyatı = ${o2.ucretHesapla(40)}")
    println("60 GB internet fiyatı = ${o2.ucretHesapla(60)}")
















}