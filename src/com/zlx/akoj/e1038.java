package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1038 {

	public static void main(String[] args) {
		Vector<Integer> jili = new Vector<Integer>();
		Scanner cin = new Scanner(System.in);
		for (int i = 1; i <= 1111111; i++)
			if (jl(i))
				jili.add(i);

	while (cin.hasNext()) {
			int n = cin.nextInt();

			for (int i = 0; i < jili.size(); i++) {
				if (jili.get(i) == n) {
					System.out.println(i + 1);
					break;
				}
				if (jili.get(i) > n) {
					System.out.println("Unlucky");
					break;
				}

			}
		}

	}

	private static boolean jl(int n) {
		String N = Integer.toString(n);
		if (N.contains("0"))
			return false;
		else
			return true;
	}

}
