package com.zlx.akoj;
import java.util.Scanner;

public class e1201newHash {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int n = cin.nextInt();
				int A[] = new int[n];
				for (int i = 0; i < n; i++)
					A[i] = cin.nextInt();
				int max = 0;
				for (int i = 0; i < n; i++) {
					int count = 0;
					for (int j = 0; j < n; j++)
						if (A[i] == A[j])
							count++;
					if (count > max)
						max = count;
				}
				System.out.println(max);
			}
		}
	}
}
