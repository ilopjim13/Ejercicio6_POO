/**
 * Clase RepositorioCompras
 * @constructor Crea un repositorio de compras
 */
class RepositorioCompras() {

    var listaCompras = mutableListOf<Compra>()

    /**
     * agrega una compra con todos los datos de la compra al repositorio de compras
     * @param compra :Compra compra que se va a agregar a la lista
     */
    fun agregarCompra(compra:Compra) {
        listaCompras.add(compra)
    }


    /**
     * Devuelve una lista con los domicilios sin repetir.
     * @return List<String> lista con los domicilios sin repetir
     */
    fun domicilios() :List<String> {
       return listaCompras.map {it.cliente.domicilio.dirCompleta()}.toSet().toList()
    }
}