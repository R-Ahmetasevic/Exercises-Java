package zadaci;

public class NizArs {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		double sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(10 + Math.random() * 90);
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		double average = sum / arr.length;
		
		System.out.println("\nAritmeticka sredina: " + average);
		int count = 0;
		for(int e: arr){
			if(e < average){
				count++;
			}
		}
		
		int[] result = new int[count];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < average){
				int index = result.length - count;
				count--;
				result[index] = arr[i];
			}
		}
		
		System.out.println("Niz brojeva manjih od aritmeticke sredine: ");
		print(result);	
	}
	
	private static void print(int[] arr) {
		for (int el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
}
