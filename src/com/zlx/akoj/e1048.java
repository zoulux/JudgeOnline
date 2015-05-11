package com.zlx.akoj;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class e1048 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		int[] A=new int[t];
		String S="";
		for (int i = 0; i < t; i++) {
			A[i]=cin.nextInt();
			S=S+A[i];
		}
		List<String> result = list(S, "");// 列出字符的组合，放入result

//		System.out.println(result.size());
//		System.out.println(result);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));


	}

	private static List<String> list(String base, String buff) {
		List<String> Result = new ArrayList<String>();// 存放结果信息。
		if (base.length() <= 0) {
			Result.add(buff);
		}
		for (int i = 0; i < base.length(); i++) {
			List<String> temp = list(new StringBuilder(base).deleteCharAt(i)
					.toString(), buff + base.charAt(i));
			Result.addAll(temp);

		}

		return Result;
	}

}
