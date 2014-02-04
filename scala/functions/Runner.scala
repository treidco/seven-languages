object Runner {

	def main(args: Array[String]) {
		val f = new Functions with Censor
		println(f.foldLeftFun)

		val text = "This is shoot shoot shot darn what"
		val words = Map("shoot" -> "pucky", "darn" -> "beans")

		println(f.replace(words, text))
	}
}
