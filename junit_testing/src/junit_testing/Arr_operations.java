package junit_testing;
import java.util.*;
class operation
{
static int Mirror(int[] arr) {
	int max =- 1;
	try {
    if (arr.length == 0)
    {
		throw new AssertionError("Empty array");
	}
	else
	{
		for (int index = 0; index < arr.length; index++) {
		int k = index;
		int count=0;
		for (int j = arr.length-1; j>=index; j--)
		{
			if(arr[j]==arr[k]){
			count++;
			k++;
			if(k>=arr.length)
			{
			if(max<count)
			{
			max=count;
			}
			break;
			}
			}
			else if (count!=0)
			{
			if(count>max)
			{
			max=count;
			}
			count=0;
			k=index;
			}
			}
			if(count>max)
			{
			max=count;
			}
			if((arr.length-index)<max)
			{
			break;
			}
			}
			}
	  	} 
	catch (Exception e)
	    {
			System.out.println(e.getMessage());
		}
		return max;
}	
static int countClumps(int[] arr)
{
	int count = 0;
	try {
		if(arr.length == 0)
		{
			throw new AssertionError("Empty Array");
		}
		else
		{
			int num =- 1;
			for (int index = 1; index < arr.length; index++)
			{
				if ((arr[index-1] == arr[index]) && (num != arr[index-1])) 
				{
					count++;
					num = arr[index];
				}
				else if ((arr[index-1] == arr[index]) && (num == arr[index-1]))
				{
					
				}
				else{
					num =- 1;
				}
			}
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return count;
}
static int[] fixXY(int[] arr,int x,int y)
{
	try {
		if(arr.length == 0)
		{
			throw new AssertionError("Empty array");
		}
		else if (arr[arr.length-1] == x) 
		{
			throw new AssertionError("X occurs at the last index of the array");
		}
		else{
			for (int index = 0; index < arr.length-1; index++)
			{
				if(arr[index] == x && arr[index+1] == x)
				{
					throw new AssertionError("two adjacents X values are there");
				}
			}
			int count_x = 0,count_y = 0;
			for (int index = 0; index < arr.length; index++)
			{
				if(arr[index] == x)
				{
					count_x++;
				}
				if (arr[index]==y)
				{
					count_y++;
				}
			}
			if(count_x != count_y)
			{
				throw new AssertionError("there are unequal numbers of X and Y");
			}
			for (int index = 0; index < arr.length; index++)
			{
				if(arr[index] == y)
				{
					for (int j = 0; j < arr.length; j++)
					{
						if(arr[j] == x && arr[j+1] != y && j != arr.length-1)
						{
							int temp = arr[index];
							arr[index] = arr[j+1];
							arr[j+1] = temp;
			             }
			         }
			      }
			 }
		}
	}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
	return arr;
}
static int splitArray(int[] arr){
	int k =- 1;
	try {
		int sum = 0;
		if(arr.length == 0)
		{
			throw new AssertionError("Empty array");
		}
		else{
			for (int index = 0; index < arr.length; index++) 
			{
				sum = sum+arr[index];
				arr[index] = sum;
			}
			if(sum%2 == 0)
			{
				for (int index = 0; index < arr.length; index++)
				{
					if(arr[index] == (sum/2))
					{
						k = index+1;
						break;
					}
				}
			}
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return k;
}
}
public class Arr_operations 
{
 public static void main(String args[])
 {
	 Scanner scan_instance = new Scanner(System.in);
	 System.out.println("1.Mirror image\n2.CLUMPS IN ARRAY\n3.FIT XY\n4.SPLIT ARRAY WHERE LEFT RIGHT IS SAME\n.5.EXIT");
     int input = scan_instance.nextInt();
     switch(input)
     {
     case 1:
    	    System.out.println("Enter total no of elements in array");
			int total_num = scan_instance.nextInt();
			int array_1d[] = new int[total_num];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num; i++) {
				array_1d[i] = scan_instance.nextInt();
			}
			int temp = operation.Mirror(array_1d);
			System.out.println(temp);
    	 break;
     case 2:
    	    System.out.println("Enter total no of elements in array");
			int total_num1 = scan_instance.nextInt();
			int[] arr1 = new int[total_num1];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num1; i++)
			{
				arr1[i] = scan_instance.nextInt();
			}
			System.out.println(operation.countClumps(arr1));
    	 break;
     case 3:
    	 System.out.println("Enter total no of elements in array");
			int total_num2 = scan_instance.nextInt();
			int[] arr2 = new int[total_num2];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num2; i++)
			{
				arr2[i] = scan_instance.nextInt();
			}
			System.out.println("Enter value of X");
			int x = scan_instance.nextInt();
			System.out.println("Enter value of Y");
			int y = scan_instance.nextInt();
			int[] fix_arr = operation.fixXY(arr2,x,y);
			for (int i = 0; i < fix_arr.length; i++)
			{
				System.out.print(fix_arr[i]+" ");
			}
			System.out.println();
    	 break;
     case 4:
    	    System.out.println("Enter total no of elements in array");
			int total_num3 = scan_instance.nextInt();
			int[] arr3 = new int[total_num3];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num3; i++) 
			{
				arr3[i] = scan_instance.nextInt();
			}
			int split_index = operation.splitArray(arr3);
			System.out.println(split_index);
    	 break;
     default:
    	System.out.println("Wrong Choice!!"); 
     }
     scan_instance.close();
 }
}
