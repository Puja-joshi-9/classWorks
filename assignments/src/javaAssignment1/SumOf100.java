package javaAssignment1;

public class SumOf100 {

	
	public static void main(String[] args) {
		
		int esum = 0;
		 
		for(int i=1 ; i<=1000 ; i++) {
			
			if(i%2==0)
				esum = esum+i;
		}
		System.out.println(esum);
	}
}
