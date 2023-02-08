package practice2;
public class Pr22 {
	public static void StarTriangle(int n){
		
		for(int i=0; i<=n; i++) {
			for(int m=0; m<=i;m++) {
				System.out.print("[*]");
			}
		
		
		System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int row=5;
//		Scanner input = new Scanner (System.in);
//		row = input.nextInt();	
		 StarTriangle(row);
		
	}

}
