fun main(args: Array<String>) {
	val calculateGrade = { grade : Int ->
		when(grade) {
			in 0..40 -> "Fail"
			!is Int -> "Just a grade"
			in 41..70 -> "Pass"
			in 71..100 -> "Distinction"
			else -> false
		 }
	}
	println(calculateGrade(57)) // => Pass
}
