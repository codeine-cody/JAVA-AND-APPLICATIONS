import java.io.*;
import java.io.IOException;

public class Decryption {

	public static void main(String[] args) throws IOException {
		
		char decryption;
		boolean endOfFile = false;
		
		try {
			FileInputStream input = new FileInputStream("EncryptFile.txt");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("DecryptFile.txt");
			DataOutputStream outputFile = new DataOutputStream(output);
			
			//Decrypts Files
			while (!endOfFile) {
				decryption = (char) (inputFile.readByte() - 2);
				outputFile.writeChar(decryption);
				System.out.println(decryption);
			}

			outputFile.close();
			input.close();
		
			} catch(EOFException e){
			endOfFile = true;
			}
			
			System.out.println("Decryption Done");
  
	}
}