/*** Title: e19new
 * Description: 
 * @author zoulux
 * @date 2015年5月17日 上午11:10:51*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e19new {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static int n, m;
	static int[] data=new int[100];

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int N = (int) st.nval;
		while (N-- > 0) {
			Arrays.fill(data, 0);

			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;

			F(n,m,0);

		}

	}

	private static void F(int n, int m,int k) {
		
		if (k==m) {
			for (int i = 0; i < k; i++) {
				System.out.print(data[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i = 1; i <=n; i++) {
			int flag=0;
			
			for (int j = 0; j < k; j++) {
				if (data[j]==i) {
					flag=1;
					break;
				}
				
			}
			
			if (flag==0) {
				data[k]=i;
				F(n,m,k+1);
			}
			
		}

	}
}
