package com.yusufkumandaveren.whenilehesapmakinesi

class Islemler {

    fun toplama(){
        println("ilk degeri giriniz:")
        val x = readLine()!!.toIntOrNull()
        println("ikinci degeri giriniz:")
        val y = readLine()!!.toIntOrNull()
        val toplama = x!!+ y!!
        println("Sonuc: $toplama")
    }
    fun cikarma(){
        println("ilk degeri giriniz:")
        val x = readLine()!!.toIntOrNull()
        println("ikinci degeri giriniz:")
        val y = readLine()!!.toIntOrNull()
        val cikarma = x!!-y!!
        println("Sonuc: $cikarma")

    }
    fun carpma(){
        println("ilk degeri giriniz:")
        val x = readLine()!!.toIntOrNull()
        println("ikinci degeri giriniz:")
        val y = readLine()!!.toIntOrNull()
        val carpma = x!! * y!!
        println("Sonuc: $carpma")
    }
    fun bolme(){
        println("ilk degeri giriniz:")
        val x = readLine()!!.toIntOrNull()
        println("ikinci degeri giriniz:")
        val y = readLine()!!.toIntOrNull()
        val bolme = (x!!/y!!).toDouble()
        println("Sonuc: $bolme")
    }
}