/**
 * Clase RepositorioCompras
 * @constructor Crea un repositorio de compras
 */
class RepositorioCompras() {

    var listaCompras = mutableListOf<Compra>()

    fun agregarCompra(compra:Compra) {
        listaCompras.add(compra)
    }

    fun domicilios() {
        return
    }
}