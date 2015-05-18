/*** Title: e325new
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午9:58:45*/

package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class e325new {
	static int[] temp = new int[1000];
	private static int max;
	private static int sz;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Arrays.fill(temp, 0);
			sz = sc.nextInt();
			temp = new int[sz];
			int sum = 0;
			for (int i = 0; i < sz; i++) {
				temp[i] = sc.nextInt();
				sum += temp[i];
			}
			max = 0;
			count1(0, sum >>1, 0);
			System.out.println(sum - max * 2);
			// System.out.println(count(sum,temp));

		}
	}

	private static void count1(int i, int spare, int sum ) {

		if (i == sz) {
			if (max < sum) {
				max = sum;
			}
			return;
		}
		if (spare >= temp[i]) {
			count1(i + 1, spare - temp[i], sum + temp[i]);
			count1(i + 1, spare, sum);
		} else {
			count1(i + 1, spare, sum);
		}
	}

	private static int count(int sum, int[] temp) {
		int[] dp = new int[sum / 2 + 1];
		for (int i = 0; i < temp.length; i++) {
			for (int j = sum / 2; j >= temp[i]; j--) {
				if (dp[j] < (dp[j - temp[i]] + temp[i])) {
					dp[j] = dp[j - temp[i]] + temp[i];
				}
			}
		}
		return sum - dp[sum / 2] * 2;
	}

}
