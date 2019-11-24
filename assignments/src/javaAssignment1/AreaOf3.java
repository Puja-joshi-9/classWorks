package javaAssignment1;

import java.util.Scanner;

public class AreaOf3 {
	
	static void AreaOfCircle() {
		
		double radius,Acircle;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		radius = sc.nextDouble();
		
		Acircle = (Math.PI) * radius * radius;
		System.out.println("Area of circle is :\n"+Acircle);
	}
	
	static void AreaOfRectangle() {
		double Arect,length , breadth;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		
		Arect = length*breadth;
		System.out.println("Area of rectangle is: \n"+Arect );
		
	}
	
	static void AreaOfTriangle() {
		
		double ATri , base , height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of base and height of triangle:");
		
		base = sc.nextDouble();
		height = sc.nextDouble();
		
		ATri = (base*height)/2;
		System.out.println("Area of triangle is :\n"+ ATri);
	}

	public static void main(String[] args) {
		
		AreaOfCircle();
		
		AreaOfRectangle();
		
		AreaOfTriangle();
		

		
	}

	
}
