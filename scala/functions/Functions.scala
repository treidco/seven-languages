class Functions {
	val strings = List("hello", "there", "how", "are", "you")
	val foldLeftFun = (0 /: strings) {(sum, i) => sum + i.length}
}
