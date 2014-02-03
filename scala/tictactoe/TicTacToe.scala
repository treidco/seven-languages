object TicTacToe {

	def main(args: Array[String]){
		val board = new Board(args(0))
		board.checkForWinner
	}

}

