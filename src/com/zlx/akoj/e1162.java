package com.zlx.akoj;
import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;
import java.util.Vector;


public class e1162 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);

		while(cin.hasNext()){
			String string=cin.nextLine();
			Vector<Integer> vectorOp=new Vector<Integer>();
			Vector<Integer> vectorVal=new Vector<Integer>();
			
			for (int i = 0; i < string.length(); i++) {
				char op=string.charAt(i);
				if (op=='+') {
					vectorOp.add(1);
				}
				if (op=='-') {
					vectorOp.add(2);
				}
				if (op=='*') {
					vectorOp.add(3);
				}
				if (op=='/') {
					vectorOp.add(4);
				}
			}
			
			
		}
		
		
		

	}

}
