package UI

import Calentador.*
import TempHabitacion.*
import Termometro.*
import java.util.Scanner

class Menu {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador: CalentadorGas = CalentadorGas()
    var termometro: TermometroDigital = TermometroDigital()
    val regulador: Regulador = Regulador.getInstance()

    fun mostrarMenu(){
        var continuar = true

        while (continuar) {
            println("""
                .::Sistema de calefacción::.
                -----------------------------
                Temp, Actual: ${tempActual.getTempActual()}
                MTemp, max: ${regulador.getMaxTemp()} | Temp. Min: ${regulador.getMinTemp()}
                -----------------------------
                (i) Seleccione una opción:
                1.- Interfaz calentador
                2.- Revisar termometro
                3.- Calibrar temperatura
                0.- Salir 
                
            """.trimIndent())
            when(input.nextInt()){
                1 -> {
                    calentador.ajustarTemp(tempActual)
                }
                2 -> {
                    termometro.mostrarTemp(tempActual)
                }
                3 -> {
                    regulador.calibrarTemp(termometro, regulador.getMaxTemp(), regulador.getMinTemp(), tempActual)
                }
                0 -> {
                    println("Saliendo del sistema")
                    continuar = false
                }
                else -> {
                    println("Opción no válida, intente nuevamente")
                }

            }
        }
        input.close()
    }
}