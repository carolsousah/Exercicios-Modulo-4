package com.example.exerciciosm4

class Ex2B {
}

fun main() {
    val namesList = listOf("Charlotte", "Carol", "Gabi", "Bruna")
    namesList.map{"Olá $it"}.forEach{println(it)}
}