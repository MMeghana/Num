import java.util.*;
import java.lang.*;
class Num
{
	Public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = obj.nextInt();
		String str = Integer.toString(n);
		int count = 0;
		for(int i=0; i<string.length();i++)
		{
			if(string.charAt(i)!="")
				count=count+1;
		}
		System.out.print("The number of digits are :"+count);
	}
}
