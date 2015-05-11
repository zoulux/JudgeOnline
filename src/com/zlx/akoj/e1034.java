package com.zlx.akoj;
import java.util.Scanner;


public class e1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double U=cin.nextDouble();	
		double D=cin.nextDouble();
		double H=cin.nextDouble();
		double Y=Math.sqrt(((D-U)/2.0)*((D-U)/2.0)+H*H);
		System.out.println(String.format("%.2f", (U+D)*H/2.0));
		System.out.println(String.format("%.2f", U+D+2.0*Y));

	}

}
