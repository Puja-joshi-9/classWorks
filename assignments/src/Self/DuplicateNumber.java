package Self;

public class DuplicateNumber {
	
	//int arr[][];

	public static void main(String[] args) {
		
		int[] num = {5,6,6,7,4,4,8,9};
		
		int j =0;
		int [] temp = new int[7]; //declares the array of same length of the original array.
		
		for(int i=0 ; i < num.length-1 ;i++) {
			
		   if(num[i] != num[i+1] ) {		//if the number is not same
			   
			  temp[j] = num[i];		//it stores the value in the 
			   j++;
		   		}
		   }
		temp[j] = num[num.length-1]  ;
			j++;
			for (int i=0;i<j;i++) {		
		System.out.println(temp[i]);
			}
		  }
	
	}


