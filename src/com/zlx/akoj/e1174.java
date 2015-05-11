package com.zlx.akoj;
import java.util.Scanner;


public class e1174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		while(n-->0){
			double bian=cin.nextDouble();
			double pi=3.1415926;
			double r=bian/Math.sqrt(3);
			double s=pi*r*r;
			System.out.println(String.format("%.2f", s));
			
			
		}

	}

}
