
import java.io.File


fun countIncreasingDepths(depths: List<Int>): Int {
    var count = 0
    
    val depths = mutableListOf<String>()
    File("teste.txt").useLines { lines -> lines.forEach { depths.add(it) }}
    for (i in 1 until depths.size) {
        if (depths[i] > depths[i - 1]) {
            count++
        }
    }
    
    return count
}

fun main() {
    val depths = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    val increasingCount = countIncreasingDepths(depths)
    println("Número de medidas maiores que a medida anterior: $increasingCount")
}
