package Self;

import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int n,i,j,a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the value of n upto which u want to print prime numbers");
		n=sc.nextInt();
		
		for(i=2;i<=n;i++) {
			a=0;
	         for(j=1;j<=i;j++) {
	        	     if(i%j==0)
	        	     {
	        	         a++;
	        	     }
	         }
	         
	       if(a==2) {
	        
	             System.out.print(i+" ");
	         }
	     }
	 
			
		}
}
