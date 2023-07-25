
import java.io.File

fun main() {
    var count = 0
    
    val lineList = mutableListOf<String>()
    File("teste.txt").useLines { lines -> lines.forEach { lineList.add(it) }}

    for (i in 1 until lineList.size) {
        if (lineList[i] > lineList[i - 1]) {
            count++
        }
    }
    println("Número de medidas maiores que a medida anterior: $count")
}
