import java.io.*;
import java.util.Scanner;

public class DCENfile {
public static void main(String[]args) throws IOException{
    String userInput = "\n";
	int sum = 0;
	boolean endOfFile = false;
	Scanner reader = new Scanner(System.in);
	File file1 = new File("TestFile.txt");
	File file2 = new File("EncrpytFile.txt");
	File file3 = new File("DecryptFile.txt");
	FileOutputStream output = new FileOutputStream(file1);
	DataOutputStream outputFile = new DataOutputStream(output);
	
	FileInputStream input = new FileInputStream(file1);
	DataInputStream inputFile = new DataInputStream(input);
	
	System.out.println("Enter string to be added.");
		
	userInput = reader.next();
		outputFile.writeChars(userInput);
	
		
	outputFile.close();	
	reader.close();
	inputFile.close();
}
}