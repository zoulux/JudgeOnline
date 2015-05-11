package com.zlx.nyoj;
import java.util.Scanner;

public class e22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int s = 0;
		int i = 0;
		while (M > 0) {
			int N = sc.nextInt();
			for (int j = 0; j < N; j++) {
				int a[] = { sc.nextInt() };
				for (int l : a)
				{
					if(ok(a[l]))
						s = s + a[l++];
						
				
			}
			System.out.println();
			M--;
			}
		}
		
	}

	private static boolean ok(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return false;
		else 
		{
			for (int k = 2; k <= (n/2); k++)
				if (n % k == 0)
					return false;

		}
		return true;

	}
}
