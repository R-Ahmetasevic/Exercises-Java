package zadaci;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {34, -2, 14, 4, 7, -52, 1, 51};
		
		for(int i=0; i<array.length; i++) {
			int trenutniNajmanji = array[i];
			int trenutniNajmanjiIndeks = i;
			for(int j=i+1; j<array.length; j++) {
				if(trenutniNajmanji > array[j]) {
					trenutniNajmanji = array[j];
					trenutniNajmanjiIndeks = j;
				}
			}
			if(trenutniNajmanjiIndeks != i) {
				array[trenutniNajmanjiIndeks] = array[i];
				array[i] = trenutniNajmanji;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}	
	}
}
