import java.io.*;
import java.util.Scanner;

public class BinarySum {
public static void main(String[]args) throws IOException {	
	    int userInput = 0;
		int sum = 0;
		boolean endOfFile = false;
		Scanner reader = new Scanner(System.in);
		
		
		FileOutputStream output = new FileOutputStream("BinarySum.dat");
		DataOutputStream outputFile = new DataOutputStream(output);
		
		FileInputStream input = new FileInputStream("BinarySum.dat");
		DataInputStream inputFile = new DataInputStream(input);
		
		System.out.println("Enter Integer to be added. Enter -1 to end");
		
		while(userInput != -1){
			userInput = reader.nextInt();
			if (userInput == -1){
				break;
			}else
			outputFile.writeInt(userInput);
			
		}
		outputFile.close();	
		reader.close();
		
		while (!endOfFile) {
			try {
				sum += inputFile.readInt();
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		inputFile.close();
		System.out.println("The sum of numbers in file is " + sum);
   }
}