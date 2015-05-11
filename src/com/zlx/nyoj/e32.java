package com.zlx.nyoj;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class e32 {

	private static boolean[] used = new boolean[20];
	static int[] a = new int[used.length];
	static Scanner cin = new Scanner(System.in);
	static Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public static void main(String[] args) throws IOException {
		 printDFS(0, cin.nextInt(), cin.nextInt());
		//printDFS(0, 5, 3);
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}

	private static void printDFS(int i, int n, int part) {
		if (i >= part || i == n) {
			int value = 0;
			int b[] = a.clone();
			Arrays.sort(b, 0, i);
			for (int j = i; j >= 0; j--) {
				value = value * 10 + b[j];
			}
			set.add(value);
		} else {
			for (int j = 0; j < n; j++)
				if (!used[j]) {
					used[j] = true;
					a[i] = j + 1;
					printDFS(i + 1, n, part);
					used[j] = false;
				}
		}
	}
}
