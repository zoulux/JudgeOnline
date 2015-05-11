package com.zlx.nyoj;
import java.util.Scanner;

public class e72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double array[] = new double[12];
		for (int i = 0; i < 12; i++) {
			array[i] = cin.nextDouble();
		}
		double sum=0;
		for (int i = 0; i < 12; i++) {
			sum+=array[i];

		}
		System.out.println(String.format("%.2f", sum/12));

	}

}
