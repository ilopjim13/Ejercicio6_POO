fun main() {

    val repositorio = RepositorioCompras()

    repositorio.agregarCompra(Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 5, 12780.78))
    repositorio.agregarCompra(Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 699.0))
    repositorio.agregarCompra(Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 7, 532.90))
    repositorio.agregarCompra(Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha", 761)), 12, 5715.99))
    repositorio.agregarCompra(Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 958.0))


    val domicilios = repositorio.domicilios()

    println(domicilios.joinToString(", "))
}