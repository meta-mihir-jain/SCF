package search;
import static org.junit.Assert.*;
import org.junit.Test;
public class junit_test {
	int[] arr={2,4,5,8,6};
	int num=5;
	int low=0;
	int high=4;
	int output_index=2;
	@Test
	public void evaluate_linear_search(){
		assertEquals(output_index, Search.linear_search(arr, num, low, high));
	}
	@Test
	public void evaluate_binary_search(){
	    assertEquals(output_index, Search.binary_search(arr, num, low, high));
	}
}
