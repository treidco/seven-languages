class Board(board: String) {
	
	val possibilities = List((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(0,4,6))

	def checkForWinner(){
		var result = false
		possibilities.foreach{
			t => 
			if(result == false){
				result = check(List(board.charAt(t._1), board.charAt(t._2), board.charAt(t._3)))
			}
		}
		if(result == false){println("There was no winner")}
	}

	def check(possibility: List[Char]):Boolean = {
		if(possibility.count(a => a == 'x') == 3 || possibility.count(a => a == 'o') == 3){
			println("There was a winner!! => " + possibility(0))
			true
		}
		else{
			false
		}
	}

}