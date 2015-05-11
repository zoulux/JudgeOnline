package com.zlx.akoj;
import java.util.Scanner;
public class e1017new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int A=cin.nextInt();
			int a=Math.abs(A);
		
			int b=(int)(Math.pow(a, 1/3.0)+0.5);

			if(a==b*b*b)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}

	}

}
