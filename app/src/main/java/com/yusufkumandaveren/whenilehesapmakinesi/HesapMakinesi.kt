package com.yusufkumandaveren.whenilehesapmakinesi

fun main() {
    val dortIslem = Islemler()
    println("1-)Toplama ")
    println("2-)Cikarma ")
    println("3-)Carpma ")
    println("4-)Bolme ")
    println("Yapılacak işlemi seçin: ")

    val secim = readLine()!!.toIntOrNull()

    when (secim){
        1->dortIslem.toplama()
        2->dortIslem.cikarma()
        3->dortIslem.carpma()
        4->dortIslem.bolme()
        else -> println("Yanlış seçim yaptınız")
    }

}