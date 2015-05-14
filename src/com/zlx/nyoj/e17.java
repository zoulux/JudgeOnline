/*** Title: e17
 * Description: ���������������
 * @author zoulux
 * @date 2015��5��12�� ����10:16:32*/
package com.zlx.nyoj;

import java.util.Scanner;

public class e17 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			while (n-- > 0) {
				String data = cin.next();
				solve(data);
			}
		}

	}

	private static void solve(String data) {
		int[] length = new int[data.length()+1];
		int i,j;
		/**
		 * û���õ���̬���ѵ��ȵ�ǰ��ģ��Ͱѵ�ǰ��Ϊ��׼����������
		 */
		
		for ( i = 0; i < data.length(); i++) {
			char last=data.charAt(i);
			int count=1;
			for ( j = i+1; j < data.length(); j++) {
				char now=data.charAt(j);
					if (last<now) {
						count++;
						last=now;
					}
			}
			length[i]=count;
		}
		for (int l : length) {
			System.out.println(l);
		}
		System.out.println();
	}
}
