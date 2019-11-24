package Self;

import java.util.Scanner;

public class StringPalindrome {
	
	static String Palindrome(String word) {
	
	StringBuffer word1 = new StringBuffer(word);
	
	word1.reverse();
	String reverse = word1.toString();
	
	if(word.equals(reverse)) {
		
		System.out.println(word + " is Palindrome.");
		
	}else
		System.out.println(word + " is not Palindrome.");
	
	return word;
	

}
	
	public static void main(String[] args) {
		String givenWord;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		givenWord = sc.next();
		
		StringPalindrome.Palindrome(givenWord);
		
		
		
		
	}
}