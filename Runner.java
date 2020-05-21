
public class Runner {
	public String name; //runner's name
	public Time startTime; //user entered start time
	public Time endTime; //user entered end time
	public float duration; //calculated duration
	
	/**
	 * To create a runner it must have a string for the runner's name, a Time for start time and a Time for end time.
	 * @param nameInput = runner's name
	 * @param startTimeInput = runner's start time
	 * @param endTimeInput = runner's end time
	 */
	public Runner(String nameInput,Time startTimeInput, Time endTimeInput) {
		name = nameInput;
		startTime = startTimeInput;
		endTime = endTimeInput;
		
		//Subtract the total amount of seconds of the end time from the total amount of seconds of the start time
		//Then divide by 3600 to get the amount of time as "hours"
		duration = ((endTime.convertToSeconds())-(startTime.convertToSeconds()))/3600;
	}

	/**
	 * Allow Duration comparator to "get" duration
	 * @return float duration for Duration Comparator Class
	 */
	public float getDuration(){
		return duration;
	} 
	public String getName() 
	{
		return name;
	}
	public Time getStartTime() 
	{
		return startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	//format for printing as a string
	public String toString() 
	{
		return String.format("%s\t%s\t\t%s\t\t%s", name, startTime, endTime, duration);
	}
}
