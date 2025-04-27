package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    //Parametro olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren bir metod yazınız. F = C x 1.8 + 32
    fun soru1(derece:Double): Double{
        val fahrenhiet = (derece*1.8)+32
        return fahrenhiet
    }
    //Kenarları parametre olarak girilen dikdörtgenin çevresini hesaplayan bir metod yazınız.
    fun soru2(kenar1: Double, kenar2: Double): Double {
        val cevre = 2 * (kenar1 + kenar2)
        return cevre
    }

    //Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren bir metod yazınız.
    fun faktoriyel(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    //Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız
    fun aHarfiSayisi(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        return sayac
    }

    //Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız.
    fun icAcilarToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    //Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınızü
    //1 günde 8 saat çalışılabilir.
    //Çalışma saat ücreti : 10 TL
    //Mesai saai ücreti : 20 TL
    //160 saat üzeri mesai sayılır.
    fun maasHesapla(gunSayisi: Int): Int {
        val saatlikUcret = 10
        val mesaiSaatlikUcret = 20
        val normalCalismaSaati = gunSayisi * 8

        return if (normalCalismaSaati <= 160) {
            normalCalismaSaati * saatlikUcret
        } else {
            val mesaiSaati = normalCalismaSaati - 160
            (160 * saatlikUcret) + (mesaiSaati * mesaiSaatlikUcret)
        }
    }

    //Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
    //50 GB = 100 TL
    //Kota aşımından sonra her 1 GB, 4 TL
    fun ucretHesapla(kota: Int): Int {
        val sabitUcret = 100
        val kotaLimiti = 50
        val asimUcreti = 4

        return if (kota <= kotaLimiti) {
            sabitUcret
        } else {
            val asimMiktari = kota - kotaLimiti
            sabitUcret + (asimMiktari * asimUcreti)
        }
    }











}