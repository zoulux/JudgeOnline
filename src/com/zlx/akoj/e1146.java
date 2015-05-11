package com.zlx.akoj;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Man {
	String name;
	int year=0, month=0, day=0;
}
public class e1146 {//大章学长代码，已看懂

	public static void main(String[] args) {


		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Man man[] = new Man[n];

		for (int i = 0; i < n; i++) {
			man[i] = new Man();
			man[i].name = cin.next();
			man[i].year = cin.nextInt();
			man[i].month = cin.nextInt();
			man[i].day = cin.nextInt();
		}
		Arrays.sort(man, new Comparator<Man>() {
			@Override
			public int compare(Man m1, Man m2) {
				if (m1.year != m2.year) {
					return m1.year - m2.year;
				} else if (m1.month != m2.month) {
					return m1.month - m2.month;
				} else {
					return m1.day - m2.day;
				}
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println(man[i].name);
		}

	}
}
