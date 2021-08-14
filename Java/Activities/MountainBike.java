package activities;

public class MountainBike extends Bicycle {

	int seatHeight;
	public MountainBike(int gears, int currentSpeed,int stHeight) {
		super(gears, currentSpeed);
		// TODO Auto-generated constructor stub
		seatHeight = stHeight;
	}
		public void setHeight(int newValue) {
		        seatHeight = newValue;
		    }

		    public String bicycleDesc() {
		        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
		    } 

		
}
