package activities;

public class Activity12 {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
/*In this activity, we will be creating a functional interface and use it with a lambda expression.
Create an interface named Addable that contains a single method, add(). This method accepts two arguments, num1 and num2.
Next, create a class named Activity12 with a main method.
In this main method, create two variables, both of type Addable(the interface).
One variable, say ad1, contains a lambda expression(no body), that saves the result of num1 plus num2.
The other variable, say ad2, contains a lambda function(has a body), that also saves the result of num1 plus num2. */
		
		Addable ad1 = (a, b) -> (a + b);
		
		
		
		// Lambda expression to implement the interface method
		Addable ad2 = (int a, int b) -> {
		    return (a + b);
		};
        
		System.out.println(ad1.add(1,2));
        System.out.println(ad2.add(1, 2));
	}

}
