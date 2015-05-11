package com.zlx.akoj;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Rec1073 implements Comparable<Rec1073> {
	int id, length, width;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// return super.equals(obj);
		return true;
	}

	@Override
	public int compareTo(Rec1073 that) {
		if (this.id != that.id) {
			return this.id - that.id;
		} else if (this.length != that.length) {
			return this.length - that.length;
		} else {
			return this.width - that.width;

		}
	}
}

public class e1073new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int n = cin.nextInt();
				Vector<Rec1073> vector = new Vector<Rec1073>() {
					@Override
					public boolean contains(Object o) {
						// TODO Auto-generated method stub
						Rec1073 rec = (Rec1073) o;
						int id = rec.id;
						int length = rec.length;
						int width = rec.width;
						for (int i = 0; i < this.size(); i++) {
							Rec1073 r = this.get(i);
							int mid = r.id;
							int mlength = r.length;
							int mwidth = r.width;
							if (id == mid && length == mlength
									&& width == mwidth) {
								return true;
							}
						}

						return false;
					}
				};
				for (int i = 0; i < n; i++) {
					Rec1073 rec = new Rec1073();
					rec.id = cin.nextInt();
					int x = cin.nextInt();
					int y = cin.nextInt();
					rec.length = Math.max(x, y);
					rec.width = Math.min(x, y);

//					if (!contains(vector, rec)) {
					if (!vector.contains(rec)) {
						vector.add(rec);
					}
				}

				Collections.sort(vector);
				for (Rec1073 rec : vector) {
					System.out.println(rec.id + " " + rec.length + " "
							+ rec.width);
				}
			}

		}
	}

	private static boolean contains(Vector<Rec1073> vector, Rec1073 rec) {
		int id = rec.id;
		int length = rec.length;
		int width = rec.width;
		for (int i = 0; i < vector.size(); i++) {
			Rec1073 r = vector.get(i);
			int mid = r.id;
			int mlength = r.length;
			int mwidth = r.width;
			if (id == mid && length == mlength && width == mwidth) {
				return true;
			}
		}
		return false;
	}
}
