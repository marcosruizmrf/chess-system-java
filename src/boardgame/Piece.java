package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // N�o precisa inserir esse cod, pq por padr�o, qdo o objeto n�o � inserido no construtor, o java reconhece como valor nulo.
	}

	protected Board getBoard() {
		return board;
	}

	
	
	

}
