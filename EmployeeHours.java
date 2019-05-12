package zadaci;

public class EmployeeHours {

	public static void main(String[] args) {

		int[][] hours = new int[8][7];
		fillArray(hours);
		
		int[] employees = {0, 1, 2, 3, 4, 5, 6, 7};
		int[] employeeHours = new int[8];
		
		System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun");
		printArray(hours);
		System.out.println();
		for(int red=0; red<hours.length; red++) {
			int sum = 0;
			for(int kolona=0; kolona<hours[red].length; kolona++) {
				sum += hours[red][kolona];
			}
			employeeHours[red] = sum;
			System.out.println("Employee " + red + " -- " + sum + " hours.");
		}
		
		for(int red=0; red<employeeHours.length; red++) {
			for(int kolona=red; kolona<employeeHours.length; kolona++) {
				if(employeeHours[red] < employeeHours[kolona]) {
					int temp = employeeHours[red];
					employeeHours[red] = employeeHours[kolona];
					employeeHours[kolona] = temp;
					
					temp = employees[red];
					employees[red] = employees[kolona];
					employees[kolona] = temp;
				}
			}
		}

		System.out.println();
		for(int i=0; i<employeeHours.length; i++) {
			System.out.println("Employee " + employees[i] + " has worked for "
					+ employeeHours[i] + " hours");
		}
	}
	
	public static void printArray(int[][] array){
		for(int red=0; red<array.length; red++) {
			System.out.print("Employee " + red + "\t ");
			for(int kolona=0; kolona<array[red].length; kolona++) {
				System.out.print(array[red][kolona] + "\t ");
			}
			System.out.println();
		}		
	}
	
	public static void fillArray(int[][] array) {
		for(int red=0; red<array.length; red++) {
			for(int kolona=0; kolona<array[red].length; kolona++) {
				array[red][kolona] = (int) (1 + Math.random() * 9);
			}
		}
	}
}


