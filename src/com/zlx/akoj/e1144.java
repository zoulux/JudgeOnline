package com.zlx.akoj;
import java.util.HashMap;
import java.util.Scanner;
public class e1144 {
	public static void main(String[] args) {
		class point {
			double x;
			double y;
		}
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			HashMap hm = new HashMap();
			point P[] = new point[N];
			for (int i = 0; i < N; i++) {
				P[i] = new point();
				P[i].x = cin.nextDouble();
				P[i].y = cin.nextDouble();
				hm.put(P[i], P[i].y / P[i].x);
			}
			int max = 0;
			for (int i = 0; i < N; i++) {
				double k = (Double) hm.get(P[i]);
				int count = 0;
				for (int j = i; j < N; j++)
					if ((Double) hm.get(P[j]) == k)
						count++;
				if (count > max)
					max = count;
			}
			System.out.println(max);
		}

	}

}
