package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1178 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int[] p = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
				59, 61, 67, 71, 73, 79, 83, 89, 97 };
		

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();

		while (N-- > 0) {
			String string = cin.next();
			int size = string.length();
			int[] charCount = new int[size];
			for (int i = 0; i < size; i++) {
				charCount[i] = find(string.charAt(i), string);
			}
			int result = solve(charCount);
			boolean Luck=false;
			for (int i = 0; i < p.length; i++) {
				if (result==p[i]) {
					Luck=true;
				}
			}
			if (Luck) {
				System.out.println("Lucky Word");
				System.out.println(result);
			}else {
				System.out.println("No Answer");
				System.out.println(0);
			}
			
			
			
		}

	}

	private static int solve(int[] charCount) {
		int max = 0, min = charCount.length;
		for (int i = 0; i < charCount.length; i++) {
			int temp = charCount[i];
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}
		return max - min;
	}

	private static int find(char c, String string) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}

		return count;
	}

}
