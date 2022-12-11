package problem3;

public class Pawn extends Piece {
	private Position a;
	private Position b;
	
	public Pawn(Position a, Position b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean isLegalMove() {
		if(a.getY()+ 1==b.getY() & a.getX()==b.getX()) return true;
		return false;
	}

}
