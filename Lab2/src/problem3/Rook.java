package problem3;

public class Rook extends Piece{	
	private Position a;
	private Position b;
	
	public Rook(Position a, Position b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean isLegalMove() {
		if (a.getX() == b.getX() || a.getY() == b.getY()) return true;
		return false;
	}
}
