package activities;

public class CustomException extends Exception {
	 private String message;
	 
	 CustomException(String mesaage){
		 this.message = mesaage;
	 }
	 
	 @Override
	 public String getMessage() {
	     return message;
	 }
}
