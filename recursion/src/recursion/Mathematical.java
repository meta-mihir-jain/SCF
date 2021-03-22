package recursion;
import java.util.*;
//Class WHERE LCM AND HCF IS HAPPENING
class math_operations
{
    static int temp_variable = 1;
    //LCM MODULE
	static int lcm(int number_1,int number_2)
	{
		if(temp_variable % number_1 == 0 && temp_variable % number_2 == 0)
		{
			return temp_variable;
		}
		else
			temp_variable++;
			lcm(number_1,number_2);
			return temp_variable;
	}
	//Hcf module
	static int hcf(int number_1,int number_2)
	{
		if(number_2==0){
			return number_1;
		}
		else{
			return hcf(number_2, number_1 % number_2);
		}
	}
}
//main methods
public class Mathematical {
	public static void main(String args[]){
		Scanner Scan_instance= new Scanner(System.in);
		int number_2,number_1;
		System.out.println("1. LCM\n2.HCF");
		int index = Scan_instance.nextInt();
		switch(index){
		case 1:
			System.out.println("Enter Two Number for Lcm");
			number_1 = Scan_instance.nextInt();
			number_2 = Scan_instance.nextInt();
			System.out.println("LCM OF TWO NUMBER IS: " + math_operations.lcm(number_1,number_2));
			break;
		case 2:
			System.out.println("Enter Two Number for HCF");
			number_1 = Scan_instance.nextInt();
			number_2 = Scan_instance.nextInt();
			System.out.println("HCF OF TWO NUMBER IS: " + math_operations.hcf(number_1,number_2));
			break;
		default:
			System.out.println("Wrong Choice");
		}
		Scan_instance.close();
	}
}

