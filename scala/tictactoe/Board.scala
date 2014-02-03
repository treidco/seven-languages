class Board(board: String) {
	
	val possibilities = List((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(0,4,6))

	def checkForWinner(){
		var result = false
		possibilities.foreach{
			x => 
			if(result == false){
				result = routine(getNextPossibility(x))
			}
		}
		if(result == false){println("There was no winner")}
	}

	def getNextPossibility(t: (Int, Int, Int)):List[Char] = {
		List(board.charAt(t._1), board.charAt(t._2), board.charAt(t._3))
	}

	def routine(possibility: List[Char]):Boolean = {
		if(possibility.count(a => a == 'x') == 3 || possibility.count(a => a == 'y') == 3){
			println("There was a winner!! => " + possibility(0))
			true
		}
		else{
			false
		}
	}

}