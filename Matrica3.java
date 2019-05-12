package zadaci;

public class Matrica3 {

	public static void main(String[] args) {

		int[][] niz = new int[3][3];
		
		int najveciRed = 0;
		int indeksNajvecegReda = 0;
		
		for(int red=0; red<niz.length; red++) {
			for(int kolona=0; kolona<niz[0].length; kolona++) {
				niz[red][kolona] = (int) (1 + Math.random() * 9);
				System.out.print(niz[red][kolona] + " ");
			}
			System.out.println();
		}
		
		for(int kolona=0; kolona<niz[0].length; kolona++) {
			najveciRed += niz[0][kolona];
		}
		
		for(int red=1; red<niz.length; red++) {
			int zbirOvogReda = 0;
			
			for(int kolona=0; kolona<niz[0].length; kolona++) {
				zbirOvogReda += niz[red][kolona];
			}
			
			if(zbirOvogReda > najveciRed) {
				najveciRed = zbirOvogReda;
				indeksNajvecegReda = red;
			}
		}
		
		System.out.println("Red " + indeksNajvecegReda + " ima najveci zbir: "
				+ najveciRed);
	}
}
