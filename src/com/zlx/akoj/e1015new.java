package com.zlx.akoj;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class e1015new {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
//		while (cin.hasNext()) {
//		bl里面key存的是a,b,c value存的是他们的值
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
				Stack<String> st = new Stack<String>();
				for (int i = 0; i < tempsz.length; i++) {//遍历数组
					String s=tempsz[i];
					if (!st.empty()&&st.peek().equals("*")) {//栈不为空，并且其顶端元素为*时
						String gzstrString=s+st.get(i-2);//构造一个字符串，如a*b则字符串为ab
						st.pop();//弹出栈顶元素*号
						int t=bl.get(st.peek())*bl.get(s);//栈顶元素*当前元素
						st.pop();//弹出栈顶元素
						st.add(gzstrString);//将构造字符串压入栈中
						bl.put(gzstrString, t);//将构造字符串及其值存入map中
					
					
					}
					else {
						st.add(s);
					}
				}
				int result=bl.get(st.get(0));
				for (int i = 0; i < st.size()-1; i++) {
					String key=st.get(i);
					String nextkey=st.get(i+1);
					
					if (key.equals("+")) {
						result+=bl.get(nextkey);
					}
					if (key.equals("-")) {
						result-=bl.get(nextkey);
					}
					
				}
				System.out.println(result);


			}

		}

//	}

}
