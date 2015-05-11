package com.zlx.akoj;
import java.util.Scanner;

public class e1219 {
	public static void main(String[] args) {
		String[] card = "3 4 5 6 7 8 9 10 J Q K A 2".split(" ");
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int T = cin.nextInt();
			while (T-- > 0) {
				String A = cin.next();
				String B = cin.next();
				int Aw = 0;
				int Bw = 0;
				for (int i = 0; i < card.length; i++) {
					if (card[i].equals(A))
						Aw = i;
					if (card[i].equals(B))
						Bw = i;
				}
				if (Aw > Bw)
					System.out.println(">");
				else if (Aw < Bw)
					System.out.println("<");
				else
					System.out.println("=");
			}
		}
	}
}
