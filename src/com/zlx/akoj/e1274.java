package com.zlx.akoj;
import java.util.Scanner;

public class e1274 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		int T = cinScanner.nextInt();
		int A[][]=new int[7][7];
		while (T-- > 0) {
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A.length; j++) {
					A[i][j]=cinScanner.nextInt();
				}
			}
			
			int count=0;
			for (int i = 1; i < A.length-1; i++) {
				for (int j = 1; j < A.length-1; j++) {
					if ((A[i][j]==1)&&(A[i-1][j]==1)&&(A[i][j-1]==1)&&(A[i][j+1]==1)&&(A[i+1][j]==1)) {
						count++;
					}
				}
			}
			System.out.println(count);
			
			
			
		}
	}
}
