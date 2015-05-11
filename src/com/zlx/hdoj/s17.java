package com.zlx.hdoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class s17 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	public static void main(String[] args) {
		int n = cin.nextInt();
for(int j=1;j<=n;j++){
			int t = cin.nextInt(), sum = 0;
			for (int i = 0; i < t; i++)
				sum += cin.nextInt();
			cout.println(sum);
			if(j!=n)
			cout.println();
		}
		cin.close();
		cout.close();
	}
}