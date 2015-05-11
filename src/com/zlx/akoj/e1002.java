package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Vector<Long> num = new Vector<Long>();

		for (int i = 0; i < 50; i++) {
			num.add(cin.nextLong());
			if (f(13808866888L))
				System.out.println("13808866888");

		}

	}

	private static boolean f(Long num) {
		String str = num.toString();
		char[] sc = str.toCharArray();
		int count6 = 0;
		int count8 = 0;
		for (int i = 0; i < sc.length; i++) {
			if (sc[i] == '4')
				return false;
			if (sc[i] == '6')
				count6++;
			if (sc[i] == '8')
				count8++;
		}
		if (count6 >= 5 && count8 >= 5)
			return true;
		return false;
	}

}
