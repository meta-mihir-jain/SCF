package r;
import static org.junit.Assert.*;

import org.junit.Test;
public class Sparse_maTest {
	int[][] arr3={{1,2,3},{1,2,3},{1,2,3}};
	int[][] arr4={{1,2,3},{1,2,3},{1,2,3}};
	int[][] arr5={{1,2,3},{1,2,3},{1,2,3}};
	int[][] arr6={{1,2,3},{1,2,3},{1,2,3}};
	int[][] arr1={{0,0,0},{0,0,0},{0,0,0}};
	int[][] arr2={{0,0,0},{0,0,0},{0,0,0}};
	int[][] temp={{0,0,0},{0,0,0},{0,0,0}};
	boolean t =true;
	int[][] op={{2,4,6},{2,4,6},{2,4,6}};
	int[][] output={{6,9,18},{6,9,18},{6,9,18}};

	
	@SuppressWarnings("deprecation")
	@Test
	public void evaluate_add(){
		assertEquals(op,Sparse_ma.add(arr3,arr4));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void evaluate_mul(){
	    assertEquals(null,Sparse_ma.multiply(arr5,arr6));
	}
	@SuppressWarnings("deprecation")
	@Test

	public void evaluate_transpose(){
		assertEquals(temp,Sparse_ma.transpose(arr1));
	}@Test

	public void evaluate_sym(){
		assertEquals(t,Sparse_ma.isSymmetric(arr2));
	}
}
