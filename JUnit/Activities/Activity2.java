import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class Activity2 {

	
	@Test
	void notEnoughFunds() {
		BankAccount b = new BankAccount(9);
		
		assertThrows(NotEnoughFundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
               
                int val = b.withdraw(10);
                System.out.println(val);
            }
		
	});
	}
	
	@Test
	void EnoughFunds() {
		BankAccount b = new BankAccount(100);
		
		assertThrows(NotEnoughFundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
               
                int val = b.withdraw(100);
                System.out.println(val);
            }
		
	});
	}
	
}
