package search;
import java.util.*;
class Search
{
	static int linear_search(int arr[],int num,int low,int high)
	{
		if(high<low){
			return -1;
		}else if (arr[low]==num) {
			return low;
		}else{
			return linear_search(arr, num, low+1, high);
		}
	}
	static int binary_search(int arr[],int num,int low,int high)
	{
		if(high>=low){
			int mid=low+(high-low)/2;
			if(arr[mid]==num){
				return mid;
			}
			if(arr[mid]>num){
				return binary_search(arr, num, low, mid-1);
			}
			return binary_search(arr, num, mid+1, high);
		}
		return -1;	
	}
}
public class Search_options {
	public static void main(String[] args) {
		Scanner scan_instance = new Scanner(System.in);
		System.out.println("Enter total no of elements of array");
		int number_size = scan_instance.nextInt();
		int[] arr = new int[number_size];
		System.out.println("Enter elements of array");
		for (int index = 0; index < number_size; index++) {
			arr[index] = scan_instance.nextInt();
		}
		System.out.println("Enter which element you want to search");
		int num = scan_instance.nextInt();
		System.out.println("Using Linear Search");
		int index_of_element = Search.linear_search(arr,num,0,number_size-1);
		if(index_of_element == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index "+index_of_element);
		}
		System.out.println("Using Binary Search");
		int index_of_elem = Search.binary_search(arr,num,0,number_size-1);
		if(index_of_elem == -1)
		{
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at index " + index_of_elem);
		}
		scan_instance.close();
	}
}

