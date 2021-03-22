import java.util.*;
public final class intSet
{
	private static Scanner scan_instance = new Scanner(System.in);
	private static int size(int arr[])
	{
		return arr.length;
	}
	
	private static boolean isSubset(int universal_set[])
	{
		System.out.println("Enter total no of elements in your set = ");
		int n2 = scan_instance.nextInt();
		int set1[] = new int[n2];
		System.out.println("Enter elements of your set");
		for (int index = 0; index < set1.length; index++)
		{
			set1[index] = scan_instance.nextInt();
		}
		for(int index = 0;index<set1.length;index++)
		{
			for (int j = 0; j < universal_set.length; j++) 
			{
				if(set1[index] == universal_set[j])
				{
					break;
				}
				if(j == universal_set.length-1) 
				{
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean isMember(int arr[])
	{
		System.out.println("Enter number you want to search in the set = ");
		int num = scan_instance.nextInt();
		for(int index = 0; index<arr.length; index++)
		{
			if(arr[index] == num)
			{
				return true;
			}
		}
		return false;
	}
	
	private static Integer[] union()
	{
		System.out.println("Enter total no of elements of 1st set = ");
		int n1 = scan_instance.nextInt();
		Integer[] set1 = new Integer[n1];
		System.out.println("Enter total no of elements of 2nd set = ");
		int n2 = scan_instance.nextInt();
		Integer[] set2 = new Integer[n2];
		System.out.println("Enter elements of 1st set");
		for (int index = 0; index < n1; index++)
		{
			set1[index] = scan_instance.nextInt();
		}
		System.out.println("Enter elements of 2nd set");
		for (int index = 0; index < n2; index++) 
		{
			set2[index] = scan_instance.nextInt();
		}
		HashSet<Integer> union_set=new HashSet<>();
		union_set.addAll(Arrays.asList(set1));
		union_set.addAll(Arrays.asList(set2));
		Integer[] union = {};
		union = union_set.toArray(union);
		return union;
	}
	
	private static Integer[] getComplement(int[] universal_set)
	{
		Integer[] uni_set = new Integer[universal_set.length];
		for (int index = 0; index < universal_set.length; index++)
		{
			uni_set[index] = Integer.valueOf(universal_set[index]);
		}
		System.out.println("Enter total no of elements of your set = ");
		int n1 = scan_instance.nextInt();
		Integer[] set1 = new Integer[n1];
		System.out.println("Enter elements of your set");
		for (int index = 0; index < n1; index++)
		{
			set1[index] = scan_instance.nextInt();
		}
		HashSet<Integer> complement_set = new HashSet<>();
		complement_set.addAll(Arrays.asList(uni_set));
		complement_set.removeAll(Arrays.asList(set1));
		Integer[] complement={};
		complement = complement_set.toArray(complement);
		return complement;
	}
	
public static void main(String args[])
{
	System.out.println("Enter total no of elements in Universal set = ");
	int n=scan_instance.nextInt();
	int universal_set[] = new int[n];
	for(int index = 0; index<n; index++)
	{
		universal_set[index] = index+1;
	}
	System.out.println("Enter 1 to find an element in array\n"
			+ "Enter 2 to find the size of the universal set\n"
			+ "Enter 3 to find subset of universal set\n"
			+ "Enter 4 to get compliement of a set\n"
			+ "Enter 5 to get union of 2 sets\n"
			+ "Enter 6 to exit."
			);
	int input = scan_instance.nextInt();
	switch (input) {
	case 1:
		if ( isMember(universal_set) == true)
		{
			System.out.println("Item found in set");				
		}
		else
		{
			System.out.println("Item not found in set");
		}
		break;
	case 2:
		System.out.println("The size of set is = "+ size(universal_set));
		break;
	case 3:
		if (isSubset(universal_set) == true)
		{
			System.out.println("This is a subset");				
		}
		else
		{
			System.out.println("This is not a subset");
		}
		break;
	case 4:
		Integer[] complement_set = getComplement(universal_set);
		System.out.println("Complement of the set is = ");
		for (int index : complement_set)
		{
			System.out.print(index+ " ");
		}
		System.out.println();
		break;
	case 5:
		Integer[] union_set = union();
		System.out.println("Union of the sets is = ");
		for (int index : union_set) {
			System.out.print(index+" ");
		}
		System.out.println();
		break;
	case 6:
		System.out.println("Byee.....");
		return;
	default:
		System.out.println("Wrong Input, Try again");
		break;
	}
}
}
