package javaAssignment1;

import java.util.Scanner;

public class LeapYear {
	
	static void year() {
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		
		year = sc.nextInt();
		
		if(year%4 == 0) {
			
			System.out.println(year + " is leap year");
		}else
			System.out.println(year + " is not a leap year.");
		
	}
	public static void main(String[] args) {
		
		year();
	}

}
