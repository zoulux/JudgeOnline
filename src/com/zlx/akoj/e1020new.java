package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1020new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String data = cin.next();
			Vector<Integer> vector = new Vector<Integer>();
			int first = Integer.parseInt(data.charAt(0) + "");
			vector.add(first);
			int j=0;
			boolean flag=false;
			for (int i = 1; i < data.length(); i=j) {
				 j = i + 1;
				while(true){
					
	
					
					

					if (Integer.parseInt(data.substring(i, j)) > vector.get(vector.size()-1)) {
						System.out.println(Integer.parseInt(data.substring(i, j)));
						vector.add(Integer.parseInt(data.substring(i, j)));
						break;
					}
					
					j++;
					System.out.println("i:"+i);
					System.out.println("j:"+j);
					System.out.println("in:"+Integer.parseInt(data.substring(i, j)));
					System.out.println("sub:"+Integer.parseInt(data.substring(j)));
					
					if (Integer.parseInt(data.substring(j))<vector.get(vector.size()-1)) {
						vector.remove(vector.get(vector.size()-1));
						vector.add(Integer.parseInt(data.substring(j)));
						flag=true;
						break;
					}
					
				}
				if (false) {
					break;
				}
			}
//			for (Integer integer : vector) {
//				System.out.print(integer+" ");
//			}
		}
	}

}
