package com.zlx.akoj;
import java.util.Scanner;

public class e1002new1 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int count = 0;
		while (cin.hasNext()) {
			String num = cin.next();
			String num1 = num;
			String num2 = num;
			String num3 = num;

			int flag = 0;//���ñ��
			
			for (int i = 0; i < 11; i++) {//�ж��Ƿ���4
				if (num1.contains("4")) {
					flag = 1;
					break;
				}
				num1 = num1.replaceFirst("6", "");
			}

			if (flag == 1)//�жϱ��
				continue;

			int count6 = 0;
			for (int i = 0; i < 11; i++) {//�ж�6�ĸ���
				if (num2.contains("6"))
					count6++;
				num2 = num2.replaceFirst("6", "");
			}

			int count8 = 0;
			for (int i = 0; i < 11; i++) {//�ж�8�ĸ���
				if (num3.contains("8"))
					count8++;
				num3 = num3.replaceFirst("8", "");
			}

			if (count6 >= 5 || count8 >= 5||count6+count8>=5)
				{System.out.println(num);
				count++;}
		}
		System.out.println(count);

	}
}
