package javaAssignment1;

import java.util.Scanner;

public class SimpleInterest {
	
	static void Interest() {
		
		float P,T,R,SI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of P,T ,R:");
		
		P = sc.nextFloat();
		T = sc.nextFloat();
		R = sc.nextFloat();
		
		SI = (P*T*R)/100;
		
		System.out.println("The Simple Interest is : "+ SI);
	}
	
	public static void main(String[] args) {
		
		
		Interest();
		
	}

}
