package com.zlx.akoj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class e1261ListArray {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<String> AL=new ArrayList<String>();
		String[] daan = cin.nextLine().split(" ");// �����
		for (int i = 0; i < daan.length; i++)
			AL.add(daan[i]);

		int T = Integer.parseInt(cin.nextLine());
		// int T=cin.nextInt();
		while (T-- > 0) {
			int fs = 0;
			String[] A = cin.nextLine().split(" ");
			for (int i = 0; i < daan.length; i++) {
				if (i < 10)
					if (AL.get(i).equals(A[i])) {
//						System.out.print(i + " ");
						fs++;
					}
				if (i < 30 && i > 9)
					if (AL.get(i).equals(A[i])) {
//						System.out.print(i + " ");
						fs = fs + 2;
					}
				if (i < 40 && i > 29)
					if (AL.get(i).equals(A[i])) {
//						System.out.print(i + " ");
						fs = fs + 5;
					}
			}
			System.out.println(fs);
		}
	}

}
