package p20121225;

import java.util.Arrays;
import java.util.Scanner;

public class F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while (true) {
			int N=cin.nextInt();
			if (N==0) {
				break;
			}
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=cin.nextInt();
		}
		Arrays.sort(arr);
		if (N%2==0) {
			System.out.println((int)((arr[N/2-1]+arr[N/2])/2));
		}else {
			System.out.println((int)arr[N/2]);
		}

			
		}
		
	}

}
