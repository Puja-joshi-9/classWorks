package javaAssignment1;

import java.util.Scanner;

public class LargestIn3 {
	
	static void numbers() {
		
		float a , b , c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a , b and c :");
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if(a>b && a>c) {
			
			System.out.println("The largest number is:"+a);
			
		}else if(b>a && b>c) {
			
			System.out.println("The largest number is:"+b);
			
		}else if(c>a && c>b) {
			
			System.out.println("The largest number is:"+c);
			
		}else {
			
			System.out.println("All of the numbers are equal.");
		}
		
	}
	
	public static void main(String[] args) {
		
		numbers();
	}

}
