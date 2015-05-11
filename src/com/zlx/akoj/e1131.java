package com.zlx.akoj;
import java.util.Scanner;


public class e1131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
			double[] sum=new double[21];
		for(int i=1;i<=20;i++)
			sum[i]=sum[i-1]+f(i+1)/f(i);
		System.out.println(String.format("%.3f", sum[n]));
		

	}
	private static double f(double n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else
			return f(n-1)+f(n-2);
	
		
	}

}
