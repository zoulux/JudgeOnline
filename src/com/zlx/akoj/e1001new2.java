package com.zlx.akoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

//test
public class e1001new2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		st.nextToken();
		String string = st.sval;
		System.out.println(string);
		while (true) {
			st.nextToken();
			int a = (int) st.nval;
			st.nextToken();
			int b = (int) st.nval;
			if (a == b && a == 0) {
				return;
			}
			int sum = 0;
			for (int i = a; i <= b; i++) {
				sum += i;
			}

			System.out.println(sum);

		}

	}
}
