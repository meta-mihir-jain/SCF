import java.util.*;
//function 
class program{
Scanner scan = new Scanner(System.in);
//menu of ABC mall
void menu()
{
System.out.println("ABC COSMETIC MART PRICE LIST");
System.out.println("Sno\tBRAND\tPRICE");
System.out.println("1.\tHair oil \t30Rs\n2.\tPowder \t28Rs\n3.\tCream  \t50Rs\n4.\tPaste \t40Rs\n5.\tBrush \t20Rs\n6.\tShampoo\t60Rs\n7.\tConditinor\t65Rs\n8.\tfacewash\t90Rs\n9.\tScrub\t25Rs\n10.\tlotion \t130Rs");
}
//To add the item in cart with quantity
int add(String product_array[],int price_list[],int quantity_list[])
{
    int i=0;
	int count=0;
	while(i==0){
	System.out.println("Press Item no to add in you cart");
	int item=scan.nextInt();
    if(item==1){
    	product_array[count]="HAIR OIL";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=30*quantity_list[count];
    	count++;
    }
    else if(item == 2)
    {
    	product_array[count]="POWDER";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=28*quantity_list[count];
    	count++;	
    }
    else if(item == 3)
    {
    	product_array[count]="CREAM";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=50*quantity_list[count];
    	count++;
    }
    else if(item == 4)
    {
    	product_array[count]="PASTE";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=40*quantity_list[count];
    	count++;
    }
    else if(item == 5)
    {
    	product_array[count]="BRUSH";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=20*quantity_list[count];
    	count++;
    }
    else if(item == 6)
    {
    	product_array[count]="SHAMPOO";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=60*quantity_list[count];
    	count++;
    }
    else if(item == 7)
    {
    	product_array[count]="CONDITINOR";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=65*quantity_list[count];
    	count++;
    }
    else if(item == 8)
    {
    	product_array[count]="FACEWASH";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=90*quantity_list[count];
    	count++;
    }
    else if(item == 9)
    {
    	product_array[count]="SCRUB";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=25*quantity_list[count];
    	count++;
    }
    else if(item == 10)
    {
    	product_array[count]="LOTION";
    	System.out.println("Enter Quantity");
    	quantity_list[count]=scan.nextInt();
    	price_list[count]=130*quantity_list[count];
    	count++;
    }
    else{
    	System.out.println("WRONG CHOICE");
    }
    System.out.println("Press 0 TO ADD MORE ITEM");
	i=scan.nextInt();
	}	
	return count;
}
//remove item from string
int remove(String product[],int price_list[],int quantity_list[],int size)
{
  System.out.println("ENTER ITEM NO In your CART to REMOVE");
  int index = scan.nextInt();
  index = index-1;
  if(price_list == null || index < 0 || index > size )
  {
	  System.out.println("INVALID OPTION");
  }
  int pric_list_temp[] = new int[size-1];
  int quantit_list_temp[] = new int[size-1];
  String produc_temp[] = new String[size-1];
  for(int i=0,k=0;i<size;i++)
   {
	  if(i == index)
	 {
	 	continue;
	 }
	  else{
	    pric_list_temp[k] = price_list[i];
	    quantit_list_temp[k] = quantity_list[i];
	    produc_temp[k] = product[i];
	    k++;
     }
	}
for(int i=0;i<size-1;i++)
{
	
	price_list[i] = price_list[i];
	quantity_list[i] = quantit_list_temp[i];
	product[i] = produc_temp[i];
}
	
   return 1;
}
//Print current item in list
void print(String product[],int price_list[],int quantity_list[],int size)
{
	System.out.println("ITEM NAME\t Quantity\tTotal");
	int i = 0,sum = 0;
	for(i=0;i<size;i++)
	{
		System.out.println(product[i]+"\t"+quantity_list[i]+"\t"+price_list[i]);
		sum += price_list[i];
	}
	System.out.println("Total cart value "+ sum);	
}
}
//main function in java
public class Shop {
public static void main(String args[])
{
Scanner scan1 = new Scanner(System.in);
program object = new program();
int size = 0;
int price_list[] = new int[20];
int quantity_list[] = new int[20];
String product[] = new String[20];
System.out.println("WELCOME TO ABC COSMETIC MART");
int i = 1;
do
{
	System.out.println("Select as per Choice\n1. For Menu \n2. Add a Item \n3. Remove a item\n4. Print cart\n5.Exit");
    int j = scan1.nextInt();
	switch(j){
    case 1:
    	object.menu();
    	break;
    case 2:
    	System.out.println("ADD A ITEM AS PER MENU BY ENTERING S.No");
        int array_location_current = object.add(product,price_list,quantity_list);
        size += array_location_current;
        break;
    case 3:
    	System.out.println("Remove A ITEM AS PER MENU BY ENTERING Cart s.no");
    	int update_Cart_size = object.remove(product,price_list,quantity_list,size);     
        size -= update_Cart_size;
        break;
    case 4:
    	System.out.println("PRINTING CURRENT CAR VALUE");
        object.print(product,price_list,quantity_list,size);     
        break;
    case 5:
    	System.out.println("Happy to see you!! Come back soon");
        i= 0;
        break;
    default:
    	System.out.println("Wrong Choice!! Select again");
    	break;
    }
 } while(i == 1);
scan1.close();
}
}


