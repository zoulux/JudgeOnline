package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class e8 {
	public static class Rect {
		int id, length, width;

		public Rect() {
			this.id = 0;
			this.length = 0;
			this.width = 0;
		}
		public Rect(int id, int length, int width) {
			// TODO Auto-generated constructor stub
			this.id = id;
			this.length = length;
			this.width = width;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			Rect rect[] = new Rect[m];
			for (int i = 0; i < m; i++) {
				rect[i] = new Rect();
				rect[i].id = cin.nextInt();
				int a=cin.nextInt();
				int b=cin.nextInt();
				rect[i].length=Math.max(a, b);
				rect[i].width=Math.min(a, b);
		
			}
			Arrays.sort(rect, new Comparator<Rect>() {
				@Override
				public int compare(Rect r1, Rect r2) {
					// TODO Auto-generated method stub
					if (r1.id != r2.id) {
						return r1.id - r2.id;
					} else if (r1.length != r2.length) {
						return r1.length - r2.length;
					} else {
						return r1.width - r2.width;
					}
				}
			});
		   TreeSet<String> vec=new TreeSet<String>();
		   for(int i=0;i<m;i++){
			   int id, length, width;
			   id=rect[i].id;
			   length=rect[i].length;
			   width=rect[i].width;
			   String temp=""+id+" "+length+" "+width;
			   vec.add(temp);
		   }
			for (String s : vec) {
				String[] c=s.split(" ");
				System.out.println(c[0]+" "+c[1]+" "+c[2]);
			}
		}
	}
}
