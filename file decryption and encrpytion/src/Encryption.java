import java.io.*;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) throws IOException{
		
		
		String user;
		int encryptionIndex;
		boolean loop = false;
		Scanner reader = new Scanner(System.in);
		
		
		try {	
			//Create File Objects
			FileInputStream input = new FileInputStream("TestFile.txt");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("EncryptFile.txt");
			DataOutputStream outputFile = new DataOutputStream(output);
			
			
			
			//Encrypts File
			while (!loop) {
					encryptionIndex = (inputFile.readByte() + 2);	
					
					outputFile.writeByte(encryptionIndex);
					System.out.println(encryptionIndex);
			}
			
			outputFile.close();
			inputFile.close();
			reader.close();
			
			} catch (EOFException e) {
				loop = true;
				System.out.println("An error has occured");
			
			} finally {
			System.out.println("Encryption Done");
			}
		
		}
	
}

