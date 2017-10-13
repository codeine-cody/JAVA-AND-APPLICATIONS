import java.util.Scanner;

public class ScoresTest {
public static void main(String[] args){
		
		int Scores[] = new int[5];
		Scanner reader = new Scanner(System.in);
	
			
		for(int i = 0; i < Scores.length; i++) {
	       System.out.println("Enter test scores: ");
	       Scores[i] = reader.nextInt();  
	       
	       if(Scores[i]<0 || Scores[i]>100){
	    	   throw new IllegalArgumentException("Score is Invalid");
	       }
	    
		}
	 
		reader.close();
		Scores average = new Scores(Scores);
		System.out.println(average.getAverage());		
	}
}