package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val joao = Analista(nome = "João Santana", cpf = "1234567899", salario = 3000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

