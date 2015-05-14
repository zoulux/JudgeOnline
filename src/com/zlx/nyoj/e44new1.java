/*** Title: e44
 * Description: �Ӵ���
 * @author zoulux
 * @date 2015��5��12�� ����6:43:41*/
package com.zlx.nyoj;

import java.io.BufferedInputStream;

public class e44new1 {
	static BufferedInputStream bis=new BufferedInputStream(System.in);
	public static void main(String[] args) throws Exception {
		int N =getInt();
		while (N-- > 0) {
			int n = getInt();
			int data[] = new int[n+1];
			for (int i = 1; i <= n; i++) {
				data[i] = getInt();
			}

			solve(data);
		}
		bis.close();
	}

	private static void solve(int[] data) {
		int max=0,s=0;
		//s�����Ӵ��ͣ�max��������Ӵ���
		for (int d : data) {
			if (s>0) { 
				s+=d;
			}else {
				s=d;
			}
			if(s>max)
				max=s;
		}
		System.out.println(max);
		
		
	}
	static int getInt() throws Exception {
		int i;
		// ' ':32 '\t':9 '\n':10
		// ��ȥ�����
		while ((i = bis.read()) < 45)
		;
		int temp = 0, mark = 1;
		if (i == 45) {
		mark = -1;
		i = bis.read();
		}
		while (i > 47) {
		temp = temp * 10 + i - 48;
		i = bis.read();
		}
		return mark * temp;
		}


}
