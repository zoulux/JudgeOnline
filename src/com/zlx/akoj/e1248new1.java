package com.zlx.akoj;

import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;
import java.util.Vector;

import org.omg.CORBA.DATA_CONVERSION;

public class e1248new1 {
	class mList {
		int[] data;
		int size;
		int index;

		public mList(int n) {
			data = new int[n];
			size=n;
		}
		public void put(int pos,int t){
			if (pos>size) {
			;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int k = cin.nextInt();
			if (k == 0)
				break;
			solve(k);
		}
	}

	private static void solve(int k) {

	}

}
