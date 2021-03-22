package n_quuen;
import static org.junit.Assert.*;
import org.junit.Test;
public class test_nqueen {
	int row = 0;
	int size_of_board = 4;
	boolean output = true;
	N_QUEEN obj=new N_QUEEN(size_of_board);
	@Test
	public void evaluate_NQueens(){
		assertEquals(output, N_QUEEN.findQueens(size_of_board,row));
	}
}