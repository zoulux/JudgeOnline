package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1252 {
	static Vector<Integer> vecBadDigit = new Vector<Integer>();
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
	

		vecBadDigit.add(1);
		int i = 2;
		while (true) {
			if (solve(i)) {
				vecBadDigit.add(i);
				
			}
	
			i++;
//			if (vecBadDigit.size() >= 1000) {
//				break;
//			}
			if (i>=20000000) {
				break;
			}
		}
System.out.println(vecBadDigit.size());
		 while(cinScanner.hasNext()){
		System.out.println(vecBadDigit.get(cinScanner.nextInt()-1));
		 }

	}

	private static boolean solve(int i) {
	
		if (i / 2 == 1.0 || i / 3 == 1.0 || i / 5.0 == 1.0) {
			return true;
		} else if (i % 2 == 0) {
			if (vecBadDigit.contains(i%2)) {
				return true;
			}
			return solve(i / 2);
		} else if (i % 3 == 0) {
			if (vecBadDigit.contains(i%3)) {
				return true;
			}
			return solve(i / 3);
		} else if (i % 5 == 0) {
			if (vecBadDigit.contains(i%5)) {
				return true;
			}
			return solve(i / 5);
		} else {
			return false;
		}

	}

}
