package com.zlx.akoj;
import java.util.Scanner;


public class e1127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in) ;
	   int m=cin.nextInt();
		int[] A=new int[10];
		int[] sum=new int[10];
		
		for(int i=1;i<=9;i++)
			{A[i]=jiec(i);
			sum[i]=sum[i-1]+A[i];}
		System.out.println(sum[m]);
		}

	private static int jiec(int n) {
		int s=1;
		for(int i=1;i<=n;i++)
			s=s*i;
		return s;
		
		
	}

}
