import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidNumbers {
	static int counter;
	static int number;
	public static void main(String[]args){
	
		do{
			counter = 1;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a positive integer");
		try{
			number = reader.nextInt();
			if(number <= 0 || number > 100)
				throw new Exception("e");
		} catch(InputMismatchException e){
			System.out.println("Try again. (Incorrect input: A positive integer is required)");
			counter = 0; 
		} catch(Exception e){
			System.out.println("Try again. (Incorrect input: A positive integer is required)");
			counter = 0;
		}
		
	}while(counter == 0);
		
		
		System.out.println("The positive integer is " + number);	
}
}
