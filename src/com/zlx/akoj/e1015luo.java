package com.zlx.akoj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class e1015luo {
	   public static String key(String s)
	   {
		   String reString=null;
		   for (int i = 0; i <s.length(); i++)
		    {
			 if (s.charAt(i)==' ')
			 {
				reString = s.substring(0,i);
				break;
			 }  
				   
			   
		}
		   return reString;
		   
		   
	   }
	public static int value(String s)
	{
	int res=0;
	int tot=0;
	for (int i = 0; i <s.length(); i++) {
		if (s.charAt(i)==' ') {
			tot++;
			if (tot==2) {
				res = Integer.parseInt(s.substring(i+1,s.length()));
				break;
			}
			
		}
	}
	return res;	
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		while (cinScanner.hasNext()) {

			String string = cinScanner.nextLine();
			if (string.equals("%%%")) {
				break;
			}

			hashMap.put(key(string), value(string));
			list.add(key(string));

		}
		while (cinScanner.hasNext()) {
			ArrayList<String> arrayList = new ArrayList< String>();
			String s1 = cinScanner.nextLine();
			for (int i = 2; i < s1.length(); i += 4) {
				arrayList.add(s1.charAt(i) + "");
			}
			
			int i=4;
			int res = hashMap.get(s1.charAt(0) + "");
			for (int k = 0; k < arrayList.size(); k++) {
					if (arrayList.get(k).equals("+")) {
						{
							res = res + hashMap.get(s1.charAt(i) + "");
							i+=4;
						}
					} else if (arrayList.get(k).equals("-")) {
						{
							res = res - hashMap.get(s1.charAt(i) + "");
							i+=4;
						}
					} else if (arrayList.get(k).equals("*")) {
						{
							res = res * hashMap.get(s1.charAt(i) + "");
							i+=4;
						}
					}
				

			}
			System.out.println(res);
		}
	}
}