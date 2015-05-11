package com.zlx.akoj;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class e1167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N=cin.nextInt();
			Vector<Integer> M=new Vector<Integer>(); 
			int[] list=new int[N];
			for(int i=0;i<N;i++)
				list[i]=cin.nextInt();
			
			for(int i=0;i+2<N;i+=3)
				{
				if((i+1)%2==1)
				M.add(	max(list[i],list[i+1],list[i+2]));
				else
					M.add(min(list[i],list[i+1],list[i+2]));
				}

			System.out.println(M.get(M.size()-1));
		}

	}

	private static Integer min(int a, int b, int c) {
		int[] temp={a,b,c};
		Arrays.sort(temp);
		return temp[0];
	}

	private static Integer max(int a, int b, int c) {
		int[] temp={a,b,c};
		Arrays.sort(temp);
		return temp[2];
	}

}
