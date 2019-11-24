package Self;

import java.util.Scanner;

public class Hw {
	
	public static void main(String[] args) {
		
		double x;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the value of x");
		x=sc.nextDouble();
		
		if(x>=300) {
			
			x=x-(x*0.3);
			
			
		}else if(x>=200 && x<300) {
			
			x=x-(x*0.2);
			
	
		}else if(x>=100 && x<200) {
			
			x=x-(x*0.1);
			
			
		}else if(x<100 && x>0) {
			
			x=x-(x*0.05);
			
			
		}else {
			
			System.out.println("Sorry,no discount.");
			
		}
		
		System.out.println("Price is :"+x);
		sc.close();
		
	}

}
