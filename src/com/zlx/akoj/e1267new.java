/*** Title: e1267new
* Description: 独木舟上的荡漾
* @author zoulux
* @date 2015年5月14日 上午10:09:07*/

package com.zlx.akoj;
import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class e1267new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
public static void main(String[] args) {
	while (cin.hasNext()) {
		int s = cin.nextInt();
		while (s-- > 0) {
			int w = cin.nextInt();
			int n = cin.nextInt();
			Vector<Integer> vector = new Vector<Integer>();
			for (int i = 0; i < n; i++) {
				
				vector.add(cin.nextInt());
			}
			solve(w,n, vector);
		}
		
	}
	cin.close();
}
private static void solve(int w,int n, Vector<Integer> vector) {
	Collections.sort(vector);
	int count=0;
	
	for (int i = 0; i < n; i++) {
		int it=vector.get(i);
		if (it!=0) {
			count++;
			for (int j = n-1; j >=i+1; j--) {
				int jt=vector.get(j);
				if (w-it>=jt&&jt!=0) {
					vector.set(j, 0);
					break;
				}
			}
		}
	}
	System.out.println(count);
			

	
	
}
}
