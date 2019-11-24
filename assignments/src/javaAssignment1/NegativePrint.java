package javaAssignment1;

import java.util.Scanner;

public class NegativePrint {
	

	public static void main(String[] args) {
		
		number();
		
	}
	
static float number() {
		
		float x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		x = sc.nextFloat();
		
	   if(x<0){
			
			System.out.println(x);
			}else {
				System.out.println("invalid");
			}
	   return 0;
	}


}
