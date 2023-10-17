package com.example.myapplication

sealed class CalculatorEvent {
    data class Number (val number: Int): CalculatorEvent()
    object Clear: CalculatorEvent()
    object Delete: CalculatorEvent()
    object Decimal: CalculatorEvent()
    object Calculate: CalculatorEvent()
    data class Operation(val operation: CalculatorOperation): CalculatorEvent()
}