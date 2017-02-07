import java.util.Arrays;
import java.util.Comparator;

public class SummerState {

	private int getRandomSalaries(int min, int max) {
		double random = Math.random();

		return (int) (Math.floor(random * (max - min)) + min);
	}

	private int[][] salaries;

	public SummerState(int peopleCount, int yearCount) {

		this.salaries = new int[peopleCount][yearCount];
		for (int i = 0; i < peopleCount; i++) {
			for (int j = 0; j < yearCount; j++) {
				this.salaries[i][j] = this.getRandomSalaries(3000, 10000);
			}
		}

	}

	private int getArraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int getHighestSalaryPersonIndex() {
		if (this.salaries.length < 1) {
			return -1;
		}
		int index = 0;
		int maxSum = this.getArraySum(this.salaries[0]);
		for (int i = 1; i < this.salaries.length; i++) {
			int sum = this.getArraySum(this.salaries[i]);
			if (sum > maxSum) {
				index = i;
				maxSum = sum;
			}
		}
		return index;
	}

	public int getHighestSalaryYearIndex() {
		if (this.salaries.length < 1) {
			return -1;
		}
		int index = 0;
		int maxSum = 0;
		int yearCount = this.salaries[0].length;
		for (int i = 0; i < yearCount; i++) {
			int sum = 0;
			for (int j = 0; j < this.salaries.length; j++) {
				sum += this.salaries[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		return index;
	}

	public int getPersonTotalSalary(int index) {
		if (index >= this.salaries.length) {
			return -1;
		}
		return this.getArraySum(this.salaries[index]);
	}

	public int getTotalSalaryByYear(int index) {
		if (this.salaries.length < 1 || index >= this.salaries[0].length) {
			return -1;
		}

		int yearCount = this.salaries[0].length;
		int sum = 0;
		for (int i = 0; i < yearCount; i++) {
			sum += this.salaries[i][index];
		}

		return sum;
	}

	public int getHighestPaidPersonIndexByYear(int yearIndex) {
		if (this.salaries.length < 1 || yearIndex >= this.salaries[0].length) {
			return -1;
		}

		int personIndex = 0;
		int maxSalary = this.salaries[0][yearIndex];

		for (int i = 0; i < this.salaries.length; i++) {
			if (maxSalary < this.salaries[i][yearIndex]) {
				personIndex = i;
				maxSalary = this.salaries[i][yearIndex];
			}
		}

		return personIndex;

	}

	private double getArrayAverage(int[] arr) {
		return new Double(this.getArraySum(arr)) / arr.length;

	}

	public double[] getAverageSalaries() {
		if (this.salaries.length < 1) {
			return null;
		}

		int rowCount = this.salaries.length;
		double[] averageSalaries = new double[rowCount];

		for (int i = 0; i < rowCount; i++) {
			averageSalaries[i] = this.getArrayAverage(this.salaries[i]);
		}

		return averageSalaries;
	}

	public void sortBySalary() {
		Arrays.sort(this.salaries, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return getArraySum(o1) - getArraySum(o2);
			}

		});
	}

	public int[][] getSalaries() {
		return salaries;
	}

	public void setSalaries(int[][] salaries) {
		this.salaries = salaries;
	}

}
