import java.util.*;
/*
 * class shapes
 * main function area
 */
class shapes
{
	/*
	 * parameter  height weight return triangle area
	 */
    double triangle(double height,double width)
	{
		return ((height*width)/2);
	}
	/*
	 * parameter  height weight return rectangle area
	 */
    double rectangle(double height,double width)
	{
		return (height*width);
	}
    /*
     * parameter weight return square area
     */
    double square(double width)
	{
		return (width*width);
	}
    /*
     * parameter radius
     */
    
    double circle(double radius)
	{
		return (3.14*radius*radius);
	}
}
public class Area {
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
shapes object = new shapes();
double width,height,radius;
System.out.println("1. Triangle\n2. Rectangle\n3. Square\n4.Circle");
int i = scan.nextInt();
switch(i)
{
case 1:
	System.out.println("EENTER WIDTH AND HEIGHT");
	width = scan.nextDouble();
	height = scan.nextDouble();
	System.out.println("AREA OF TRIANGLE= " +object.triangle(width,height));
	break;
case 2:
	System.out.println("ENTER WIDTH AND HEIGHT");
	width = scan.nextDouble();
	height = scan.nextDouble();
	System.out.println("AREA OF RECTANGLE="+object.rectangle(width,height));
	break;
case 3:
	System.out.println("ENTER Width");
	width = scan.nextDouble();
	System.out.println("AREA OF Square="+object.square(width));
	break;
case 4:
	System.out.println("ENTER Radius");
	radius = scan.nextDouble();
	System.out.println("AREA OF CIRCLE="+object.circle(radius));
	break;
default:
	System.out.println("WRONG CHOICE");
}
scan.close();
}
}
