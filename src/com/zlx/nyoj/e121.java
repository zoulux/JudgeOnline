package com.zlx.nyoj;
import java.util.Scanner;

public class e121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int M = cin.nextInt();
		while (M-- > 0) {
			String A=cin.next();
			String B=cin.next();
			int[] a=new int[A.length()];
			int[] b=new int[B.length()];
	
			for(int i=0;i<A.length();i++)
			  {
			   a[i]=Integer.parseInt(String.valueOf(A.charAt(i)));
			  }

			for(int i=0;i<B.length();i++)
			  {
			   b[i]=Integer.parseInt(String.valueOf(B.charAt(i)));
			  }
		
		int sum=0;
		for(int i=0;i<A.length();i++)
			for(int j=0;j<B.length();j++)
				sum+=a[i]*b[j];
		System.out.println(sum);
				
		}
		
	}

}
