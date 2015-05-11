package com.zlx.akoj;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.xml.stream.events.EndDocument;

public class e1251  {
	
	
	public static void main(String[] args) {

		class Time implements Comparable<Time>{
			int begin;
			int end;
			@Override
			public int compareTo(Time o) {

				return this.end-o.end;
			}
		}
		
		Scanner cin = new Scanner(System.in);

		
		
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0) {
				break;
			}
			
			Time time[]=new Time[n];
			for (int i = 0; i < time.length; i++) {
				time[i]=new Time();
				time[i].begin=cin.nextInt();
				time[i].end=cin.nextInt();
			}
			Arrays.sort(time);
			
			int t=-1;
			int count=0;
			for (int i = 0; i < time.length; i++) {
				if (time[i].begin>=t) {
					t=time[i].end;
					count++;
				}
			}
			System.out.println(count);
		}
	}

	
}