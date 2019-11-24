package javaAssignment1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		a = sc.nextInt();
		
		int i=1;
		for(i=1 ; i<100 ; i++)
		
		System.out.println(a + "*" + i + "=" +(a*i));
		
			sc.close();
	}
}
