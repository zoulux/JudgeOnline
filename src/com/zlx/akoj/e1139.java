package com.zlx.akoj;
import java.util.Scanner;

public class e1139 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		
		int[][] list=new int[1000][1000];
		int[] A=new int[1001];
		for (int i : A) {
			A[i]=i;
		}
		int Tc=2,Tl=1;
		int c=2,l=1;
		
		for (int i = 0; i < list.length; i++) {
			int j=0;
			if (i>0) {
				list[i][j]=list[i-1][j]+A[l++];
				c=Tc++;
			}
			for (; j < list.length; j++) {
				
				if (i==j&&i==0) {
					list[i][j]=1;
				}else {
					list[i][j]=list[i][j-1]+A[c++];
				}
				System.out.println("<<<<<<<<<<<<<<");
			}
			
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.println(list[i][j]);
			}
		}
		
//		
//		int N = cinScanner.nextInt();
//		while (N-- > 0) {
//			int x = cinScanner.nextInt();
//			int y = cinScanner.nextInt();
//			System.out.println(solve(x, y));
//
//		}

	}

	private static int solve(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}