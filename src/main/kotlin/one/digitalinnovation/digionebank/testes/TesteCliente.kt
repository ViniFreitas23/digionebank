package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.clienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123.13",
        clienteTipo = clienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}