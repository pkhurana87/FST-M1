package activities;

import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 Plane plane = new Plane(10);
		 
		 
		 plane.onboard("Jia");
		 plane.onboard("Rubby");
		 
		Date date = plane.takeOff();
		System.out.println("Take off time :"+date);
			 
		List<String> passengerslist =  plane.getPassesngers();
		System.out.println(passengerslist);
		
		Thread.sleep(300000);
		plane.land();
		
		System.out.println("last time landed "+plane.getLastTimeLanded());
		 
	}

}
