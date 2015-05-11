package com.zlx.akoj;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class e8new {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			//String rect[]=new String[m];
			Set<String> RectSet=new TreeSet<String>();
			for (int i = 0; i < m; i++) {
				int id=cin.nextInt()
				, length=cin.nextInt()
				, width=cin.nextInt();
				String temp=""+id+Math.max(length, width)+Math.min(length, width);
				RectSet.add(temp);
			}
			for (String s : RectSet) {
				System.out.println(s.charAt(0)+" "+s.charAt(1)+" "+s.charAt(2));
			}
		}
	}
}
