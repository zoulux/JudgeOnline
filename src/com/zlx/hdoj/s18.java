package com.zlx.hdoj;
import java.util.Scanner;
public class s18{
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int sum=0,t=cin.nextInt();
			for(int i=0;i<t;i++)
				sum+=cin.nextInt();
			System.out.println(sum);
		}
	}
}