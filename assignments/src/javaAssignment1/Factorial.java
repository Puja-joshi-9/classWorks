package javaAssignment1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
	
	
	int a = 0, factorial;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:"+ sc.nextInt(a));
	
	for(int i = 1;i<=a ; ++i) {
		factorial = sc.nextInt();
		factorial  *= i;
	
	System.out.println("factorial of " + a + " = " + factorial);
	
	
	}

}
}