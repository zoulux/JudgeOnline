/*** Title: e20
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 上午8:44:02*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class e20 {

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static final int size = 100010;
	//static Vector<Integer> A[] = new Vector[size];

	//static Vector<Integer> A[] = new Vector<Integer>[size];
	
	static Map<Integer, Vector<Integer>> map=new HashMap<Integer, Vector<Integer>>();
	
	static int pre[] = new int[size];
	

	public static void main(String[] args) {
		new e20();
		
		int M = cin.nextInt();

		while (M-- > 0) {
			int N = cin.nextInt();

			for (int i = 0; i < N+1; i++) {
		//		A[i].clear();
				pre[i] = 0;
			}
			int S = cin.nextInt();
			for (int i = 0; i < N-1; i++) {
				System.out.println(">>>");
				int a = cin.nextInt();
				int b = cin.nextInt();
			
				if (!map.containsKey(a)) {
					Vector<Integer> vector=new Vector<Integer>();
					vector.add(b);
					map.put(a, vector);
				}else {
					Vector<Integer> vector=map.get(a);
					vector.add(b);
					map.put(a, vector);
				}
				if (!map.containsKey(b)) {
					Vector<Integer> vector=new Vector<Integer>();
					vector.add(a);
					map.put(b, vector);
				}else {
					Vector<Integer> vector=map.get(b);
					vector.add(a);
					map.put(b, vector);
				}
				
			}
			
			
			DFS(S);
			System.out.println(Arrays.toString(pre));

		}
		cin.close();
	}

	private static void DFS(int i) {
		int size=map.get(i).size();
		for (int k = 1; k < 10; k++) {
			System.out.println(map.get(k));
		}
		
	
		for (int j = 0; j < size; i++) {
			int t=map.get(i).get(j);
			if (pre[t] != 0) {
				continue;
			}
			pre[t] = i;
			DFS(t);
		}
	}
}
