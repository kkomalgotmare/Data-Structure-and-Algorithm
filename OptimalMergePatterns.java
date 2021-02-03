import java.util.Scanner;  
import java.util.PriorityQueue;  
 
public class OptimalMergePatterns  
{    
	static int minComput(int size, int a[])  
    {  
         	PriorityQueue<Integer> pq = new PriorityQueue<>();      
	     	for (int i = 0; i<size; i++) 
        	{                 
			pq.add(a[i]);  
        	 }  
             	int count = 0;  
   		System.out.print("Optimal Sum: "); 
            	while (pq.size() > 1) 
 		{  
                int sum = pq.poll() + pq.poll();               
   		for (int i = 0; i <size; i++) 
 	    	{ 
 	 		System.out.print(sum+"  ");  	 	
			break; 
                }  	               
 		count += sum;                 
 		pq.add(sum);  
      } 
		return count;  
} 
	   
public static void main(String[] args)  
    {  
        Scanner scan=new Scanner(System.in);
	char ch;      
    	do         
 	{ 
		int n,a[]; 
               	System.out.println("\nEnter how many elements you want");  	 
       		n=scan.nextInt();  	    
    		a=new int[n]; 
                System.out.println("Enter those "+n+" element");  	    
    		for(int i=0;i<n;i++) 
 	        { 
                          a[i]=scan.nextInt(); 
 	        } 
                
		System.out.println("\nTotal Cost= "+ minComput(n, a));   	       
  		System.out.println("Do you want to continue(y/n)?");  	   
      		ch=scan.next().charAt(0);  	      
   } while(ch=='y'|| ch=='Y'); 
  }  
} 
