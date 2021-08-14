package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	Plane(int val){
		maxPassengers = val; 
		passengers = new ArrayList<String>();
	}
	
	public void onboard(String Name) {
		
		passengers.add(Name);
	}
	public Date takeOff() {
	// returns the current date and time
		Date date = new Date();
	    System.out.print(date);
	    lastTimeTookOf = date;
		return date;
	}
	
	public void land() {
		//sets the value of lastTimeLanded to the current date and time. Also clear() the array.
		Date date1 = new Date();
	    System.out.print(date1);
		lastTimeLanded = date1;
		passengers.clear();
	
	}
	public Date getLastTimeLanded() {
		
		return lastTimeLanded;
	}
	public List<String> getPassesngers(){
		return passengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	
}
