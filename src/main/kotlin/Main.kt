package org.example

//Author: Brayron Leiva
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calculator = Calculator()

    while (true) {
        println("\nOpciones")
        println("1-Sumar")
        println("2-Restar")
        println("3-Multiplicar")
        println("4-Dividir")
        println("5-Salir")
        print("Elige una opcion: ")

        when (scanner.nextInt()) {
            1 -> {
                val (a, b) = pedirNumeros(scanner)
                println("Resultado: ${calculator.add(a, b)}")
            }
            2 -> {
                val (a, b) = pedirNumeros(scanner)
                println("Resultado: ${calculator.subtract(a, b)}")
            }
            3 -> {
                val (a, b) = pedirNumeros(scanner)
                println("Resultado: ${calculator.multiply(a, b)}")
            }
            4 -> {
                val (a, b) = pedirNumeros(scanner)
                val resultado = calculator.divide(a, b)
                println("Resultado: ${if (resultado.isNaN()) "Error: División por cero" else resultado}")
            }
            5 -> {
                break
            }
            else -> println("Opcion invalida, intenta de nuevo.")
        }
    }
}

fun pedirNumeros(scanner: Scanner): Pair<Double, Double> {
    while (true) {
        try {
            print("Ingresa el primer número: ")
            val a = scanner.nextDouble()
            print("Ingresa el segundo número: ")
            val b = scanner.nextDouble()
            return Pair(a, b)
        } catch (e: Exception) {
            println("⚠️ Error en ingreso de datos.")
            scanner.nextLine()
        }
    }
}
