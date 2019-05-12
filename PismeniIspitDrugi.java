package zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class PismeniIspitDrugi {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza:");
		int duzina = scn.nextInt();
		scn.nextLine();
		
		String[] nizRijeci = new String[duzina];
		int[] brojSlova = new int[100];
		int[] nizBrojeva = new int[duzina];
		int[] tacnoBrojevi = new int[duzina];
		int[] rez = new int[duzina];
		
		System.out.println("Unesite " + duzina + " stringa:");
		for(int i=0; i<nizRijeci.length; i++) {
			nizRijeci[i] = scn.nextLine();
			nizRijeci[i] = nizRijeci[i].replaceAll("\\W", "");
		}
		
		for(int i=0; i<nizRijeci.length; i++) {
			  char[] svakoSlovoUNizu = nizRijeci[i].toCharArray();
			  for(int j=0; j<svakoSlovoUNizu.length; j++) {
				  if(Character.isUpperCase(svakoSlovoUNizu[j])) {
					  brojSlova[i]++;
				  }
			  }
		}
		
		
		 System.out.println();
			System.out.println("Broj velikih slova svake rijeci:");
			for(int i=0; i<brojSlova.length; i++) {
				if(brojSlova[i] != 0) {
					System.out.println(brojSlova[i]);
				}
			}
			
			/*for(int i=0; i<brojSlova.length; i++) {
				for(int j=i+1; j<brojSlova.length; j++) {
					if(brojSlova[i] > brojSlova[j]) {
						int temp = brojSlova[i];
						brojSlova[i] = brojSlova[j];
						brojSlova[j] = temp;
					}
				}
			}*/
			
			int duzinaStr = brojSlova.length;
            
	        for (int i=0; i<duzinaStr; i++) 
	        {
	            for (int j=i+1; j<duzinaStr; j++)
	            {
	                 if(brojSlova[i] == brojSlova[j])
	                 {                    
	                	 brojSlova[j] = brojSlova[duzinaStr-1];                                      
	                	duzinaStr--;                                        
	                    j--;
	                }
	            }
	        }
	        int[] unikati = Arrays.copyOf(brojSlova, duzinaStr);
	        
	        
			
	        for(int i=0; i<unikati.length; i++) {
	        	nizBrojeva[i] = unikati[i];
	        }
		
		System.out.println();
		System.out.println("Rijeci cija se duzina podudara sa random brojevima:");
		for(int i=0; i<unikati.length; i++) {
			for(int j=0; j<nizBrojeva.length; j++) {
				if(nizBrojeva[i] == brojSlova[j]) {
					System.out.println(nizRijeci[i]);
				}
			}
		}
	    
	    
	    	
	    	
	    
		
		
		
		
		
		scn.close();
	}
}
