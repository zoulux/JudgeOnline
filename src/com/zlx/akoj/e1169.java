package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;


public class e1169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		while(n-->0){
			int m=cin.nextInt();
			String[] num=new String[m];
			for(int i=0;i<m;i++)
				num[i]=cin.next();
			Arrays.sort(num);
			System.out.println(num[0]);
			
		}

	}

}
