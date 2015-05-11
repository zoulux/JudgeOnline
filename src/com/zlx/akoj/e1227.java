package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1227 {
static int[] niu=new int[51];
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			cout.println(f(N));
		}
		cin.close();
		cout.close();
	}
	private static int f(int n) {
		if(niu[n]==0)
			{if(n<4)
				return niu[n]=1;
				return niu[n]=f(n-1)+f(n-3);}//去年的老牛加上三年前的小牛开始生牛
		return niu[n];
	}
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
