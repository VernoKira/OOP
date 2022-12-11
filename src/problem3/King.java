package problem3;

public class King extends Piece {
	private Position a;
	private Position b;
	public King(Position a, Position b) {
		this.a = a;
		this.b = b;
	}
	public boolean isLegalMove() {
		if (a.getX() == b.getX() || a.getX() - 1 == b.getX() || a.getX() + 1 == b.getX()) {
			if (a.getY() == b.getY() || a.getY() - 1 == b.getY() || a.getY() + 1 == b.getY()) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
