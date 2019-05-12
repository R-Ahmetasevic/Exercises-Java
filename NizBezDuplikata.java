package zadaci;

import java.util.Arrays;

public class NizBezDuplikata {

	public static void main(String[] args) {
		
		int[] niz = {0, 5, 1, 4, 1, 9, 5, 4, 0};
		int duzina = niz.length;
                
        for (int i=0; i<duzina; i++) 
        {
            for (int j=i+1; j<duzina; j++)
            {
                 if(niz[i] == niz[j])
                 {                    
                	niz[j] = niz[duzina-1];                                      
                	duzina--;                                        
                    j--;
                }
            }
        }
        int[] unikati = Arrays.copyOf(niz, duzina);
        
        System.out.println("Niz bez duplikata:");        
        for (int i=0; i<unikati.length; i++)
        {
        	for(int j=i; j<unikati.length; j++) {
        		if(niz[i] > niz[j]) {
        			int temp = niz[i];
        			niz[i] = niz[j];
        			niz[j] = temp;
        		}
        	}
        	System.out.print(niz[i] + " ");       	
        }		
	}
}
