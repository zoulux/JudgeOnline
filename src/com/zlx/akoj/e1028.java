package com.zlx.akoj;
import java.util.Scanner;

public class e1028 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		char[] sc = str.toCharArray();
		for (int i = 0; i < sc.length; i++)
			if ((sc[i] > 'z' || sc[i] < 'a') && (sc[i] > 'Z' || sc[i] < 'A'))
				sc[i] = ' ';
		for (int i = 0; i < sc.length - 1; i++)
			if (sc[i] == ' ' && sc[i + 1] != ' ')
				System.out.println();
			else if (sc[i] == ' ' && sc[i + 1] == ' ')
				continue;
			else
				System.out.print(sc[i]);
		System.out.println();

	}
}
