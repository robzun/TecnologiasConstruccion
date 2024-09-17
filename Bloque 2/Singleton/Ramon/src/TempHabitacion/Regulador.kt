package TempHabitacion

import Calentador.Calentador
import Termometro.Termometro

class Regulador{
    private var maxTemp: Double = 0.0
    private var minTemp: Double = 0.0

    companion object{
        private var instance: Regulador? = null

        fun getInstance(): Regulador{
            if(instance == null){
                instance = Regulador()
            }
            return instance!!
        }
    }
    fun setMaxTemp(maxTemp: Double){
        this.maxTemp = maxTemp
    }
    fun setMinTemp(minTemp: Double){
        this.minTemp = minTemp
    }
    fun getMaxTemp(): Double{
        return maxTemp
    }
    fun getMinTemp(): Double{
        return minTemp
    }
    fun tempPromedio(maxTemp: Double, minTemp: Double): Double{
        return (maxTemp + minTemp)/2
    }
    fun calibrarTemp(termometro: Termometro, maxTemp: Double, minTemp: Double, tempActual: TempHabitacion){
        if(termometro.leerTemp(tempActual) > maxTemp || termometro.leerTemp(tempActual) < minTemp){
            println("""
                
                (!) TEMPERATURA FUERA DEL RANGO (!)
                
                Calibrando...
                Temperatura reestablecida a: ${tempPromedio(maxTemp, minTemp)}
                
            """.trimIndent())
            tempActual.setTempActual(tempPromedio(maxTemp, minTemp))
        }else {
            println("""
                
                Temperatura dentro del rango permitido, no hay nada que hacer.
                
            """.trimIndent())
        }
    }
}