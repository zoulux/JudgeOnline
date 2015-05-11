package com.zlx.nyoj;
import java.util.Scanner;


public class e97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		double N = cin.nextDouble();
		while(N-->0){
		double M = cin.nextDouble();
		double X = cin.nextDouble();
		double Y = cin.nextDouble();
		double Z = cin.nextDouble();
		System.out.println(String.format("%.2f", M*X*Z/(Y-X)));
		}

	}

}
