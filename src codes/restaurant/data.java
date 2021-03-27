package restaurant;

import java.util.Hashtable;
import java.util.Scanner;

public class data {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to our restaurant");
		
		System.out.println("Press 1 for menu");
		System.out.println("Press 2 for order");
		Scanner sc=new Scanner(System.in);  
		int a =sc.nextInt();
		if(a==1) {
			System.out.println("1.Panner Masala Rs350");
			System.out.println("2.Mutton kasa Rs Rs200");
			System.out.println("3.Plain rice Rs50");
			System.out.println("4.Fried Rice Rs Rs100");
			
			System.out.println("Enter 2 for order");
			int g=sc.nextInt();
			if(g==2) {
				int i=0;
				Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
				 
				hashtable.put(1, "350");
				hashtable.put(2, "200");
				hashtable.put(3, "50");
				hashtable.put(4, "100");
			
			    System.out.print("Enter the number of food you want to order: ");  
			    Scanner b= new Scanner(System.in);
			     
			    int  n=b.nextInt();  
			    System.out.println("Enter the code of food you want to order: "); 
			    int array[]=new int[n];
			    int arr[]=new int[n];
				for(i=0;i<n;i++) {
					
					array[i]= b.nextInt();
					arr[i]=Integer.parseInt(hashtable.get(array[i]));
				}
				
				
				System.out.println("Enter no of plates you want to order respectively: ");
				int array1[]=new int[10];
				for(i=0;i<n;i++) {
					array1[i]=b.nextInt();
				}
				int ans[]=new int[10];
				int new1[]=new int[10];
				for(i=0;i<n;i++) {
				    int a1=arr[i];
				    int b1=array1[i];
				    
				    ans[i]=a1*b1;
				   
				}
		        int k =0;	
		        int t=0;
		        int m;
				for(i=0;i<n;i++) {
				  k=k+ans[i];
				  m=(k*28)/100;
				  t=k+m;
				  }
			
				System.out.println("Your before tax amount is"+k);
				System.out.println(k+"+"+"28%gst");
				System.out.println("The total amount is"+t);
				System.out.println("Your order is taken please wait for 5mins thank you.");
		             
		   				
			

				
			}
			
			
		}
		else {
			int i=0;
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		 
		hashtable.put(1, "350");
		hashtable.put(2, "200");
		hashtable.put(3, "50");
		hashtable.put(4, "100");
	
	    System.out.print("Enter the number of food you want to order: ");  
	    Scanner b= new Scanner(System.in);
	     
	    int  n=b.nextInt();  
	    System.out.println("Enter the code of food you want to order: "); 
	    int array[]=new int[n];
	    int arr[]=new int[n];
		for(i=0;i<n;i++) {
			
			array[i]= b.nextInt();
			arr[i]=Integer.parseInt(hashtable.get(array[i]));
		}
		
		
		System.out.println("Enter no of plates you want to order respectively: ");
		int array1[]=new int[10];
		for(i=0;i<n;i++) {
			array1[i]=b.nextInt();
		}
		int ans[]=new int[10];
		int new1[]=new int[10];
		for(i=0;i<n;i++) {
		    int a1=arr[i];
		    int b1=array1[i];
		    
		    ans[i]=a1*b1;
		   
		}
        int k =0;
        int t=0;
        int m;
		for(i=0;i<n;i++) {
		  k=k+ans[i];
		  m=(k*28)/100;
		  t=k+m;
		  }
		System.out.println("Your bill is");
		System.out.println(k+"+"+"28%gst");
		System.out.println("The total amount is"+t);
		System.out.println("Your order is taken please wait for 5mins thank you.");
		
                 
   				
	}

	}
}


