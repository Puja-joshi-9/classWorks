package javaAssignment1;

import java.util.Scanner;

public class KgToPound {

	public static void main(String[] args) {
		
		Result();
		
	}
	static void Result() {
		
		float a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Pounds :");
		a = sc.nextInt();
		b = a * 0.454f;
		System.out.println("The Value of "+ a + "Pounds = "+b+ "kgs");
		
	}
}
