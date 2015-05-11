package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int K = cin.nextInt();
			String[] money = new String[N];
			for (int i = 0; i < N; i++)
				money[i] = cin.next();
			
			Arrays.sort(money);
			System.out.println(money[N-K]);

		}

	}

}
