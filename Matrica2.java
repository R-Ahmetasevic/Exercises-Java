package zadaci;

public class Matrica2 {

	public static void main(String[] args) {

		int[][] niz = new int[3][3];
	
		for(int kolona=0; kolona<niz[0].length; kolona++) {
			int suma = 0;
			for(int red=0; red<niz.length; red++) {
				niz[red][kolona] = (int) (1 + Math.random() * 9);
				System.out.print(niz[red][kolona] + " ");
				suma += niz[red][kolona];
			}
			System.out.println();
			System.out.println("Zbir za kolonu " + kolona + " je " + suma);
		}
	}
}
