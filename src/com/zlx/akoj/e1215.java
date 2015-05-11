package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Vector<Integer> sushu = new Vector<Integer>();
		for (int i = 2; i < 100000; i++)
			if (f(i))
				sushu.add(i);
		int l = sushu.size();
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if(a==0)
				break;
			int T = 0;
			for (int i = 0; sushu.get(i) <= a; i++) {
				int sum = 0;
				for (int j = i; sushu.get(j) <= a; j++) {
					sum += sushu.get(j);
					if (sum == a)
						T++;
					else if (sum > a)
						break;
				}
			}
			System.out.println(T);
		}
	}

	private static boolean f(int n) {
		// TODO Auto-generated method stub
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;

	}

}
