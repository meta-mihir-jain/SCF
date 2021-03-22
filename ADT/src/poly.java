import java.util.*;
public final class poly {
    @SuppressWarnings("unused")
    private static final int[] arr = null;
	private static Scanner scan_instance = new Scanner(System.in);
	private static int[] addPoly(int[] poly1,int[] poly2)
	{
		try{
			System.out.println("First polynomial expression is =");
		
		printPoly(poly1, poly1.length);
		System.out.println("Second polynomial expression is =");
		printPoly(poly2, poly2.length);
		int size = max(poly1.length, poly2.length);
		int sum[]=new int[size];
		for (int index = 0; index < poly1.length; index++)
		{
			sum[index] = poly1[index];
		}
		for (int index = 0; index < poly2.length; index++)
		{
			sum[index] += poly2[index];
		}
		return sum;
		}
		catch(Exception e){
			System.out.println("Error");
		}
		return null;
	}
	private static int[] multiplyPoly(int[] poly1,int[] poly2)
	{
		try{
		System.out.println("First polynomial expression is =");
		printPoly(poly1, poly1.length);
		System.out.println("Second polynomial expression is =");
		printPoly(poly2, poly2.length);
		int[] multiplication = new int[poly1.length+poly2.length-1];
		for (int index = 0; index < poly1.length+poly2.length-1; index++)
		{
			multiplication[index] = 0;
		}
		for (int index = 0; index < poly1.length; index++) 
		{
			for (int j = 0; j < poly2.length; j++)
			{
				multiplication[index+j] += poly1[index]*poly2[j];
			}
		}
		return multiplication;
		}
		catch(Exception e){
			System.out.println("Error");
		}
		return null;
	}
	
	private static int max(int x, int y)
	{
		return (x>y)? x :y ;
	}
	private static void printPoly(int arr[],int n)
	{
		try{
		for (int index = 0; index < n; index++)
		{
			System.out.print(arr[index]);
			if (index != 0)
			{
				System.out.print("x^"+index);
			}
			if(index != n-1){
				System.out.print(" + ");
			}
		}
		System.out.println();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	private static int[] polynomial()
	{
		try{
			System.out.println("Enter total number of integers in polynomial = ");
		
		int n = scan_instance.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter integers = ");
		for (int index = 0; index < n; index++)
		{
			arr[index] = scan_instance.nextInt();
		}
		return arr;
		}
		catch(Exception e){
		System.out.println("Error");	
		
		}
		return null;
	}
	private static int find_degree(int[] arr)
	{
		printPoly(arr, arr.length);
		return arr.length-1;
	}
	private static float evaluate(int[] poly,float num)
	{
		float result=0;
		for (int index = 0; index < poly.length; index++) 
		{
			result+=(poly[index])*(Math.pow(num, index));
		}
		return result;
	}
	public static void main(String args[])
	{
	
	System.out.println("Enter 1 to evaluate the value of Polynomial expression\n"
			+ "Enter 2 to find degree of polynomial expression\n"
			+ "Enter 3 to add two polynomial expressions\n"
			+ "Enter 4 to multiply 2 polynomial expressions\n"
			+ "Enter 5 to exit");
	int input = scan_instance.nextInt();
	switch (input) {
	case 1:
		try
		{
			int arr[]= polynomial();
		
		System.out.println("Enter the number, which you want to put in polynomial expression = ");
		float num = scan_instance.nextFloat();
		float result = evaluate(arr,num);
		printPoly(arr, arr.length);
		System.out.println("The value of polynomial is = "+result);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		break;
	case 2:
		try{
		int arr_1[]= polynomial();
		int degree = find_degree(arr_1);
		System.out.println("Degree of the polynomial is = "+degree);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
		break;
	case 3:
		try{
			int poly1[] = polynomial();
			int poly2[] = polynomial();
			int[] sum = addPoly(poly1,poly2);
			System.out.println("Sum of polynomials is =");
			printPoly(sum, sum.length);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		break;
	case 4:
		try{
		int[] exp1 = polynomial();
		int[] exp2 = polynomial();
		int[] multiplication = multiplyPoly(exp1,exp2);
		System.out.println("Multiplication of polynomials is = ");
		printPoly(multiplication, multiplication.length);
		}catch(Exception e){
			System.out.println("Error");
		}
		break;
	case 5:
		System.out.println("Thanks to use polynomial operations.");
		return;
	default:
		System.out.println("Wrong input, try again.");
		break;
	}
}
}