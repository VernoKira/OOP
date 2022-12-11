package problem3;

public class Test {
		public static void main(String[] args) {
			Position pos1 = new Position(4,4);
			Position pos2 = new Position(5,5);
			Rook r = new Rook(pos1, pos2);
			King k = new King(pos1, pos2);
			Bishop b = new Bishop(pos1, pos2);
			Queen q = new Queen(pos1, pos2);
			Knight kng = new Knight(pos1, pos2);
			Pawn p = new Pawn(pos1, pos2);
			System.out.println(r.isLegalMove());
			System.out.println(k.isLegalMove());
			System.out.println(b.isLegalMove());
			System.out.println(q.isLegalMove());
			System.out.println(kng.isLegalMove());
			System.out.println(p.isLegalMove());
			
		}

	}
