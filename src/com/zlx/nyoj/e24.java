package com.zlx.nyoj;
import java.util.Scanner;
import java.util.Vector;


public class e24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		Vector<Integer> vec=new Vector<Integer>();
		for (int i = 1; i < 99992; i++) {
			if (ispr(i)) {
				vec.add(i);
			}
		}
		//System.out.println(vec.size());
	//	System.out.println(vec.get(vec.size()-1));
//for (Integer integer : vec) {
//	System.out.println(integer);
//}
//		
		int N=cin.nextInt();
		while(N-->0){
			int M=cin.nextInt(),index=0,dis=0,indextemp=0;
			for (int i = 1; i < vec.size(); i++) {
				if (M<=vec.get(i)) {
					index=i;
					break;
				}
			}
			int disr=Math.abs(M-vec.get(index));
			int disl=Math.abs(M-vec.get(index-1));
			if (disl<=disr) {
			dis=disl;
			indextemp=index-1;
			} else{
				dis=disr;
				indextemp=index;
			}
			System.out.println(vec.get(indextemp)+" "+dis);
			
		}

	}


	private static boolean ispr(int a) {
		// TODO Auto-generated method stub
		if (a==1||a==0) {
			return false;
		}
		if (a==2||a==3) {
			return true;
		}
		
		
		if (a%2==0) {
			return false;
		}
		int sqa=(int)Math.sqrt(a);
		for (int i = 3; i <=sqa; i++) {
			if (a%i==0) {
				return false;
			}
		}
		
		
		
		return true;
	}

}
