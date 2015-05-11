package com.zlx.akoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Rec implements Comparator<Rec> {
	int no = 0, length = 0, width = 0;

	// @Override
	// public int compareTo(Rec o) {
	// // TODO Auto-generated method stub
	// if (this.no != o.no) {
	// return this.no - o.no;
	// } else if (this.length != o.length) {
	// return this.length - o.length;
	// } else {
	// return this.width - o.width;
	// }
	// }

	@Override
	public int compare(Rec o1, Rec o2) {
		if (o1.no != o2.no) {
			return o1.no - o2.no;
		} else if (o1.length != o2.length) {
			return o1.length - o2.length;
		} else {
			return o1.width - o2.width;
		}
	}
}

public class e1093 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int t = cin.nextInt();
			Set<Rec> rec = new TreeSet<Rec>(new Rec());

			for (int i = 0; i < t; i++) {
				Rec r = new Rec();
				r.no = cin.nextInt();
				int a = cin.nextInt();
				int b = cin.nextInt();
				r.length = Math.max(a, b);
				r.width = Math.min(a, b);
				rec.add(r);

			}

			for (Rec s : rec) {
				System.out.println(s.no + " " + s.length + " " + s.width);
			}

		}
	}
}
