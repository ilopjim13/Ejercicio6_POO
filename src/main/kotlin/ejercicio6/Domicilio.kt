package ejercicio6

/** * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio(var calle: String, var numero: Int) {
    fun dirCompleta() = "$calle $numero"
}