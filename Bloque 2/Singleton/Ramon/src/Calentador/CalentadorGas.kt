package Calentador
import java.util.Scanner
import TempHabitacion.TempHabitacion

class CalentadorGas : Calentador {
    var input: Scanner = Scanner(System.`in`)

    override fun ajustarTemp(tempActual: TempHabitacion) {
        var continuar = true

        while(continuar){
            println("""
                
                (i) Selecciona una opción:
                
                1. Aumentar la temperatura (+2° C)
                2. Atrás
                
                
            """.trimIndent())

            var opcion: Int = input.nextInt()

            when(opcion){
                1 -> {
                    tempActual.setTempActual(tempActual.getTempActual() + 2)
                    println("""
                        .:: Temperatura aumentada: +2° C
                        --------------------------------
                        Temp. Actual: ${tempActual.getTempActual()}
                    """.trimIndent())
                }
                2 -> {
                    println("Regresando al menú principal...")
                    continuar = false
                }
                else -> println("Opción inválida")
            }
        }
    }
}