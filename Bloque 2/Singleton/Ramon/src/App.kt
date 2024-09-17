import UI.Menu
import Calentador.*
import TempHabitacion.*
import Termometro.*
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador: CalentadorGas = CalentadorGas()
    var termometro: TermometroDigital = TermometroDigital()
    val regulador: Regulador = Regulador.getInstance()

    regulador.setMaxTemp(38.5)
    regulador.setMinTemp(17.5)
    tempActual.setTempActual(29.5)

    val menu = Menu()
    menu.mostrarMenu()
}