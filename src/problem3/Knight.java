package problem3;

public class Knight extends Piece {
	private Position a;
	private Position b;
	
	public Knight(Position a, Position b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean isLegalMove() {
		if (Math.pow(a.getX() - a.getY(),2) + Math.pow((b.getX() - b.getY()) ,2 ) == 5) return true;
		
		return false;
	}
}
