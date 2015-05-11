package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1010 {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			// //������A�ĳ�����������x��
			// ����B�ĳ�����������y��
			// ����Aһ������m�ף�
			// ����Bһ������n��
			// γ�����ܳ�L�ס�

			long x = cin.nextInt();
			long y = cin.nextInt();
			long m = cin.nextInt();
			long n = cin.nextInt();
			long L = cin.nextInt();
			long a = x - y;
			long b = n - m;
			// (x+m*i)-(y+n*i)=k*L
			// (x-y)=k*L+(n-m)*i,��������k,i��,�����Ǿͻ�����
			// a=k*L+i*b
			long gys = gcd(L, b);
			if (a % gys != 0) {
				System.out.println("Impossible");
				continue;
			}
			for (int i = 0;; i++) {
				if (((x + m * i) % L) == ((y + n * i) % L)) {
					con.println(i);
					break;
				}
			}
		}
		cin.close();
		con.close();
	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		return b == 0 ? a : gcd(b, a % b);
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);
}
