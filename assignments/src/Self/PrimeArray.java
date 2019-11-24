package Self;

import java.util.Scanner;

public class PrimeArray {
	
	public static void main(String[] args) {
		
		int i,j,a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give two numbers between which prime numbers are to be printed");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(i=a;i<=b;i++) {
			c=0;
			for(j=a;j<=i;j++) {
				
				if(i%j==0) {
					c++;
				}
				
			}
			if(c==2) {
				System.out.println(i+"");
			}
		}
		
		
	}
	

}
