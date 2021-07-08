package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.clienteTipo

fun main() {
    clienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
}