package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1122 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Vector<Integer> list = new Vector<Integer>();

		for (int i = 1; i <= 9; i++)
			for (int j = 1; j <= 9; j++)
				for (int k = 1; k <= 9; k++)
					if (i != j && j != k && i != k)
						list.add(i * 100 + j * 10 + k);

		int L = list.size();
//	for (Integer integer : list) {
//		System.out.println(integer);
//	}

		for (int i = 0; i < L; i++)
			for (int j = i + 70; j < L; j++)
				for (int k = j + 70; k < L; k++)
					if (list.get(k) == 3 * list.get(i)
							&& list.get(j) == 2 * list.get(i)) {
				
						if (f(list.get(i), list.get(j))&&f(list.get(i), list.get(k))&&f(list.get(j), list.get(k)))
						{
								System.out.println(list.get(i) + " " + list.get(j)
									+ " " + list.get(k));
						}
						
					}
		
	}

	private static boolean f(Integer a, Integer b) {
		String A=String.valueOf(a);
		String B=String.valueOf(b);
		boolean flag=true;
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				if (A.charAt(i)==B.charAt(j)) {
					flag=false;
				}
			}
		}
		
		return flag;
	}

}
