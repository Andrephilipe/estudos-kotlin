fun main() {
  val x = 5
    
  when (x) {
    in 1..10  -> println("x esta no range")
    is Number -> println("x is valid")
    !in 10..20 -> println("X esta fora do range")
    else -> println("x não atnde os valores")
  }
}