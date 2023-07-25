fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun main(args: Array<String>) {
	var num = 8
	when{
		isOdd(num) ->println("Impar")
		isEven(num) -> println("Par")
		else -> println("Nem par nem impar")
	}
}
