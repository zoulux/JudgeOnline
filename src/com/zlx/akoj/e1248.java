package com.zlx.akoj;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class e1248 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);

		while (true) {
			int k = cinScanner.nextInt();
			if (k == 0)
				break;
			Vector<Integer> vector = new Vector<Integer>();
			for (int i = 1; i <= k; i++) {
				vector.add(i);
			}
			int size = vector.size();
			int index = 0;
			while (true) {
				
				index = vector.indexOf(2);
				int j = index + 1;

				for (int i = 1; i <= size; i++) {
					if (j >= vector.size()) {
						j = 0;
					}
					if (vector.get(j) == 0) {
						j++;
					}
					
					System.out.println("j:" + j);
					System.out.println("i:" + i);
					System.out.println("index:" + index);
					

					if (vector.get(j)!=0) {
						vector.set(j, i);
					}
					j++;
					

				}
				vector.set(index, 0);

				System.out.println(">>>>>>>>>>>>>>>>");
				for (Integer integer : vector) {
					System.out.print(integer);
				}

				System.out.println(">>>>>>>>>>>>>>");
				size--;
				if (size == 1) {
					break;
				}

			}
		//	System.out.println(vector.indexOf(1));
		}
	}

}
