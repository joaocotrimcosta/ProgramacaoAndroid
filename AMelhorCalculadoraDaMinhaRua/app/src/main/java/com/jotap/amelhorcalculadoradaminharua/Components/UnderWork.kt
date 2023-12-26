package com.jotap.amelhorcalculadoradaminharua.Components


sealed class LetsMath {
    data class Number(val number: Int) : LetsMath()
    object AC : LetsMath()
    object delete : LetsMath()
    object Decimal : LetsMath()
    object Calculo : LetsMath()
    data class Calcular(val operacao: LetsMath) : LetsMath()

}