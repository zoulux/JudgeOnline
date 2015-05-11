package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1248new {

	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		Vector<Integer> vector = new Vector<Integer>();
		while (true) {
			int k = cinScanner.nextInt();
			if (k == 0) {
				break;
			}
			solve(vector, k);
			vector.clear();
		}

	}

	private static void solve(Vector<Integer> vector, int k) {
		int t = k - 1;
		for (int i = 1; i <= k; i++) {
			vector.add(i);
		}
		/**
		 * k是数组的长度
		 * index是当前状态下2的位置，
		 * init是for循环运行的起始位置
		 * t是for循环运行的次数
		 **/
		

		while (true) {

			int index = vector.indexOf(2);
			int init = index + 1;

			for (int i = 1; i <= t; i++) {
				if (init == k) {
					init = 0;
				}
				
				
				System.out.println("index:"+index);
				System.out.println("init:"+init);
				System.out.println("i:"+i);
				System.out.println(">>>>>>>>>>>>>>>");
				init = f(vector, init);
				
				
				vector.set(init, i);
				init++;
			}
			vector.set(index, 0);
			for (Integer integer : vector) {
				System.out.print(integer);
			}
			t--;

		}

	}

	private static int f(Vector<Integer> vector, Integer i) {
		if (vector.get(i)==0) {
			return f(vector, i++);
		}
		
		return i;
	}

}
