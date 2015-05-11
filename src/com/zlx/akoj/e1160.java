package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;


public class e1160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n=cin.nextInt();
			int m=cin.nextInt();
			if(n==0&&m==0)
				break;
			String[] money=new String[n];
			for(int i=0;i<n;i++)
				money[i]=cin.next();
			Arrays.sort(money);
			for(int i=n-1;i>=n-m;i--)
				System.out.print(money[i]+" ");
			System.out.println();
			
			
		}

	}

}
