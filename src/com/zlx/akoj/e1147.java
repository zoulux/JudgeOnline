package com.zlx.akoj;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			
			Vector<String> vector = new Vector<String>();
			String m = cin.next();// 4231

			for (int i = 0; i < m.length(); i++) {
				String old = m.charAt(i) + "";
				vector.add(m.replaceFirst(old, ""));
			}
			Collections.sort(vector);
			System.out.println(vector.get(vector.size() - 1));

		}

	}

}
