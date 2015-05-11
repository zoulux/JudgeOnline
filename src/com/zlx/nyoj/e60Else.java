package com.zlx.nyoj;
import java.util.Scanner;

public class e60Else {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int cnt = cin.nextInt();
			int nn = cnt;
			int i = 0;
			String[] map = new String[nn * 2];
			while (cnt-- > 0) {
				String name = cin.next();
				int grade = cin.nextInt();
				int avgClass = cin.nextInt();
				String cadre = cin.next();
				String west = cin.next();
				int thesis = cin.nextInt();
				int money = getMoney(name, grade, avgClass, cadre, west, thesis);
				map[i] = name;
				map[i + 1] = money + "";
				i += 2;
			}
			int max = Integer.parseInt(map[1]);
			int count = 0;
			String stu_name = "";
			for (int j = 1; j < map.length; j += 2) {
				int m = Integer.parseInt(map[j]);
				if (max < m) {
					max = m;
					stu_name = map[j - 1];
				}

				count += m;
			}
			System.out.println(stu_name + "\n" + max + "\n" + count);
		}
	}

	private static int getMoney(String name, int grade, int avgClass,
			String cadre, String west, int thesis) {
		int m = 0;
		if (grade > 80 && thesis > 0)
			m += 8000;
		if (grade > 85 && avgClass > 80)
			m += 4000;
		if (grade > 90)
			m += 2000;
		if (grade > 85 && west.equals("Y"))
			m += 1000;
		if (grade > 80 && cadre.equals("Y"))
			m += 850;
		return m;
	}

}