package com.zlx.akoj;
import java.util.Scanner;

public class e1192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int fat = cin.nextInt();
			int thin = cin.nextInt();
			String sfat = Integer.toBinaryString(fat);
			String sthin = Integer.toBinaryString(thin);
			int lfat = sfat.length();
			int lthin = sthin.length();

			int countfat = f(sfat, lfat);
			int countthin = f(sthin, lthin);

			if (countfat > countthin)
				System.out.println("fat");
			else if (countfat < countthin)
				System.out.println("thin");
			else
				System.out.println("fat and thin");
		}

	}

	private static int f(String s, int l) {
		int sum = 0;
		int count = 0;
		for (int j = 0; j < l; j++) {
			if (s.charAt(j) == '1')
				count++;
			else
				count = 0;
			if (count > sum)
				sum = count;
		}
		return sum;
	}
}
