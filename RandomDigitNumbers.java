package zadaci;

public class RandomDigitNumbers {

	public static void main(String[] args) {
		int[] arr = new int[20];
		int countThreeDigits = 0;
		int countTwoDigit = 0;
		int countOneDigit = 0;
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
			
			if (arr[i] >= 0 && arr[i] < 10) {
				countOneDigit++;
			} else if (arr[i] >= 10 && arr[i] < 100) {
				countTwoDigit++;
			} else {
				countThreeDigits++;
			}
		}

		int[] oneDigitArr = new int[countOneDigit];
		int[] twoDigitArr = new int[countTwoDigit];
		int[] threeDigitArr = new int[countThreeDigits];

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num < 10) {
				int index = (oneDigitArr.length - countOneDigit);
				oneDigitArr[index] = num;
				countOneDigit--;
			} else if (num < 100) {
				int index = (twoDigitArr.length - countTwoDigit);
				twoDigitArr[index] = num;
				countTwoDigit--;
			} else {
				int index = (threeDigitArr.length - countThreeDigits);
				threeDigitArr[index] = num;
				countThreeDigits--;
			}
		}

		System.out.println("Originalni niz: ");
		print(arr);
		System.out.println("Jednocifreni niz: ");
		print(oneDigitArr);
		System.out.println("Dvocifreni niz: ");
		print(twoDigitArr);
		System.out.println("Trocifreni niz: ");
		print(threeDigitArr);
	}

	private static void print(int[] arr) {
		for (int el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println();
	}
}
