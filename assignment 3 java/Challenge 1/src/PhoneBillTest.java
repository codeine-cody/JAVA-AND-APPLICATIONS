import java.util.Scanner;

public class PhoneBillTest {
public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
	LongDistanceBill ldb1  = new LongDistanceBill();
	
System.out.println("This program will calculate your phone bill for you");
System.out.println("What is your call rate?");
ldb1.setCallRate(reader.nextDouble());
System.out.println("What is your monthly rate?");
ldb1.setMonthlyRate(reader.nextDouble());
System.out.println("how many minutes did you talk?");
ldb1.setTime(reader.nextInt());
reader.close();
System.out.println("Your monthly bill is $" + ldb1.calculateBill(ldb1.getTime()));

}
}
