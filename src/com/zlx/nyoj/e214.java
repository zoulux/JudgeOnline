/*** Title: e214
* Description: 单调递增子序列(二)
* @author zoulux
* @date 2015年5月13日 下午2:40:09*/

package com.zlx.nyoj;
import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;
public class e214 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int[] data=new int[10];
	static int[] dp=new int[10];
	
public static void main(String[] args) {
	while (cin.hasNext()) {
		int N=cin.nextInt();
		for (int i = 0; i < N; i++) {
			data[i]=cin.nextInt();
		}
		solve( N);
	}
	cin.close();
}

private static void solve(int n) {
	dp[0]=Integer.MIN_VALUE;
	dp[1]=data[0];
	int count=1,j=0;
	for (int i = 0; i < n; i++) {
	//	j=binarySearch(data[i],count);
		j=search(data[i],count);
		dp[j]=data[i];
		if (j>count) {
			count=j;
		}
	}
	System.out.println(count);
}

private static int binarySearch(int x, int count) {
	int t[]=new int[count+1];
	for (int j = 0; j < t.length; j++) {
		
		t[j]=data[j];
	}
	int w=Arrays.binarySearch(t, x);
	System.out.println("x:"+x+"count:"+count);
	System.out.println("w:"+w);
	System.out.println(Arrays.toString(t));
	
	return Math.abs(w);
}

static int search(int x,int len)
{
    int mid,left,right;
    left=1;
    right=len;
    mid=(right+left)/2;
    while(left<=right)
    {
        if(x>dp[mid])
        {
            left=mid+1;
        }
        else
            if(x<dp[mid])
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
            mid=(right+left)/2;
    }
    System.out.println("len:"+len);
    System.out.println("x:"+x);
 System.out.println(   Arrays.toString(dp));
    
    System.out.println("left:"+left);
    return left;
}
}
