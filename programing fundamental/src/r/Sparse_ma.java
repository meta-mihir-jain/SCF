package r;
import java.util.*;
public class Sparse_ma {
    private static int max = 100;
    private static int arr[][] = new int[max][3];
    private static int row=3;
	private static int col=3;
    static Scanner scan_instance = new Scanner(System.in);
    // check a sparse matrix is symmetrical or not
    static boolean isSymmetric(int [][] arr)
    {
    	try{
    		int [][]matrix = transpose(arr);
    		int count = 1;
    		for(int i = 0;i<row; i++){
    			for(int j = 0;j<col; j++){
    				if(matrix[i][j]!=arr[i][j])
    				{
    					count = 0;
    					break;
    				}
    			}
    		}
    	if(count==1)
    		return true;
    	else
    		return false;
    }
    catch(Exception e){
        System.out.println("Error ISSYMETRIC");	
        }
    return false;
    }
    // method to add two sparse matrix
    static int[][] add(int arr3[][], int arr4[][])
    {
        try
        {
         	
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			arr3[i][j]+=arr4[i][j];	
    		}
    	}
         return arr3;
        }
        catch(Exception e){
            System.out.println("Error In adding");	
            }
		return null;
    }
    // method to find transpose of a sparse matrix
    static int[][] transpose(int arr1[][])
    {   
    	try
    	{
    		 int[][] mat=new int[row][col];
    		  
    	        for(int i=0;i<row;i++)
    	        {
    		    for(int j=0;j<col;j++)
    		    {
    			mat[i][j]=arr1[j][i];
    			}
    		    }
    	       return mat;
    	}
    	catch(Exception e)
    	{
            System.out.println("Error function");	
         }
      return null;
    }
    // multiply two sparse matrix
    static int[][] multiply(int[][] arr5,int[][] arr6)
    {
        try
        {
        	int res[][] = new int[row][col];
     	   for(int i = 0;i<row;i++)
     	   {
     	       for(int j = 0;j<col;j++)
     	       {
     	    	   res[i][j] = 0;
     	          for(int k=0;k<row;k++)
     	          {
                           res[i][j] += arr5[i][k] * arr6[k][j];
     		  }  
     	      }
     	   }     
        
        print(res);
        return res;
        }
        catch(Exception e)
        	{
            System.out.println("Error function");	
            }
        return null;
    }
   
    // method to take input of a sparse matrix
    private static int[][] take_sparse_matrix() 
    {
    	try{
        System.out.println("Enter rows of matrix 3*3");
        
        for(int i = 0;i<row;i++)
        {
        	for(int j = 0;j<col;j++)
        	{
        		arr[i][j] = scan_instance.nextInt();
        	}
        }
        return arr;
    	}
    	catch(Exception e)
    	{
            System.out.println("Error function");	
        }
    	return null;
    }
 // print sparse matrix
    private static void print(int arr[][])
    {
    	try
    	{
        for (int index = 0; index < row; index++)
        {
        	for(int j = 0; j< col; j++)
        	{
        		System.out.println(arr[index][j] + "\t");
        	}
           System.out.println(); 
        }
        }
    	catch(Exception e)
    	{
        System.out.println("Error in printing");	
        }
    }
    // main function
    public static void main(String args[])
    {
        try{
        System.out.println("Enter 1 to transpose\nEnter 2 to check symmetrical or not\nEnter 3 to add two matrices\nEnter 4 to multiply two matrices\nEnter 5 to exit.");
        int input = scan_instance.nextInt();
        switch (input) 
        {
            case 1:
            	try{
            	int [][] arr1 = take_sparse_matrix();
            	int [][]temp = transpose(arr1);
            	print(temp);
            	}
            	catch(Exception e){
            		System.out.println("Erroe case 1");
            	}
                break;
            case 2:
            	try{
            	int [][] arr2 = take_sparse_matrix();
            	boolean output = isSymmetric(arr2);
            	if(output == true)
            	{
            		System.out.println("Matrix is Symmetric");
            	}
            	else
            	{
            		System.out.println("Matrix is not Symmetric");
            	}
            	}
            	catch(Exception e)
            	{
            		System.out.println("Erroe case 2");	
            	}
                break;
            case 3:
            	try{
            	int [][] arr3 = take_sparse_matrix();
            	int [][] arr4 = take_sparse_matrix();
                System.out.println("Addition: ");
                int[][] arr7 = add(arr3,arr4);
                print(arr7);
            	}
            	catch(Exception e)
            	{
            		System.out.println("Erroe case 3 ");	
            	}
                break;
            case 4:
            	try{
            	int [][] arr5 = take_sparse_matrix();
            	int [][] arr6 = take_sparse_matrix();
                System.out.println("\nMultiplication: ");
                multiply(arr5,arr6);
                //print(arr8);
            	}
            	catch(Exception e)
            	{
            		System.out.println("Erroe case 4 ");	
            	}
                break;
            case 5:
                System.out.println("Good Bye ...");
                return;
            default:
                System.out.println("Wrong Input, Try again.");
                break;
        }

        scan_instance.close();
    }
    catch(Exception e)
	{
		System.out.println("Error main");	
	}
}
	
	
}