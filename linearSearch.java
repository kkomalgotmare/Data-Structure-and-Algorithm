import java.util.*;
import java.io.*;
class linearSearch
{
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);

		char ch;
		do
		{
	
		int i,n,s,a[];
		

		System.out.println("\nEnter how many element you want in your array.....");
		n=scan.nextInt();
		
		a=new int[n];
		System.out.println("Enter those "+n+" Element...");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter the number that you want to search.....");
		s=scan.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]==s)
			{
			System.out.println(s+" Found at location "+i);
			break;
			}
		}

		if(i==n)
		{
			System.out.println(s+" not found in given Array list...");
		}

		System.out.println("\n\nDo you want to continue(y/n)?");
		ch=scan.next().charAt(0);
		}while((ch=='y') || (ch=='Y'));
	}
}
