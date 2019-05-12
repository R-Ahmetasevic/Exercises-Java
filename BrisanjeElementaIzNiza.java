package zadaci;

public class BrisanjeElementaIzNiza {

	public static void main(String[] args) {

		int[] niz = {5, 2, 4, 11, 1, 32, 49};
		
		int[] noviNiz = new int[niz.length - 1];
		
		int index = 2;
		
		System.out.println("Originalni niz:");
		for(int i=0; i<niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		
		for(int i=0, k=0; i<niz.length; i++) {
			if(i == index) {
				continue;
			}
			noviNiz[k++] = niz[i];
		}
		
		System.out.println();
		System.out.println("Niz nakon izbacivanja elementa sa indeksom " + index + ":");
		for(int i=0; i<noviNiz.length; i++) {
			System.out.print(noviNiz[i] + " ");
		}
		
		
		
		
		
		
	}

}
