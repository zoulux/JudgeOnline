package com.zlx.akoj;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int L = cin.nextInt();
			int[] list = new int[L];

			for (int i = 0; i < L; i++)
				list[i] = cin.nextInt();

			// Vector<Integer> count=new Vector<Integer>();
			// for (int i = 0; i < L; i++)
			// {int k=0;
			// for (int j = i + 1; j < L; j++)
			// if (list[i] == list[j])
			// count.get(k++);}
			// Collections.sort(count);
			// System.out.println(count.get(count.size()-1)+1);
	
		
			int[] count = new int[L];
			for (int i = 0; i < L; i++)
				for (int j = i + 1; j < L; j++)
					if (list[i] == list[j])
						count[i]++;
			Arrays.sort(count);
			System.out.println(count[count.length - 1] + 1);

		}

	}
}
