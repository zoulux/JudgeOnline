package com.zlx.akoj;

import java.util.Arrays;
import java.util.Scanner;

class Pipe implements Comparable<Pipe> {
	int length, across, id;

	public Pipe(int length, int across, int id) {
		this.length = length;
		this.across = across;
		this.id = id;
	}

	@Override
	public int compareTo(Pipe that) {
		if (this.length != that.length) {
			return this.length - that.length;
		} else if (this.across != that.across) {
			return that.across - this.across;
		} else {
			return this.id - that.id;
		}
	}
}

public class e1172new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				int m = cin.nextInt();
				Pipe p[] = new Pipe[m];
				for (int i = 0; i < m; i++) {
					p[i] = new Pipe(cin.nextInt(), cin.nextInt(), cin.nextInt());
				}
				Arrays.sort(p);
				System.out.println(p[p.length-1].id);

			}
		}
	}
}
