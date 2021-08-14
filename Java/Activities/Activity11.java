package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> colours = new HashMap();
		colours.put(1, "Pink");
		colours.put(2, "Yellow");
		colours.put(3, "Blue");
		colours.put(4, "White");
		colours.put(1, "Orange");
		
		System.out.println("Print all colours on console "+colours.values());
		
		System.out.println("Remove one colour "+colours.remove(4));
		
		if(colours.containsValue("Green")==true) {
			System.out.println("Colour exists in the Maps");
		}else {
			System.out.println("Colour does not exists in the Maps");
		}
		
		System.out.println("Print size of colour "+colours.size());
	}

}
