package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1265 {
	static	class team implements Comparable<team>{
		String name;// 球队名称
		int jf = 0;// 积分
		int jsq = 0;// 净胜球
		int jqs = 0;// 进球数
		@Override
		public int compareTo(team t2) {
			team t1=this;
			if (t1.jf != t2.jf) {
				return t2.jf-t1.jf;
			} else if (t1.jsq!= t2.jsq) {
				return t2.jsq-t1.jsq;
			} else {
				return t2.jqs-t1.jqs;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
	
		String A = cin.next();
		String B = cin.next();
		String C = cin.next();
		String D = cin.next();
	
		team[] T = new team[4];
        T[0]=new team();
        T[1]=new team();
        T[2]=new team();
        T[3]=new team();
		T[0].name = A;
		T[1].name = B;
		T[2].name = C;
		T[3].name = D;
		
		int N = cin.nextInt();
		for (int i = 0; i < N; i++) {
			//读取数据暂存
			String t1 = cin.next();
			String t2 = cin.next();
			int t1fs = cin.nextInt();
			int t2fs = cin.nextInt();

			int temp1 = 0;
			int temp2 = 0;

			for (int j = 0; j < 4; j++) 
				{
					if (T[j].name.equals(t1))
						temp1 = j;//取出球队t1的下标
					if (T[j].name.equals(t2))
						temp2 = j;//取出球队t2的下标
				}

				if (t1fs > t2fs) {
					T[temp1].jf += 3;
					T[temp1].jqs += t1fs;
					T[temp1].jsq +=( t1fs - t2fs);
				}

				if (t2fs > t1fs) {
					T[temp2].jf += 3;
					T[temp2].jqs += t2fs;
					T[temp2].jsq += (t2fs - t1fs);
				}

				if (t1fs == t2fs) {
					T[temp1].jf += 1;
					T[temp1].jqs += t1fs;
					T[temp1].jsq +=( t1fs - t2fs);

					T[temp2].jf += 1;
					T[temp2].jqs += t2fs;
					T[temp2].jsq +=( t2fs - t1fs);
				}
			
		}
//		for(int t=0;t<4;t++)
//			System.out.println(T[t].name+T[t].jf+T[t].jqs+T[t].jsq);
		Arrays.sort(T);
		System.out.println(T[0].name+" "+T[1].name);

	}
}