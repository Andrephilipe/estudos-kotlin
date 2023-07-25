// Função principal que é o ponto de entrada do programa
fun main() {
    // Declara e inicializa uma variável 'x' com o valor 9
    val x = 9

    // Verifica se 'x' não está no intervalo de 0 a 7.
    // Se 'x' estiver fora do intervalo, imprime a mensagem.
    if (x !in 0..7) {
        println("Fora do range")
    }
}
