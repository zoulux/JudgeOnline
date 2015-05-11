package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;
public class e1004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			if (m <= 2){
				int[] kp1 = new int[m];
			for (int i = 0; i < m; i++)
				kp1[i] = cin.nextInt();
				System.out.println("yes");}
			else {
				int flag=0;
				int[] kp = new int[m];
				for (int i = 0; i < m; i++)
					kp[i] = cin.nextInt();
				Arrays.sort(kp);
				int t = kp[1] - kp[0];
				for (int i = 1; i < m; i++)
					if (kp[i] - kp[i - 1]!=t  )
						flag=1;
					
				if(flag==1)
					System.out.println("no");
				else
					System.out.println("yes");

			}

		}

	}

}
