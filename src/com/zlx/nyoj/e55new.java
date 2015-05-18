/*** Title: e55
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午2:52:29*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class e55new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Queue<Long> vector = new PriorityQueue<Long>();
	static	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	public static void main(String[] args) throws IOException {
		st.nextToken();
		int N = (int) st.nval;
		while (N-- > 0) {
			vector.clear();
			st.nextToken();
			int n = (int) st.nval;
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				
				vector.add((long) st.nval);
			}

			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {

		long sum = 0,temp=0;
		
		while (vector.size() != 1) {
			temp=vector.poll()+vector.poll();
			sum+=temp;
			vector.add(temp);

		}
		System.out.println(sum);

	}

}
