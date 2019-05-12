package zadaci;

public class Matrica1 {

	public static void main(String[] args) {
		
		int[][] niz1 = {{1,3,4}, {2, 5, 6}, {3, 7, 8}};
		
		for(int red=0; red<niz1.length; red++) {
			for(int kolona=0; kolona<niz1[red].length; kolona++) {
				System.out.print(niz1[red][kolona] + " ");
			}
			System.out.println();
		}
	}
}
