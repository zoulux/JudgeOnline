/*** Title: e456new
 * Description: 
 * @author zoulux
 * @date 2015年5月17日 上午9:50:12*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e456new {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static int n = 0;
	static int[] A = new int[1010];
	static long vv = 0, max = 0;
	static long total = 0;

	public static void main(String[] args) throws IOException {
		
	
		while (st.nextToken()!=st.TT_EOF) {
	//		Arrays.fill(A, 0);
			total = 0;
			vv = 0;
			max = 0;

		//	st.nextToken();
			n = (int) st.nval;
			
			for (int i = 0; i < n+2; i++) {
				A[i]=0;
			}
			

			for (int i = 0; i < n; i++) {
				st.nextToken();
				A[i] = (int) st.nval;
				total += A[i];

			}
		
			
			DFS1(0, total >>1,0);
			System.out.println(total - (max <<1));

		}
	}

	private static void DFS1(int i, long l,long sum) {
		if (i == n) {
			if (sum > max) {
				max = sum;
			}
			return;
		}

		if (l >= A[i] ) {
			DFS1(i+1, l-A[i],sum+A[i]);
			DFS1(i+1, l,sum);
			
		}else {
			DFS1(i+1, l,sum);
		}

	}
	
	
	
	

	private static void DFS(int i) {

		if (i == n) {
			if (vv > max) {
				max = vv;
			}
			return;
		}

		if (total - A[i] >= 0) {
			total -= A[i];
			vv += A[i];
			DFS(i + 1);
			total += A[i];
			vv -= A[i];
		}
		DFS(i + 1);
	}
}
