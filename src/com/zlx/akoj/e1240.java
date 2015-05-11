package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class e1240 {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			double[] box = new double[3];
			for (int i = 0; i < 3; i++)
				box[i] = cin.nextDouble();
			if (box[0] == 0 && box[1] == 0 && box[2] == 0)
				break;

			double[] gift = new double[3];
			for (int i = 0; i < 3; i++)
				gift[i] = cin.nextDouble();

			Arrays.sort(box);
			Arrays.sort(gift);
			int flag = 0;
			for (int i = 0; i < 3; i++)
				if (box[i] < gift[i]) {
					con.println("No");
					flag = 1;
				}
			if (flag == 0)
				con.println("Yes");

		}

		cin.close();
		con.close();

	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);
}
