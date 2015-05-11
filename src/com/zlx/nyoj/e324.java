package com.zlx.nyoj;
import java.util.Scanner;


public class e324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while(n-->0){
			int m = cin.nextInt();
			System.out.println(f(m+1));
			
			
		}

	}

	private static int f(int m) {
		// TODO Auto-generated method stub
		int resurt =0;
		if(m==1)
			resurt=1;
		else
			resurt=(f(m-1)+1)*2;
		return resurt;
		
	}

}
