import java.util.*;

class QuickSort
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		char ch;
		do
		{
		int n,a[];
		
		System.out.println("\nEnter how many number you want in your array");
		n=scan.nextInt();
		
		a=new int[n];

		System.out.println("Enter those "+n+" element");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}

		System.out.println("Before QuickSort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		
		Qsort(a,0,n-1);


		System.out.println("\nAfter QuickSort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nWant to repeat the process(y/n)?");
		ch=scan.next().charAt(0);
		}while((ch=='y') || (ch=='Y'));
	}

	

	public static void Qsort(int a[],int lb,int ub)
	{
		if(lb<ub)
		{
			int loc=Partition(a,lb,ub);
			Qsort(a,lb,loc-1);
			Qsort(a,loc+1,ub);
			
		}
	}

	public static int Partition(int a[],int lb,int ub)
	{
		int i=lb,j=ub,pivot=lb,temp;

		while(i<j)
		{
		
			while(i<ub && a[i]<=a[pivot])
			{
				i++;
			}

			while(a[j]>a[pivot] && j>lb)
			{
				j--;
			}

			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

			else
			break;
		}

			temp=a[pivot];
			a[pivot]=a[j];
			a[j]=temp;
			return j;
	}
}
