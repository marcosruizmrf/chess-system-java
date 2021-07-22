package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Não precisa inserir esse cod, pq por padrão, qdo o objeto não é inserido no construtor, o java reconhece como valor nulo.
	}

	protected Board getBoard() {
		return board;
	}

	
	
	

}
