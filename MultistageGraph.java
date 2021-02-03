import java.io.*;
import java.util.*;

//Multistage
class MultistageGraph
{
	public static void main (String[] args )
	{
		Multistage obj=new Multistage(20);
		char ch;
		Scanner scan=new Scanner(System.in);
		do
		{
		//accept input
		int n=0;
		int i,j,m,p;
		System.out.print("\nEnter no of vertices: ");
		n=scan.nextInt();
		System.out.print("\nEnter no of stages : ");
		obj.stages=scan.nextInt();
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)

		obj.c[i][j]=9999;//initialization

		for(i=0;i<obj.stages;i++)
		{
			System.out.print("\nEnter no of vertices in stage "+(i+1)+": ");
			obj.stage_vertices[i]=scan.nextInt();
		}
		i=0;
		j=obj.stage_vertices[0];
		for(m=0;m<obj.stages;m++)
		{
			j=i+obj.stage_vertices[m];
			for(;i<j;i++)
			{
				for(p=0;p<obj.stage_vertices[m+1];p++)
			{
				System.out.print("\nEnter cost for "+(i+1)+" to "+(p+j+1)+": ");
				obj.c[i][p+j]=scan.nextInt();//Accept Matrix
			}
			}
		}
			obj.Forward(n);
			obj.display( );
			System.out.println("\n\nWant to repeat the process(y/n)?");
	            	ch=scan.next().charAt(0);
		}while((ch=='y') || (ch=='Y'));
		
} }

class Multistage
{
	public int stages,stage_vertices[],c[][];
	public int cost[],p[],n;
	public Multistage(int A)
	{
		c=new int[A][A];
		stage_vertices=new int[A];
		cost=new int[A];
		p=new int[A];
	}
	public int min_path(int s,int n)
	{
		int min=9999;//equal to infinity
		int r=0;
		for(int i=0;i<n;i++)
		{
			if(min>(c[s][i]+cost[i]))
			{
		
				min=c[s][i]+cost[i]; 
				r=i;//take the vetex which gives shortest path
			}
		}
		return r;
	}
		
		public void Forward(int n)
		{
			int i,r;
			int d[];
			d=new int[20];
			for(i=0;i<n;i++)
		            cost[i]=0;
			for(i=n-2;i>=0;i--)
			{
				r=min_path(i,n);
				cost[i]=c[i][r]+cost[r];//calculate the cost for each vertex
				d[i]=r;
			}
				p[0]=0;
				p[stages-1]=n-1;
				for(i=1;i<stages-1;i++)
				p[i]=d[p[i-1]];//minimun path
		}
	
		public void display( )
		{
			int i;
			System.out.print("\nShortest path is...\n");
			for(i=0;i<stages-1;i++)
			System.out.print(" -- "+(p[i]+1));//display shortest path
			System.out.print(" -- "+(p[i]+1));;
		}
}
