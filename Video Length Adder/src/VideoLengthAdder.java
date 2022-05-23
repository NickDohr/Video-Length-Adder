import java.util.Scanner;
public class VideoLengthAdder
	{
		
		  public static void main(String[] args) 
		  {
			int videoHourLength;
			int videoMinuteLength;
			int videoSecondLength;
			int video2HourLength;
			int video2MinuteLength;
			int video2SecondLength;
		    int totalHours;
		    int totalMinutes;
		    int totalSeconds;
			
	    Scanner userIntInput = new Scanner(System.in);
		System.out.println("How many hours is the first video?");
	    videoHourLength = userIntInput.nextInt();
	    System.out.println("How many minutes is the first video?");
	    videoMinuteLength = userIntInput.nextInt();
	    System.out.println("How many seconds is the first video?");
	    videoSecondLength = userIntInput.nextInt();
	    
	    System.out.println("How many hours is the second video?");
	    video2HourLength = userIntInput.nextInt();
	    System.out.println("How many minutes is the second video?");
	    video2MinuteLength = userIntInput.nextInt();
	    System.out.println("How many seconds is the second video?");
	    video2SecondLength = userIntInput.nextInt();
		
	    totalHours = videoHourLength + video2HourLength;
	    totalMinutes = videoMinuteLength + video2MinuteLength;
	    totalSeconds = videoSecondLength + video2SecondLength;
	    
	    if(totalSeconds >=60 )
	    	{
	    		totalSeconds = totalSeconds %60;
	    		totalMinutes = totalMinutes +1;
	    	}
	    if(totalMinutes>=60)
	    	{
	    		totalMinutes = totalMinutes%60;
	    		totalHours = totalHours + 1;
	    	}
	 
	    System.out.println("Your total for the two videos was " + totalHours + " hours, " + totalMinutes + " minutes and " + totalSeconds + " seconds!");
		
		  }
	}
