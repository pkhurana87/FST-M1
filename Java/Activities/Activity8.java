package activities;

public class Activity8  {

	public static void main(String[] args) {
		
		Activity8 CustomExceptionActivity = new Activity8();
		
		CustomExceptionActivity.exceptionTest("Will print to console");
		CustomExceptionActivity.exceptionTest(null);
		CustomExceptionActivity.exceptionTest("Will print to console2");
	}
	public void exceptionTest(String str){		
		try {
			if(str==null) {				
				throw new CustomException("String passed is null");
			}else {
				System.out.println(str);
			}
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
