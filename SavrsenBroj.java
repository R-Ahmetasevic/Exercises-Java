package zadaci;

public class SavrsenBroj {

	public static void main(String[] args) {

		int suma = 0;
		
		for(int i=1; i<10000; i++) {
			for(int j=1; j<i; j++) {
				if(i % j == 0) {
					suma += j;
				}
			}
			if(suma == i) {
				System.out.print(i + " ");
			}
			suma = 0;
		}
	}
		
	  /*int n = 28;
		int suma = 0;
		
		for(int i=1; i<n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				suma += i;
			}
		}
		
		if(suma == n) {
			System.out.println();
			System.out.println(n + " je savrsen broj");
		}
		else {
			System.out.println();
			System.out.println(n + " nije savrsen broj");
		}*/
}
