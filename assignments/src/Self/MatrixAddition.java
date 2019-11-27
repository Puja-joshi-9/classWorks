package Self;

import java.util.Scanner;

public class MatrixAddition {

		public static void main(String[] args) {
			int mat[][] = new int[2][2];
			int mat1[][] = new int[2][2];
			int mat2[][] = new int[2][2];
			
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0 ; i<2 ; i++) {
				
				for(int j=0 ; j<2 ; j++) {
					
					System.out.println("Enter the value for matrix 1");
					mat[i][j] = sc.nextInt();
				}
				
			}
	
			
//			for(int i = 0; i<2 ; i++) {
//				
//				for(int j=0; j<2 ; j++) {
//					
//					System.out.print(mat[i][j]+"  ");
//				}
//				System.out.println();
//				
//			}
			
              for(int i = 0 ; i<2 ; i++) {
				
				for(int j=0 ; j<2 ; j++) {
					
					System.out.println("Enter the value for matrix 2");
					mat1[i][j] = sc.nextInt();
				}
				
			}
	
			
//			for(int i = 0; i<2 ; i++) {
//				
//				for(int j=0; j<2 ; j++) {
//					
//					System.out.print(mat1[i][j]+"  ");
//				}
//				System.out.println();
//				
//			}
              System.out.println("The sum of the matrices is:");
              for(int i=0;i<2;i++) {
            	  for(int j=0;j<2;j++) {
              
              mat2[i][j]= mat[i][j]+mat1[i][j];
              
            	  
            	  System.out.println(mat2[i][j]+" ");
            	  }
            	
            	  System.out.println();
		}
		}
		
	}

