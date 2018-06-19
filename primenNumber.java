import java.util.Scanner;

public class primenNumber {
	 
		 public static void main(String args[]){  
			 Scanner scanner = new Scanner(System.in);
			 System.out.print("enter the number : ");
		  int i,m=0,a=0;      
		  int n= scanner.nextInt();  
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++){      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     a=1;      
		     break;      
		    }      
		   }      
		   if(a==0)  { System.out.println(n+" is prime number"); }  
		  } 
		}    
		}   

