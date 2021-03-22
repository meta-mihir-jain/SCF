import java.util.*;
/*
 * methods are average,maximum,minimumu and no of passed students.
 */
class Grades_calc{
/*
* parameter is array marks and studennt
*/
float average(int marks[],int student)
{
	float sum=0;
	for(int i=0;i<student;i++)
		sum+=marks[i];
	return (sum/(float)student);
}
/*
* parameter is array marks and studennt
*/
int maximum(int marks[],int student)
{
	int maximum=marks[0];
	for(int i=1;i<student;i++){
		if(marks[i]>maximum)
			maximum = marks[i];
	}
	return maximum;
}	
/*
* parameter is array marks and studennt
*/
int minimum(int marks[],int student)
{
	int minimum=marks[0];
	for(int i=1;i<student;i++){
		if(marks[i]<minimum)
			minimum = marks[i];
	}
	return minimum;
}
/*
* parameter is array marks and studennt
*/
float passing_Percentage(int marks[],int student)
{
	int PassedStudents = 0;
	for(int i=0;i<student;i++){
		if(marks[i]>=40)
			PassedStudents++;
	}
	return (((float)PassedStudents/(float)student)*100);
}	
}
public class MarkSheet {
public static void main(String args[])
{
	  Scanner scan = new Scanner(System.in);
	  Grades_calc object = new Grades_calc();
	  System.out.println("Enter no of students");
	  int student = scan.nextInt();
	  int marks[] = new int[student];
	  System.out.println("Enter marks of student");
	  for(int i=0;i<marks.length;i++){
		  marks[i] = scan.nextInt();
	  }
	  System.out.format("Average : %.2f ",object.average(marks, student));
	  System.out.println("Maximum : "+object.maximum(marks, student));
	  System.out.println("Minimum : "+object.minimum(marks, student));
	  System.out.format("Students passed : %.2f ",object.passing_Percentage(marks, student));
	  scan.close();
}
}
