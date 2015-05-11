package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = cin.next();
			Vector<Integer> vec = new Vector<Integer>();
			int i = 0;
			int j = 1;
			while (true) {
				if (i == str.length()) {
					break;
				}

				int temp = Integer.parseInt(str.substring(i, j));
				System.out.println(temp);
				if (vec.size() == 0) {
					vec.add(temp);
					i++;
					j = i + 1;
				} else if (temp > vec.get(vec.size() - 1)) {
					vec.add(temp);
					i = j;
					j = i + 1;
				} else {
					j++;
				}

			}
			
		for (int j2 = 0; j2 < vec.size(); j2++) {
			System.out.print(vec.get(j2)+" ");
		}
		
		}

	}

}