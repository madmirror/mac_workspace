public class Test {

	public static void printNestedArray(int[][] nestedArray) {
		for (int i = 0; i < nestedArray.length; i++) {
			System.out.print("[" + i + "]. ");
			for (int j = 0; j < nestedArray[i].length; j++) {
				System.out.print(nestedArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(double[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int peopleCount = 6;
		int yearCount = 7;
		SummerState summerState = new SummerState(peopleCount, yearCount);
		System.out.println("2 Dimensional Array Initialized:");
		printNestedArray(summerState.getSalaries());
		int highestSalaryPersonIndex = summerState
				.getHighestSalaryPersonIndex();
		System.out.println("Highest Salary Person Index is: "
				+ highestSalaryPersonIndex);

		int highestSalaryYearIndex = summerState.getHighestSalaryYearIndex();
		System.out.println("Highest Salary Year Index is: "
				+ highestSalaryYearIndex);

		for (int i = 0; i < yearCount; i++) {
			System.out.println("Highest Salary Person Index for Year " + i
					+ " is: " + summerState.getHighestPaidPersonIndexByYear(i));
		}

		double[] averageArray = summerState.getAverageSalaries();
		System.out.print("Average Salary Array is :");
		printArray(averageArray);

		summerState.sortBySalary();
		System.out.println("Sorted by Salary:");
		printNestedArray(summerState.getSalaries());

	}

}
