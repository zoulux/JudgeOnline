package com.zlx.akoj;
import java.util.Scanner;


public class e1166 {

	public static void main(String[] args) {
		Scanner cinScanner=new Scanner(System.in);
		while(true){
			int n=cinScanner.nextInt();
			if (n==0) {
				break;
			}
			int[] A=new int[n];
			int min=1000000,index=0;
		for (int i = 0; i < n; i++) {
			A[i]=cinScanner.nextInt();
			if (A[i]<min) {
				min=A[i];
				index=i;
			}
		}
		int temp=A[index];
		A[index]=A[0];
		A[0]=temp;
			
			for (int i : A) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
