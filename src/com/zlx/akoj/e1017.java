package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;
public class e1017 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		BigInteger[] scf = new BigInteger[10001];
		for (int i = 0; i < 10000; i++)
			scf[i] = (BigInteger.valueOf(i)).pow(3);
		
		while (cin.hasNext()) {
			BigInteger A = cin.nextBigInteger();
			int flag = 0;
			for (int i = 0; i < 10000; i++)
				if (A.equals(scf[i])) {
					System.out.println("YES");
					flag = 1;
					break;
				}
			if (flag == 0)
				System.out.println("NO");

		}

	}

}
