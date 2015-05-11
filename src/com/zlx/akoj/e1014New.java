package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1014New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Vector<Integer> SS = new Vector<Integer>();
		for (int i = 2; i < 1000000; i++)
			if (ss(i))
				SS.add(i);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int t = 1;
			int flag = 0;
			for (int i = 0; i < SS.size() - 1; i++) {
				if (SS.get(i) >= n / 2) {
					t = n - SS.get(i);
					for (int j = 0; j < SS.size() - 1; j++)
						if (SS.get(j) == t) {
							if (SS.get(i) < SS.get(j))
								System.out.println(SS.get(i) + " " + SS.get(j));
							else
								System.out.println(SS.get(j) + " " + SS.get(i));
							flag = 1;
							break;

						}

				}
				if (flag == 1)
					break;
			}
		}
	}

	private static boolean ss(int n) {
		if (n == 2 || n == 3)
			return true;
		else
			for (int i = 2; i * i <= n; i++)
				if (n % i == 0)
					return false;
		return true;

	}

}
