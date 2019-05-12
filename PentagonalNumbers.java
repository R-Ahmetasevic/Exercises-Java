package zadaci;

public class PentagonalNumbers {

	public static void main(String[] args) {

		getPentagonalNumber(100);
	}
	
	public static int getPentagonalNumber(int n) {
		
		int pentagonalniBrojevi = 0;
		int poLiniji = 10;
		
		for(int i=1; i<=100; i++) {
			pentagonalniBrojevi = i *(3 * i - 1) / 2;
			System.out.print(pentagonalniBrojevi + " ");
			if(i  % poLiniji == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		return pentagonalniBrojevi;
	}
}
