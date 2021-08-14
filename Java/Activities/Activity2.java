package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		
		int[] arr1 = {10,77,10,54,-11,10};
		
		
		
		for(int i=0;i <arr1.length; i++) {
			System.out.println(arr1[i]);
			if(arr1[i] == 10) { 
				counter = counter + 1;
				
		}

	}
		
		
		System.out.println("Addition of 10 in provided array");
		System.out.println("Addition of 10 in provided array :"+counter*10);

}
}
