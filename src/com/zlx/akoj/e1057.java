package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;


public class e1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
		int n=cin.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++)
			A[i]=cin.nextInt();
		Arrays.sort(A);
		double sum=0.0;
		for(int i=1;i<n-1;i++)
			sum+=A[i];
		double ave=sum/(n-2.0);
		System.out.println(String.format("%.2f", ave) );
	}
	}
}
