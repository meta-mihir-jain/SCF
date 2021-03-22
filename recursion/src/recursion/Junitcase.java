package recursion;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Junitcase {
    
	int num1 = 10;
	int num2 = 15;
	int lcm=30;
	int hcf=5;
	@Test
	public void evaluate_LCM(){
		assertEquals(lcm,math_operations.lcm(num1, num2));
	}
	@Test
	public void evaluate_HCF(){
		assertEquals(hcf, math_operations.hcf(num1, num2));
	}
	
}
