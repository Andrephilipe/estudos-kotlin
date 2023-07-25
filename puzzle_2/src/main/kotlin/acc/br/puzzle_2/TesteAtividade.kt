	
    package acc.br.puzzle_2
    import java.io.File

    fun encontrarEntradas(despesas: List<Int>, valorAlvo: Int, numEntradas: Int): Int {
        if (numEntradas < 2 || despesas.size < numEntradas) {
            return -1 // Retorna -1 se não for possível encontrar o número de entradas desejado
        }
    
        if (numEntradas == 2) {
            val map = mutableMapOf<Int, Int>()
    
            for (despesa in despesas) {
                val complemento = valorAlvo - despesa
                if (map.containsKey(complemento)) {
                    return despesa * complemento
                }
                map[despesa] = 1
            }
    
            return -1 // Retorna -1 se não encontrar as duas entradas
        }
    
        for (i in 0 until despesas.size) {
            val despesaAtual = despesas[i]
            val subEntradas = encontrarEntradas(
                despesas.subList(i + 1, despesas.size),
                valorAlvo - despesaAtual,
                numEntradas - 1
            )
            if (subEntradas != -1) {
                return despesaAtual * subEntradas
            }
        }
    
        return -1 // Retorna -1 se não encontrar as entradas
    }
	
    fun main() {
        val file = File("Puzzle_02.txt")
        val despesas = mutableListOf<Int>()
    
        file.forEachLine { line ->
            despesas.add(line.toIntOrNull() ?: 0)
        }
    
        val valorAlvo = 2020
        val numEntradas = 3
    
        val produtoEntradas = encontrarEntradas(despesas, valorAlvo, numEntradas)
        println("Produto de $numEntradas entradas: $produtoEntradas")
    }