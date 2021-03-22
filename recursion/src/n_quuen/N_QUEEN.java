package n_quuen;
import java.util.Scanner;
public class N_QUEEN {
	public static int board[][];
	public static int num_of_queens;
	public N_QUEEN(int size_of_board)
	{
		board = new int[size_of_board][size_of_board];
		num_of_queens = size_of_board;
	}
	public static boolean isKilling(int row,int y)
	{
		for (int index = 0; index < num_of_queens; index++) 
		{
			if (board[row][index] == 1 || board[index][y] == 1)
			{
				return true;
			}
		}
		for (int index = 0; index < num_of_queens; index++) 
		{
			for (int j = 0; j < num_of_queens; j++)
			{
				if (row-y == index-j)
				{
					if(board[index][j] == 1)
					{
						return true;
					}
				}
				if(row+y == index+j)
				{
					if(board[index][j] == 1)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean findQueens(int size_of_board,int row){
		if(size_of_board==0)
		{
			return true;
		}
		for (int j = 0; j < num_of_queens; j++)
		{
			if(!isKilling(row, j))
			{
				board[row][j] = 1;
				if (findQueens(size_of_board-1, row+1))
				{
					return true;
				}
				else 
				{
					board[row][j] = 0;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner scan_instance = new Scanner(System.in);
		System.out.println("Enter the size of board (for 4x4 enter 4)");
		int size_of_board = scan_instance.nextInt();
		N_QUEEN object = new N_QUEEN(size_of_board);
		if(N_QUEEN.findQueens(size_of_board,0))
		{
			System.out.println("Queens placement is possible");
			for (int i = 0; i < size_of_board; i++) 
			{
				for (int j = 0; j < size_of_board; j++)
				{
					System.out.print(N_QUEEN.board[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Queens placement Not Possible for this size of board");
		}
		scan_instance.close();
	}
}


