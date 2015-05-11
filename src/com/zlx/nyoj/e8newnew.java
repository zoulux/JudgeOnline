package com.zlx.nyoj;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class e8newnew {
	public static class Rect implements Comparator<Rect>{
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
		@Override
		public int compare(Rect r1, Rect r2) {
			if (r1.id != r2.id) {
				return r1.id - r2.id;
			} else if (r1.length != r2.length) {
				return r1.length - r2.length;
			} else {
				return r1.width - r2.width;
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			 Set<Rect> set = new TreeSet<Rect>(new Rect());
			for (int i = 0; i < m; i++) {
				Rect r=new Rect();
				r.id = cin.nextInt();
				int a=cin.nextInt();
				int b=cin.nextInt();
				r.length=Math.max(a, b);
				r.width=Math.min(a, b);
				set.add(r);
		
			}

			for (Rect s : set) {
				System.out.println(s.id+" "+s.length+" "+s.width);
				
			}
		}
	}
}
