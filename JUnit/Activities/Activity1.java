	
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Activity1 {
	
	ArrayList<String> list;

	@BeforeEach
	public void setUp() {
		// Initialize a new ArrayList
		 list = new ArrayList<String>();

		// Add values to the list
		list.add("alpha"); // at index 0
		list.add("beta"); // at index 1
	}
	
	@Test
	public void insertTest() {
		//assert size
		assertEquals(2, list.size(),"Wrong size");
		
		//add new value to list
		list.add("gamma");
		
		//assert size
		assertEquals(3, list.size(),"Wrong size");
		
		//Assert value
		assertEquals("alpha",list.get(0),"Wrong Element");
		assertEquals("beta",list.get(1),"Wrong Element");
		assertEquals("gamma",list.get(2),"Wrong Element");
		
	}
	
	@Test
	public void replaceTest() {
		//assert size
		assertEquals(2, list.size(),"Wrong size");
		
		//add new value to list
		list.add("gamma");
		
		//assert size
		assertEquals(3, list.size(),"Wrong size");
		
		list.set(1, "delta");
		
		//Assert value
		assertEquals("alpha",list.get(0),"Wrong Element");
		assertEquals("delta",list.get(1),"Wrong Element");
		assertEquals("gamma",list.get(2),"Wrong Element");
		
	}
}
