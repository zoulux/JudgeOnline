package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;
                  //这种方法不可行，因为binarysearch是二分法快速查找，
public class e241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			String str = cin.next();
			char sc[] = str.toCharArray();
			int[] s = new int[26];
			for (int i = 0; i < sc.length; i++)
				s[sc[i] - 'a']++;
			int[] p = s.clone();

			Arrays.sort(p);

			System.out.println((char) ('a' + Arrays.binarySearch(s, p[p.length-1])));

		}

	}

}
