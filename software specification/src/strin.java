import java.util.Scanner;
/*
 * Class operation has different methods like compare,string,changecase,largestword.
 * 
 */
class operations
{
	/*
	 * parameter string1 and string2
	 * compare 2 string
	 */
	int compare(String string1,String string2)
	{
		if(string1 == null || string2 == null)
			return 0;
		if(string1.length() != string2.length())
			return 0;
		for(int i=0;i<string1.length();i++)
		{
			if(string1.charAt(i)!=string2.charAt(i))
				return 0;
		}
		return 1;
	}
     /*
      * parameter temporary_string
      * reverse a string
      */
	String reverse(String temp_string)
	{
		char ch_new[] = new char[temp_string.length()];
		int j=0;
		for(int i = ch_new.length-1;i >= 0;i--)
		{
			ch_new[j] = temp_string.charAt(i);
			j++;
		}
		String new_string = new String(ch_new);
      return new_string;
	}
	/*
     * parameter str
     * chaangecase a string
     */
    String changecase(String str)
	{
		String st_new = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ' '){
					st_new += " ";
				}
				else if(str.charAt(i) >='a' && str.charAt(i)<='z'){
					st_new += (char)(str.charAt(i)-32);
				}
				else{
					st_new += (char)(str.charAt(i)+32);
				}
			}
			return st_new;
	}
    /*
     * parameter string1
     * largestword in a string
     */
  	String largest_word(String string1)
	{
		String largestWord = "";
		String[] words = string1.split(" ");
		for(String word:words){
			if(word.length()>=largestWord.length()){
				largestWord = word;
			}
		}
		return largestWord;
	}
}
public class strin {
public static void main(String args[])
{
	  Scanner scan = new Scanner(System.in);
	  operations object = new operations();
	  System.out.println("1. COMPARE \n2. REVERSE\n3. Changecase\n4. LARGEST WORD OF STRING");
	  String string1,string2;
	  int i = scan.nextInt();
      switch(i)
	  {
	  case 1:
		  System.out.println("ENTER TWO STRING\n Enter 1 string");
		  scan.nextLine();
		  string1 = scan.nextLine();
		  System.out.println("ENTER 2 string");
		  string2 = scan.nextLine();
		  if(object.compare(string1, string2)==0)
			  System.out.println("Not Equal");
		  else
			  System.out.println("EQUAL");
	      break;
	  case 2:
	 	  System.out.println("ENTER STRING TO REVERSE");
	 	  scan.nextLine();
		  string1 = scan.nextLine();
		  System.out.println("Reverse of string\t"+object.reverse(string1));		
		  break;
	  case 3:
		  System.out.println("ENTER STRING TO CHANGE CASE");
		  scan.nextLine();
		  string1 = scan.nextLine();
		  System.out.println("CHANGE CASE\t"+object.changecase(string1));		
		  break;
	  case 4:
		  System.out.println("ENTER STRING TO FIND LONGEST WORD");
		  scan.nextLine();
		  string1 = scan.nextLine();
		  System.out.println("Largest word \t"+object.largest_word(string1));
		  break;
	  default:
		  System.out.println("Wrong Choice!!");
		  break;
		}
	scan.close();
}
}

