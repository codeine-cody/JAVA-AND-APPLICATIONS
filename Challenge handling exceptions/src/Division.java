import java.util.*;

public class Division {
	static int number1;
	static int number2;

	public static void main(String[] args) {
		
		
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");

		String holder = input.next();
		try {
			number1 = Integer.parseInt(holder);
		} catch (Exception e){
			System.out.println("input must be a Integer");
		}
		
		
		holder = input.next();
		try {
			number2 = Integer.parseInt(holder);
			
		} catch (Exception e){
			System.out.println("input must be Integer");
		}
		input.close();
		
				
		try {
			result = number1 / number2;
		} catch (ArithmeticException e) {
			System.out.println("Divisor cannot be zero");
		}
		System.out.println(number1 + " / " + number2 + " is " + result);
		System.out.println("Execution continues ...");
	}
}

