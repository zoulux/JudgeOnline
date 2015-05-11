package com.zlx.akoj;
import java.util.Scanner;

public class e1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int M = cin.nextInt();
			String a = Integer.toBinaryString(M);
			int b = a.length();
		
			for (int i = 0; i < 32 - b; i++)
				a =  "0"+a ;
	

			
			System.out.println(a);

		}

	}
}
