package problem3;

public class Bishop extends Piece{
	private Position a;
	private Position b;
	
	public Bishop(Position a, Position b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean isLegalMove() {
		if(-(a.getX() + a.getY()) == b.getX() - b.getY()
				|| a.getX() - a.getY() == b.getX() - b.getY()) return true;
		return false;
	}
}
