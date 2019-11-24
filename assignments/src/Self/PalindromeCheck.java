package Self;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static String Palindrome(String st) {
		StringBuffer sb = new StringBuffer(st);
		sb.reverse();
		String rev = sb.toString();
		
		if(st.equals(rev)) {
			
			System.out.println(st + " is palindrome.");
		}else {
			
			System.out.println(st + " is not palindrome.");
		}
		return st;
	}

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String.");
		
		name = sc.next();
		PalindromeCheck.Palindrome(name);
		
	}
}
