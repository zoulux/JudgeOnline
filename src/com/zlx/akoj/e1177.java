package com.zlx.akoj;
import java.util.Scanner;


public class e1177 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int x1=cin.nextInt();
			int y1=cin.nextInt();
			int x2=cin.nextInt();
			int y2=cin.nextInt();
			int x3=cin.nextInt();
			int y3=cin.nextInt();
			if(x1==0&&x2==0&&x3==0&&y1==0&&y2==0&&y3==0)
				break;
			double a=Math.hypot(x1-x2, y1-y2);
			double b=Math.hypot(x1-x3, y1-y3);
			double c=Math.hypot(x2-x3, y2-y3);
			double p=(a+b+c)/2.0;
			double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println(String.format("%.1f", s));
		}

	}

}
