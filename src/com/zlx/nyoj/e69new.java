package com.zlx.nyoj;
import java.util.Scanner;


public class e69new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int a=cin.nextInt();
			if(a==1)
				System.out.println("1");
			else
			System.out.println((int)(0.5*Math.log10(2.0*Math.PI*a)+a*Math.log10(a/Math.E)+1));
			
			
			
			
			
			
			
		}

	}

}
