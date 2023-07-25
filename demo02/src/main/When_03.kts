fun main(){

    var age = 16

    when(age) {
        in 1..17 -> {
            val num = 18 - age
            println("Voce podera votar em $num anos")
        }
        in 18..100 -> println("você já pode votar")
    }
}