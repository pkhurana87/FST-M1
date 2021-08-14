package activities;

import java.util.HashSet;
import java.util.Set;

public class Acyivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet();
		hs.add("A");
		hs.add("C");
		hs.add("L");
		hs.add("G");
		hs.add("F");
	
		for(String names:hs) {
			System.out.println("name in the set "+names);
		}
		
		System.out.println("Size of the set is "+hs.size());
		
		System.out.println("Remove element from the set "+hs.remove("C"));
		
		if(hs.remove("Z")) {
			System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
		
		
		boolean val = hs.contains("F");
		if(val==true) {
			System.out.println("Name list has F");
		}
		
		System.out.println("name in the set "+hs);
	}

}
