package com.zlx.akoj;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;


public class e1015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			HashMap<String, Integer> bl = new HashMap<String, Integer>();
			while (cin.hasNext()) {
				String temp = cin.nextLine();
				String[] tempsz = temp.split(" ");
				if (temp.equals("%%%")) {
					break;
				}
				bl.put(tempsz[0], Integer.parseInt(tempsz[2]));
			}

			// Set<String> key=bl.keySet();
			// for ( java.util.Iterator<String> it=key.iterator();it.hasNext();)
			// {
			// String s = (String) it.next();
			// System.out.println(s+" "+bl.get(s));
			// }

			while (cin.hasNext()) {
				String temp = cin.nextLine();
				String[] tempsz = temp.split(" ");
				Stack<String> zm = new Stack<String>();
				Stack<String> fh = new Stack<String>();
				for (int i = 0; i < tempsz.length; i++) {
					String s = tempsz[i];
					if (s.equals("+") || s.equals("-") || s.equals("*")) {
						fh.add(s);
					} else {
						zm.add(s);
					}
				}
				
				
				
				
				for (int i = 0; i < fh.size(); i++) {
					if (fh.get(i).equals("*")) {
						int t = bl.get(zm.get(i)) * bl.get(zm.get(i + 1));
						fh.remove(i);
						String str=zm.get(i)+zm.get(i+1)+"";
						bl.put(str, t);
						zm.set(i, str);
						zm.remove(i + 1);
//						System.out.println("有乘号");
//						System.out.println("乘的数值 " + t);
					}
				}

//				for (String string : zm) {
//					System.out.println("zm " + string);
//				}
//				for (String string : fh) {
//					System.out.println("fh " + string);
//				}

				int result = bl.get(zm.get(0));
				for (int i = 0; i < fh.size(); i++) {
					if (fh.get(i).equals("+")) {

						int t = bl.get(zm.get(i + 1));
						result += t;
						// System.out.println("字母 "+zm.get(i+1));
						// System.out.println("值为 "+t);

					}
					if (fh.get(i).equals("-")) {
						int t = bl.get(zm.get(i + 1));
						result -= t;
						// System.out.println("字母 "+zm.get(i+1));
						// System.out.println("值为 "+t);

					}
				}
				System.out.println(result);
			}

		}

	}

}
