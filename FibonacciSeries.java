package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int sum;

		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 1; i < 7; i++) {
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.println(sum);
		}

	}

}
