package com.zlx.akoj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class e1211newHash {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] A = new int[n];
			for (int i = 0; i < n; i++)
				A[i] = cin.nextInt();

			HashMap hm = new HashMap();

			for (int i = 0; i < n; i++) {
				int count = 0;
				if (!hm.containsKey(A[i])) {
					for (int j = 0; j < n; j++)
						if (A[i] == A[j])
							count++;
					hm.put(A[i], count);
				}
			}
			
			Object[] s=hm.keySet().toArray();
			for(int i=0;i<s.length;i++)
				System.out.println(s[i]+" "+hm.get(s[i]));
			
//			Set<String> keySet = hm.keySet();
//			Iterator<Integer> iterator = keySet.iterator();
//			while (iterator.hasNext()) {
//				int key = iterator.next();
//				Integer valve = (Integer) hm.get(key);
//				System.out.println("" + keyString + "," + value);
//			}
			
		}
	}

}
