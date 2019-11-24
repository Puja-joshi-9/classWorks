package javaAssignment1;

import java.util.Scanner;

public class FindEvenOrOdd {
	
	static void number() {
		
		int a;
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		a = ab.nextInt();
		
		if(a%2 == 0 && a!=0) {
			
			System.out.println(a + " is an even number.");
		}else if(a%2 != 0) {
			
			System.out.println(a + " is an odd number.");
		}else
			
			System.out.println("Invalid");
	}
	public static void main(String[] args) {
		
		number();
	}

}
