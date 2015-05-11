package com.zlx.akoj;
import java.util.Scanner;

public class e1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int flag = 0;
			for (int i = 10; i < 100; i++)
				if ((i % 3 == a) && (i % 5 == b) && (i % 7 == c)) {
					System.out.println(i);
					flag = 1;
					break;
				}

			if (flag == 0)
				System.out.println("No answer");
		}
	}
}
