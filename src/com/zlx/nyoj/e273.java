package com.zlx.nyoj;
import java.util.Scanner;

public class e273 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			String str = cin.next();
			char[] sc = str.toCharArray();
			int count = 0;
			for (int i = 0; i < sc.length; i++)
				if (sc[i] >= 'a' && sc[i] <= 'z')
					count++;
			int ys = count % 26;
			if (ys == 0)
				System.out.println('z');
			else
			{System.out.printf("%c", 'a' + ys - 1);
			System.out.println();}

		}

	}

}
