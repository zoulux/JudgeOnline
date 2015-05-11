package com.zlx.hdoj;
import java.util.Scanner;
public class s15{
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		while(n-->0){
			int sum=0,t=cin.nextInt();
			for(int i=0;i<t;i++)
				sum+=cin.nextInt();
			System.out.println(sum);
		}
	}
}