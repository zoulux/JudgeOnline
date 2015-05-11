package com.zlx.akoj;
import java.util.Scanner;


public class e1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		double sum=0;
		while(cin.hasNext()){
			String menu=cin.next();
			double count=cin.nextDouble();
			double price=cin.nextDouble();
			
			sum=sum+count*price;
			
			
		}
		System.out.println(String.format("%.1f", sum));

	}

}
