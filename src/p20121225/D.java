package p20121225;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int T=cin.nextInt();
		while(T-->0){
			String s=cin.next();
			TreeMap<String, Integer> map=new TreeMap<String, Integer>();
			for (int i = 0; i < s.length(); i++) {
				String temp=s.charAt(i)+"";
				if (!map.containsKey(temp)) {
					map.put(temp, 1);
				}
				else {
					map.put(temp, map.get(temp)+1);
				}
			}
			int max=0;
			String string="";
			Set<String> set=map.keySet();
			Iterator<String> it=set.iterator();
			
			while (it.hasNext()) {
				String temp=it.next();
			if (map.get(temp)>max) {
				max=map.get(temp);
				string=temp;
			}
			}
			System.out.println(string);
		}
	}
}
