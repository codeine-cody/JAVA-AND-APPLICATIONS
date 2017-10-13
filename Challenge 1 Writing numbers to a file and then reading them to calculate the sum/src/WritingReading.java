import java.io.*;
import java.util.Scanner;

public class WritingReading {
public static void main(String[]args) throws IOException {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Integer to be added. Enter -1 to end");
		int userInput = 0;
		int sum = 0;
		
		File myFile = new File("NumberstTest.txt");
		PrintWriter output = new PrintWriter(myFile);
		
		while(userInput != -1){
			userInput = reader.nextInt();
			if (userInput == -1){
				break;
			}else
			output.print(userInput + " ");
			
		}
		output.close();
		reader.close();
		
		Scanner fileReader = new Scanner(myFile);
		
		while (fileReader.hasNext()){
			sum += fileReader.nextInt();
		}
		
		System.out.println("The sum of all numbers in file is " + sum);
		fileReader.close();	
	}

}