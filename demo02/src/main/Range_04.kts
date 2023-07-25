// Função principal que é o ponto de entrada do programa
fun main() {
  // O loop 'for' itera sobre todos os números no intervalo de 5 a 15.
  // A cada iteração, 'nums' assume o valor do próximo número no intervalo.
  for (nums in 5..15) {
    // Se 'nums' for igual a 10, a instrução 'break' interrompe o loop.
    if (nums == 10) {
      break
    }
    // Imprime o valor atual de 'nums'.
    println(nums)
  }
}
