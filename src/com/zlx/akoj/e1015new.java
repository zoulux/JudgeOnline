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
//		bl����key�����a,b,c value��������ǵ�ֵ
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
				for (int i = 0; i < tempsz.length; i++) {//��������
					String s=tempsz[i];
					if (!st.empty()&&st.peek().equals("*")) {//ջ��Ϊ�գ������䶥��Ԫ��Ϊ*ʱ
						String gzstrString=s+st.get(i-2);//����һ���ַ�������a*b���ַ���Ϊab
						st.pop();//����ջ��Ԫ��*��
						int t=bl.get(st.peek())*bl.get(s);//ջ��Ԫ��*��ǰԪ��
						st.pop();//����ջ��Ԫ��
						st.add(gzstrString);//�������ַ���ѹ��ջ��
						bl.put(gzstrString, t);//�������ַ�������ֵ����map��
					
					
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
