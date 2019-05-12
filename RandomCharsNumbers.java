package zadaci;

public class RandomCharsNumbers {

	public static void main(String[] args) {
		randomStuff();
	}
	
	public static void randomStuff() {
		int count = 0;
			for (int i=0; i<100; i++) {
				System.out.print((char) (65 + (int) (Math.random() * 26)) + " ");
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}

			for (int j = 0; j < 100; j++) {
				System.out.print((int) (Math.random() * 10) + " ");
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
	}
}
