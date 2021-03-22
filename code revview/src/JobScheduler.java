import java.util.*;
/*
 *
 FCFS JOB SCHEDULER
 MAIN FUNCTION NAME JOB SCHEDULER
 Class Is CALCULATE
 FUNCTION NAME("COMPELETE TIME")
 * 
 */
class calculate{
void complete_time(int job_2darray[][],int size)
{
int completion_tym[] = new int[size];//saving compeletion tym
int turn_around_time[] = new int[size]; //Saving turn around time
int waiting_tym[] = new int[size];//Saving waiting tym
int sum=0;
float avg;
System.out.println("Complete tym\tTurn Around Tym\tWaiting tym");
completion_tym[0] = job_2darray[0][1];
for(int i=1;i<size;i++)
{ 
	
	if(job_2darray[i][0]<=completion_tym[i-1])
		completion_tym[i] = completion_tym[i-1]+job_2darray[i][1];
	else
		completion_tym[i] = job_2darray[i][0]+job_2darray[i][1];
	
}
for(int i=0;i<size;i++)
{
  turn_around_time[i] = Math.abs(completion_tym[i]-job_2darray[i][0]);
  waiting_tym[i] = Math.abs(turn_around_time[i]-job_2darray[i][1]);
  sum += waiting_tym[i];
 
  System.out.println(completion_tym[i]+"\t"+turn_around_time[i]+"\t"+waiting_tym[i]);
} 

  avg = sum/size;
  System.out.println("AVERAGE WAITING TIME "+ avg);
  System.out.println("MAXIMUM WAITING TIME "+ sum);
}
}
public class JobScheduler {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER FCFS SIZE");
		int size = scan.nextInt();
		System.out.println("ENTER YOUR TIME ARRIVAL THEN BURST TYM");
		int job_2darray[][] = new int[20][2];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<2;j++)
			{
				job_2darray[i][j] = scan.nextInt();
			}
		}
		calculate object = new calculate();
		object.complete_time(job_2darray,size);//calling calculate tym
		scan.close();
	}
}


