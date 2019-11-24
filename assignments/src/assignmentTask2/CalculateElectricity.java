package assignmentTask2;

import java.util.Scanner;

public class CalculateElectricity extends Electricity(){
	public static void main(String[] args) {
		int Used;
		
	Scanner sc = new Scanner(System.in);
	Used = sc.nextInt();
	System.out.println("Enter units:");
	int unit = sc.nextInt();
	
	switch(Used) {
	
	case 1 :
		for(unit<=20)
			System.out.println("Rs.100");
			break;
			
			
	}
	
	}
}
