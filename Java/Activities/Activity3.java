package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double seconds = 1000000000;
		double Earth_seconds = 31557600;
		double Mercury_yr = 0.2408467;
		double Venus_yr = 0.61519726;
		double Mars_yr = 1.8808158;
		double Jupiter_yr = 11.862615;
		double Saturn_yr= 29.447498;
		double Uranus_yr= 84.016846;
		double Neptune_yr = 164.79132;
		
		System.out.println("Age on Mercury: "+ seconds / Earth_seconds / Mercury_yr);
        System.out.println("Age on Venus: "+ seconds / Earth_seconds / Venus_yr);
        System.out.println("Age on Earth: "+ seconds / Earth_seconds);
        System.out.println("Age on Mars: "+ seconds / Earth_seconds / Mars_yr);
        System.out.println("Age on Jupiter: "+ seconds / Earth_seconds / Jupiter_yr);
        System.out.println("Age on Saturn: "+ seconds / Earth_seconds / Saturn_yr);
        System.out.println("Age on Uranus: "+ seconds / Earth_seconds / Uranus_yr);
        System.out.println("Age on Neptune: "+ seconds / Earth_seconds / Neptune_yr);
		

	}

}
