package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria Medina", cpf = "1234567899", salario = 6000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

