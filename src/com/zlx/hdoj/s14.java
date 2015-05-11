package com.zlx.hdoj;
import java.util.Scanner;
public class s14{
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int t=cin.nextInt();
			if(t==0)break;
			int sum=0;
			for(int i=0;i<t;i++)
				sum+=cin.nextInt();
			System.out.println(sum);
		}
	}
}