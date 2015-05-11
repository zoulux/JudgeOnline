package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
public class e1241 {
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int X = cin.nextInt();
				int Y = cin.nextInt();
				int A = cin.nextInt();
				int B = cin.nextInt();
				int m = cin.nextInt();

				long sum = 0;
				for (int i = 1; i <= m; i++)
					sum += V(X, Y, A, B, i);
				cout.println(sum);
			}
		}
		cin.close();
		cout.close();
	}
	private static int V(int x, int y, int a, int b, int n) {
		if (n == 1)
			return x;
		if (n == 2)
			return y;
		return a * V(x, y, a, b, n - 2) + b * V(x, y, a, b, n - 1);
	}
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}