package com.zlx.akoj;
import java.util.Scanner;


public class e1168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t=cin.nextInt();
		while(t-->0){
			double H=cin.nextDouble();
			int day=(int)(H/5);
			if(H<10)
				{System.out.println("1");continue;}
			if(H%5==0)
				System.out.println(day-1);
			else
			System.out.println(day);
			}
			
			
		}
	
}

