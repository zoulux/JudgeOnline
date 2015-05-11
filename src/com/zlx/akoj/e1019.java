package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

class RecRec {
	int x, y, xx, yy;
}

public class e1019 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			while (m-- > 0) {
				int screenX = cin.nextInt();
				int screenY = cin.nextInt();

				int w = cin.nextInt();
				Vector<RecRec> vector = new Vector<RecRec>();
				for (int i = 0; i < w; i++) {
					RecRec rec = new RecRec();
					rec.x = cin.nextInt();
					rec.y = cin.nextInt();
					rec.xx = cin.nextInt();
					rec.yy = cin.nextInt();
					vector.add(rec);
				}
				solve(screenX, screenY, vector);

			}
		}
	}

	private static void solve(int screenX, int screenY, Vector<RecRec> vector) {
		int[][] screen = new int[screenX + 1][screenY + 1];
		for (int i = 0; i < screenX + 1; i++) {
			screen[i][0] = 1;
		}

		for (int i = 0; i < screenY + 1; i++) {
			screen[0][i] = 1;
		}

		for (int i = 0; i < vector.size(); i++) {
			RecRec rec = vector.get(i);
			f(screen, rec.x, rec.y, rec.xx, rec.yy);
		}

		int count = 0;
		for (int i = 0; i < screenX + 1; i++) {
			for (int j = 0; j < screenY + 1; j++) {
				if (screen[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static void f(int[][] screen, int x, int y, int xx, int yy) {
		for (int i = x ; i <= xx; i++) {
			for (int j = y ; j <= yy; j++) {
				screen[i][j] = 1;
			}
		}

	}
}
