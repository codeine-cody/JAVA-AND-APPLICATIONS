
public class LongDistanceBill extends PhoneBill {
	private int time;
	public LongDistanceBill(){
		super();
	}
	
	public LongDistanceBill(double monthlyRate, int time){
		super(monthlyRate);
		this.time = time;
	}
	public double calculateBill(int time){
		return this.getCallRate() * this.getTime() + this.getMonthlyRate();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "LongDistanceBill [getTime()=" + getTime() + ", getMonthlyRate()=" + getMonthlyRate()
				+ ", getCallRate()=" + getCallRate() + "]";
	}
}
