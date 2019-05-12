package zadaci;

public class KolonaSaNajvecimZbirom {

	public static void main(String[] args) {

		int[][] niz = new int[3][3];
		
		for(int i=0; i<niz.length; i++) {
			for(int j=0; j<niz[0].length; j++) {
				niz[i][j] = (int) (1 + Math.random() * 9);
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		
		int najvecaKolona = 0;
		int indeksNajveceKolone = 0;
		
		for(int i=0; i<niz.length; i++) {
			najvecaKolona += niz[i][0];
		}
		
		for(int j=1; j<niz[0].length; j++) {
			int zbir = 0;
			for(int i=0; i<niz.length; i++) {
				zbir += niz[i][j];
			}
			if(zbir > najvecaKolona) {
				najvecaKolona = zbir;
				indeksNajveceKolone = j;
			}
		}
			
		System.out.println("Kolona " + indeksNajveceKolone + " ima najveci "
				+ "zbir: " + najvecaKolona);	
		
	}
}


