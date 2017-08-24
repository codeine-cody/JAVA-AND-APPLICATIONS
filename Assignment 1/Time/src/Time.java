import java.util.*;
	
public class Time {
public static void main(String[]args){
	
	 Date date = new java.util.Date();
	   long TimePassed = date.getTime();
	      
	   
	   System.out.println("At the execution of this program, system local time is " + date.toString());
	   timeFormatted(TimePassed);
}


public static void timeFormatted(long timeMilliSource) {
	// print how many time passed since January 1 1970
long timeMilli = timeMilliSource/1000;
int h = (int) (timeMilli / (3600));
int m = (int) ((timeMilli - (h * 3600)) / 60);
int s = (int) (timeMilli - (h * 3600) - m * 60);

 System.out.println("Time elapsed since Unix Time Epoch: " + String.format("Hours: %02d Minutes: %02d Seconds: %02d", h,m,s));

}
}
