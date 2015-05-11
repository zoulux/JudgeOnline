package com.zlx.akoj;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class e1172 {



	public static void main(String[] args) {
		class Pipe {
			int len;
			int diameter;
			int num;
		}
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int m = cin.nextInt();
			Pipe[] pipe = new Pipe[m];
			for (int i = 0; i < m; i++) {
				pipe[i] = new Pipe();
				pipe[i].len = cin.nextInt();
				pipe[i].diameter = cin.nextInt();
				pipe[i].num = cin.nextInt();
			}

			Arrays.sort(pipe, new Comparator<Pipe>() {
				@Override
				public int compare(Pipe p1, Pipe p2) {
					if (p1.len != p2.len) {
						return p1.len - p2.len;
					} else if (p1.diameter != p2.diameter) {
						return p2.diameter - p1.diameter;
					} else {
						return p1.num - p2.num;
					}
				}
			});
			System.out.println(pipe[m - 1].num);

		}

	}

}
