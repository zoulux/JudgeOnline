package com.zlx.akoj;
import java.util.Scanner;

public class e1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String A=cin.next();
			String B=cin.next();
			StringBuffer a=new StringBuffer(A);
			StringBuffer b=new StringBuffer(B);
			a.reverse();
			b.reverse();
			int a1=Integer.parseInt(a.toString());
			int b1=Integer.parseInt(b.toString());
			int c1=a1*b1;
			String C=Integer.toString(c1);
			StringBuffer c=new StringBuffer(C);
			c.reverse();
			System.out.println(c);
			
			
		}
	}

}
