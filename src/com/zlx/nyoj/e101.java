package com.zlx.nyoj;
import java.util.Scanner;


public class e101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double m=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
			System.out.println(String.format("%.2f", Math.sqrt(m)));
		}

	}

}
