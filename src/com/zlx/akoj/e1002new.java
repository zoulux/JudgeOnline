package com.zlx.akoj;
import java.util.Scanner;

public class e1002new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int count = 0;
		while (cin.hasNext()) {
			Long num = cin.nextLong();
			if (f(num)) {
				System.out.println(num);
				count++;
			}
		}
		System.out.println(count);

	}

	private static boolean f(Long num) {
		Long temp1 = num;
		Long temp2 = num;
		Long temp3 = num;
		int count8 = 0;
		int count6 = 0;

		for (int i = 0; i < 11; i++) {
			if (temp1 % 10 == 4)
				return false;
			else
				temp1 = temp1 / 10;
		}
		for (int i = 0; i < 11; i++) {
			if (temp2 % 10 == 6)
				count6++;

			temp2 = temp2 / 10;
		}
		for (int i = 0; i < 11; i++) {
			if (temp3 % 10 == 8)
				count8++;
			temp3 = temp3 / 10;
		}

		if (count6 >= 5 || count8 >= 5)
			return true;
		else
			return false;

	}

}
