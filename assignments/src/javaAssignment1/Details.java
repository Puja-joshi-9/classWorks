package javaAssignment1;

import java.util.Scanner;

public class Details {
	public static void main(String[] args) {
		
		int roll;
		String name;
		String nationality;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of citizen:");
		name = sc.next();
		System.out.println("Enter the roll no .:");
		roll = sc.nextInt();
		System.out.println("Enter the nationality :");
		nationality = sc.next();
		
		System.out.println("Name = "+ name);
		System.out.println("Roll No. = "+ roll);
		System.out.println("Nationality = "+ nationality);
		
	}
	

}
