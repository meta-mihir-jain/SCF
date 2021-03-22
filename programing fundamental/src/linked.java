import java.util.*;
class linkedlist
{ 
	int count =0;
	Scanner sc = new Scanner(System.in);
	Node head = null,tail = null;
	class Node
	{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
	}
	void insert(int d)
	{
		if(head == null)
		{
		head = new Node(d);
		tail = head;
		}
		else
		{
		tail.next = new Node(d);
		tail = tail.next;
		}
		count++;
	}
	void display()
	{
		Node n = head;
	if(n == null)
	{
		System.out.println("list is empty");
	}
	else
	{
	while(n!= null)
	{
	System.out.print(n.data + "->");	
	n= n.next;
	}
	}
	}
	void delete()
	{
		System.out.println("enter element to delete");
		int i = sc.nextInt();
		Node n = head;
		Node temp = null;
		if(n == null)
		{
			System.out.println("list is empty");
		}
		else
		{
		while(n.data != i)
		{
		temp = n;
		n= n.next;
		}
		temp.next = n.next;
		}
		count --;
	}
  
}
public class linked 
{
public static void main(String args[])
{
     Scanner sc = new Scanner(System.in);
     linkedlist ob = new linkedlist();
     System.out.println("Enter size");
     int size = sc.nextInt();
	 for(int i = 0;i < size;i++)
	 {
		 int temp = sc.nextInt();
		 ob.insert(temp);
	 }
	 ob.display();
	ob.delete();
	 ob.display();
	
	 sc.close();
}
}
