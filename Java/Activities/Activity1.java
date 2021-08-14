package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.color = "black";
		car1.transmission = "Auto";
		car1.make = 2020;
		
		car1.displayCharacteristics();
		car1.accelarate();
		car1.brake();

	}

}
