trait Censor {
	
	def replace(words: Map[String, String], text: String):String = {
		if(words.isEmpty) return text
		replace(words.tail, text.replaceAll(words.head._1, words.head._2))	
	}


}