
public abstract class PhoneBill {
private double monthlyRate;
private double callRate;

public PhoneBill(){
	
}
public void setMonthlyRate(double monthlyRate) {
	this.monthlyRate = monthlyRate;
}
public PhoneBill(double monthlyRate){
	this.monthlyRate = monthlyRate;
}
public double getMonthlyRate(){
	return monthlyRate;
}
public double getCallRate() {
	return callRate;
}
public void setCallRate(double callRate) {
	this.callRate = callRate;
}
public abstract double calculateBill(int time);
}
