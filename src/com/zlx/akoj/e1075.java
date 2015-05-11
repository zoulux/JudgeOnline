package com.zlx.akoj;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class e1075 {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		Map< Integer, Integer> map1=new HashMap<Integer, Integer>();
		map1.put(1, 31);
		map1.put(2, 28);
		map1.put(3, 31);
		map1.put(4, 30);
		map1.put(5, 31);
		map1.put(6, 30);
		map1.put(7, 31);
		map1.put(8, 31);
		map1.put(9, 30);
		map1.put(10, 31);
		map1.put(11, 30);
		map1.put(12, 31);
		
		while (cin.hasNext()) {
			String[] arr=cin.next().split("/");
			int year=Integer.parseInt(arr[0]);
			int month=Integer.parseInt(arr[1]);
			int date=Integer.parseInt(arr[2]);
			int day=0;
			for(int i=1;i<month;i++){
				day+=map1.get(i);
			}
			day+=date;
			if (isRun(year)&&month>2) {
				day++;
			}
			
			System.out.println(day);
		}
	}

	private static boolean isRun(int year) {
		if ((year%4==0&& year%100!=0)||year%400==0) {
			return true;
		}
		
		
		return false;
	}
}
