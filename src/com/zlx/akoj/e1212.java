package com.zlx.akoj;
import java.util.Scanner;


public class e1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String op=cin.next();
			int A=cin.nextInt();
			int B=cin.nextInt();
			if(op.equals("L"))
			System.out.println(Math.max(A,B));
			else if(op.equals("S"))
				System.out.println(Math.min(A, B));
			else
				System.out.println("Input error!");
			
		}
	}

}
