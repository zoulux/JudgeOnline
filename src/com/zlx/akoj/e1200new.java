package com.zlx.akoj;
import java.util.Scanner;
public class e1200new {
	public static void main(String[] args) {//别把我惹急了
		Scanner cin = new Scanner(System.in);
		int cas = cin.nextInt();
		while (cas-- > 0) {
			int AB = cin.nextInt();
			int AC = cin.nextInt();
			int BC = cin.nextInt();
			int flag=0;
			for(int A=1;A<100000;A++)
				for(int B=1;B<100000;B++)
					for(int C=1;C<100000;C++)
						if(A+B==AB&&A+C==AC&&B+C==BC)
						{
							System.out.println(A+" "+B+" "+C);
							flag=1;break;
						}
		if(flag==0)
			System.out.println("Impossible");
		}
	}

}
