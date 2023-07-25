fun main() {
    val number = 0
	var result = when(number) {
		0 -> "Invalid number"
		1 -> "Number correct"
		throw IllegalArgumentException("Invalid number") -> "Unreachable code"
		else -> "Everything is normal" 
	}
    println(result)
}