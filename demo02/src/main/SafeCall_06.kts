fun main() {
   val listaComNulos: List<String?> = listOf("Kotlin",null)

   for (item in listaComNulos) {
       item?.let {println(it)}
   }
}