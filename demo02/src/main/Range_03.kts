// Função principal que é o ponto de entrada do programa
fun main() {
  // Cria um array de números inteiros chamado 'nums'
  val nums = arrayOf(2, 4, 6, 8)

  // Verifica se o número 2 está presente no array 'nums' usando o operador 'in'
  // Se o número 2 estiver no array, o bloco de código dentro do 'if' será executado.
  // Se não, o bloco de código dentro do 'else' será executado.
  if (2 in nums) {
    // Imprime "... Existe!" se o número 2 estiver no array 'nums'
    println("... Existe!")
  } else {
    // Imprime "... não existe." se o número 2 não estiver no array 'nums'
    println("... não existe.")
  }
}
