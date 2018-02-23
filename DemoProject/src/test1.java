import java.util.Scanner;

public class test1 {
	
	public static void main (String args[]){
	/*
		//Switch case code
		int i = 0;
			       
		switch(i)
		{    
		case 1:    
		 System.out.println("This is Case 1");    
		 break;    
		case 2:    
		 System.out.println("This is Case 2");    
		 break;  
		 default:
		 System.out.println("This is Default");
		}
		
		//For Loop code
		for(int x=0;x<=3;x++){  
		       
			switch(x)
			{    
			case 1:    
			 System.out.println("This is Case 1");    
			 break;    
			case 2:    
			 System.out.println("This is Case 2");    
			 break;  
			 default:
			 System.out.println("This is Default");
			}
		*/	
		//While Loop code
			int y = 0;
			while (y<=3) {
			System.out.println("Print the value "+y);
			y++;}
			
			int a,b;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1st number as A");
			a= sc.nextInt();
			System.out.println("Enter 2nd number as B");
			b= sc.nextInt();
			
					//Compare 2 numbers entered and display largest of these 2 numbers.
			
			if (a>b)
			{
				System.out.println("Largest number amongst both numbers is A " +a);
			}
			else 
			{
				System.out.println("Largest number amongst both numbers is B " +b);
			}
			
			sc.close();
}
}
