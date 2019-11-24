package javaAssignment1;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		
	  Area();
	}
	static void Area() {
		
		float a,b;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b :");
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		
	   avg =( a+b)/2;
	   System.out.println("Average value is :"+avg);
	   
}
}