package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("\nPlease Enter digits with space =  ");
		
		ArrayList<Integer> list = new ArrayList();
		
		/*String t  = scan.nextLine();
		
		String[] r = t.split(" ");
		for(int i =0; i < r.length; i++) {
			if(!r[i].matches(".*[a-z].*")) {
				int f = Integer.parseInt(r[i]);
				System.out.println(f);
				
				list.add(f);
				System.out.println(list);
			}
		}*/
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		System.out.println(list);
		
		//Then use the Random class to generate an index value and print the value in the array at then generated index value.
		
		Random indexGen = new Random();
		
		Integer nums[] = list.toArray(new Integer[0]);
		//Object[] nums=list.toArray();
		System.out.println(Arrays.toString(nums));
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
 
        scan.close();
		
		
	
	}

}
