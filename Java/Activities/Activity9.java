package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList();
		myList.add("Chia");
		myList.add("Fia");
		myList.add("Gia");
		myList.add("Hia");
		myList.add("Pia");
		
		for(String names:myList) {
			System.out.println("Name "+names);
		}
		
		System.out.println("Third name in the List is: "+myList.get(2));
		
		boolean val = myList.contains("Fia");
		if (val == true) {
			System.out.println("Name list has Fia");
		}
		System.out.println("Size of the list "+myList.size());
		
		myList.remove("Hia");
		System.out.println("Size of the list after removing one name "+myList.size());
		
		
		

	}

}
