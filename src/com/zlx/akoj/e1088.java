package com.zlx.akoj;

import java.util.Scanner;

class Tree2 {
	StringBuffer postOrder = new StringBuffer(); //����һ�����յĴ洢���

	public StringBuffer getPostOrder() {
		return this.postOrder.reverse();	//���ڵݹ��ˣ����Ա��뽫�ַ�������
	}

	public void getPost(String preOrder, String midOrder) {
		if (preOrder.length() == 1 && midOrder.length() == 1) {
			postOrder.append(preOrder);    //��ֻ��һ���ַ�ʱֱ��׷�ӵ��ַ���ĩβ
			return;
		}

		char root = preOrder.charAt(0);  //���ڵ�

		String preOrder_left = new String(); //ǰ���������
		String preOrder_right = new String();//ǰ���������
		String midOrder_left = new String();//�����������
		String midOrder_right = new String();//�����������

		postOrder.append(root);		//׷�Ӹ��ڵ�

		int midOrder_root_index = midOrder.indexOf(root);	//�����в��Ҹ��ڵ��λ��
		midOrder_left = midOrder.substring(0, midOrder_root_index);	//�����������
		midOrder_right = midOrder.substring(midOrder_root_index + 1);//�����������

		preOrder = preOrder.substring(1);	//ǰ��ȥ�����ڵ�

		int midOrder_left_length = midOrder_left.length();  //���������������

		int index = -1;
		for (int i = 0; i < midOrder_left_length; i++) {
			int tmp = preOrder.indexOf(midOrder_left.charAt(i));
			if (tmp > index)
				index = tmp;								//ǰ���е������������һ���ڵ��λ��
		}													

		preOrder_left = preOrder.substring(0, index + 1);		//ǰ���������
		preOrder_right = preOrder.substring(index + 1);			//ǰ���������
		/*
		 * ����ǿ��һ�£���Ϊ�����Ǻ������
		 * ������������
		 * ��������
		 * ����ٸ�
		 * */
		
		if (!preOrder_right.equals("") && !midOrder_right.equals("")) {		//���ǰ����������������е���������Ϊ��
			getPost(preOrder_right, midOrder_right);						//�ݹ�����������е�������
		}

		if (!preOrder_left.equals("") && !midOrder_left.equals("")) {	//ͬ��
			getPost(preOrder_left, midOrder_left);
		}
	}
}

public class e1088 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {		//�����������Ͳ�������
			String pre = cin.next();
			String mid = cin.next();
			Tree2 tree2 = new Tree2();
			tree2.getPost(pre, mid);
			System.out.println(tree2.getPostOrder());
		}
	}

}
