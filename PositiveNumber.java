package week1.day1;

public class PositiveNumber {

	public static void main(String[] args) {
		int i = -40;
		int j;
		if (i > 0) {
			System.out.println("given number is positive");
		} else if (i == 0) {
			System.out.println("given number is zero");
		} else if (i < 0) {
			System.out.println("given number is Negative");

			j = i - (2 * i);

			System.out.println("given number coverted into Positive:  " + j);
		} else if (i < 0 && i > 0) {
			System.out.println("given number is either positive or negative");
		}
	}

}
