import java.util.*;
import java.util.HashMap;
/*
 * 
 Class hex- function add,subtract,multiply,divide,compare equal,greater,small and convetor
 Main function calling as per need
 
 */
class hex{
	int Decimal_convetor,Decimal_convertor2;
	static final char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	static final HashMap<Character,Integer> hexa_to_Decimal = new HashMap<Character,Integer>();
	hex(){
		for(int i=10;i<16;i++){
			char key;
			key = (char)(65+i%10);
			hexa_to_Decimal.put(key, i);			
		}
	}	
//adding to numbers
String add(String string_hexa1, String string_hexa2)
{
	Decimal_convetor = hexa_to_Decimal(string_hexa1);
	Decimal_convertor2 = hexa_to_Decimal(string_hexa2);
	return (decimal_to_hex(Decimal_convetor+Decimal_convertor2));
}
//Subtract two numbers
String sub(String string_hexa1, String string_hexa2)
{
	int Decimal_convetor = hexa_to_Decimal(string_hexa1);
	int Decimal_convetor2 = hexa_to_Decimal(string_hexa2);
	return (decimal_to_hex(Math.abs(Decimal_convetor-Decimal_convetor2)));
}
//Multiply two numbers
String multiply(String string_hexa1, String string_hexa2)
{
	int Decimal_convetor = hexa_to_Decimal(string_hexa1);
	int Decimal_convetor2 = hexa_to_Decimal(string_hexa2);
	return (decimal_to_hex(Decimal_convetor*Decimal_convetor2));
}
//Divide two numbers
String divide(String string_hexa1, String string_hexa2)
{
	int Decimal_convetor = hexa_to_Decimal(string_hexa1);
	int Decimal_convetor2 = hexa_to_Decimal(string_hexa2);
	return (decimal_to_hex(Decimal_convetor/Decimal_convetor2));
}
//find two no are equal or not
int equal(String astring_hexa1, String string_hexa2)
{
	int Decimal_convetor = hexa_to_Decimal(astring_hexa1);
	int Decimal_convetor2 = hexa_to_Decimal(string_hexa2);
		if(Decimal_convetor==Decimal_convetor2)
		return 1;
	else
		return 0;
}
//find the no is smaller or not
int smaller(String string_hexa1, String string_hexa2)
{
	int Decimal_convetor=hexa_to_Decimal(string_hexa1);
	int Decimal_convetor2=hexa_to_Decimal(string_hexa2);
	if(Decimal_convetor<Decimal_convetor2)
		return 1;
	else
		return 0;
}

//find two no are greater or not
int greater(String string_hexa1, String string_hexa2)
{
	int Decimal_convetor=hexa_to_Decimal(string_hexa1);
	int Decimal_convetor2=hexa_to_Decimal(string_hexa2);
	if(Decimal_convetor>Decimal_convetor2)
		return 1;
	else
		return 0;
}
//Decimal to hexadecimal call
String decimal_to_hex(int temp_variable)
{
	String result="";
	while(temp_variable>0){
		int rem = temp_variable%16;
		
		result = hexa[rem]+result;
		temp_variable = temp_variable/16;
	}
return result;
}
//hexadecimal to decimal call
int hexa_to_Decimal(String string_hexa1)
{
	int length = string_hexa1.length();
	int result = 0;
	for(int i=0;i<length;i++){
	if(string_hexa1.charAt(i)>='0' && string_hexa1.charAt(i)<= '9'){
		result+=(string_hexa1.charAt(i)-'0')*Math.pow(16, length-i-1);
	}
	else
		result+=hexa_to_Decimal.get(string_hexa1.charAt(i))*Math.pow(16,length-i-1);
	}
	return result;
}
}
public class HexCalc {
public static void main(String[] args)
{
	Scanner scan_instance = new Scanner (System.in);
	hex object = new hex();
	String string_hex_1,string_hex_2;
	System.out.println("1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE\n5.EQUAL\n6.GREATER\n7.SMALLER\n8.DECIMAL CONVETOR\n9.HEXADECIMAL COVENTOR");		
    int i=scan_instance.nextInt();
       switch(i)
       {
       case 1:
    	    System.out.println("ENTER TWO STRING A AND B");
    	    System.out.println("ENTER A");
    	    string_hex_1 = scan_instance.next();
    	    System.out.println("ENTER B");
    	    string_hex_2 = scan_instance.next();
    	    System.out.println(object.add(string_hex_1,string_hex_2));
    	   break;
       case 2:
    	    System.out.println("ENTER TWO STRING A AND B");
    	    System.out.println("ENTER A");
    	    string_hex_1 = scan_instance.next();
    	    System.out.println("ENTER B");
    	    string_hex_2 = scan_instance.next();
    	    System.out.println(object.sub(string_hex_1,string_hex_2));
    	   break;
       case 3:
    	   System.out.println("ENTER TWO STRING A AND B");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
   	       System.out.println("ENTER B");
   	       string_hex_2 = scan_instance.next();
   	       System.out.println(object.multiply(string_hex_1,string_hex_2));
    	   break;
       case 4:
    	   System.out.println("ENTER TWO STRING A AND B");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
   	       System.out.println("ENTER B");
   	       string_hex_2 = scan_instance.next();
   	       System.out.println(object.divide(string_hex_1,string_hex_2));
    	   break;
       case 5:
    	   System.out.println("ENTER TWO STRING A AND B");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
   	       System.out.println("ENTER B");
   	       string_hex_2 = scan_instance.next();
           if(object.equal(string_hex_1,string_hex_2)==1)
        	System.out.println("EQUAL");
        else
        	System.out.println("NOT EQUAL");
    	   break;
       case 6:
    	   System.out.println("ENTER TWO STRING A AND B");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
   	       System.out.println("ENTER B");
   	       string_hex_2 = scan_instance.next();
   	       if(object.greater(string_hex_1,string_hex_2)==1)
   	    	   System.out.println("GREATER");
           else
     	       System.out.println("NOT Greater");
 	   	   break;
       case 7:
    	   System.out.println("ENTER TWO STRING A AND B");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
   	       System.out.println("ENTER B");
   	       string_hex_2 = scan_instance.next();
   	       if(object.greater(string_hex_1,string_hex_2)==1)
	    	  System.out.println("Lesser");
           else
  	          System.out.println("NOT Lesser");
	   	   break;
       case 8:
    	   System.out.println("ENTER A NUMBER");
	       System.out.println("ENTER A");
	       int temp = scan_instance.nextInt();
	       System.out.println(object.decimal_to_hex(temp));
    	   break;
       case 9:
    	   System.out.println("ENTER A HEXANUMBER");
   	       System.out.println("ENTER A");
   	       string_hex_1 = scan_instance.next();
    	   System.out.println(object.hexa_to_Decimal(string_hex_1));
           break;
       default:
    	   System.out.println("Wrong Choice");
    	   }
    scan_instance.close();
}
}
