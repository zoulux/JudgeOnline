package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1234 {

	public static void main(String[] args) {
		while(cin.hasNext()){
			int T=cin.nextInt();
			while(T-->0){
				double a=cin.nextDouble();
				double b=cin.nextDouble();
				if(b==0)
				{
					System.out.println("INF");
					continue;
				}
				System.out.println(String.format("%.4f", a/b));
			}
			
			
		}
		cin.close();
		cout.close();
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
