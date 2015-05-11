package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e1211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			// Vector<Integer> vec=new Vector<Integer>();
			int n = cin.nextInt();
			int[] list = new int[n];
			String str = "";
			for (int i = 0; i < n; i++) {
				list[i] = cin.nextInt();
				str += (list[i] + "");
			}
			Arrays.sort(list);
			int count[] = new int[n];
			for (int i = 0; i < n; i++) {
				String temp = str.charAt(i) + "";
				if(temp==" ")
					continue;
				
				int t = 0;
				int w = 0;
				while ((w = str.indexOf(temp, t)) != -1) {
					count[i]++;
					t = w + 1;
				}
				str=str.replace(temp, " ");
			}
			for(int i=0;i<n;i++)
				System.out.println(count[i]);
		}

	}
}
