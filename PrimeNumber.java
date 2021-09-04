package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 13;
		boolean flag;
		

		for (int i = 2; i <= input / 2; i++)
		{
			if (input % 2 == 0) 
			{
				flag = true;
				
				break;
			}

		}
		if (flag =true) 
		{
			System.out.println("this is not prime number");
		}
		else
		{
			System.out.println("this is  prime number");
		}

	}

}
