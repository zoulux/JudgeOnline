package com.zlx.akoj;

import java.util.Scanner;

class Tree2 {
	StringBuffer postOrder = new StringBuffer(); //创建一个最终的存储结果

	public StringBuffer getPostOrder() {
		return this.postOrder.reverse();	//由于递归了，所以必须将字符串逆序
	}

	public void getPost(String preOrder, String midOrder) {
		if (preOrder.length() == 1 && midOrder.length() == 1) {
			postOrder.append(preOrder);    //当只有一个字符时直接追加到字符串末尾
			return;
		}

		char root = preOrder.charAt(0);  //根节点

		String preOrder_left = new String(); //前序的左子树
		String preOrder_right = new String();//前序的右子树
		String midOrder_left = new String();//中序的左子树
		String midOrder_right = new String();//中序的右子树

		postOrder.append(root);		//追加根节点

		int midOrder_root_index = midOrder.indexOf(root);	//中序中查找根节点的位置
		midOrder_left = midOrder.substring(0, midOrder_root_index);	//中序的左子树
		midOrder_right = midOrder.substring(midOrder_root_index + 1);//中序的右子树

		preOrder = preOrder.substring(1);	//前序去掉根节点

		int midOrder_left_length = midOrder_left.length();  //中序的左子树长度

		int index = -1;
		for (int i = 0; i < midOrder_left_length; i++) {
			int tmp = preOrder.indexOf(midOrder_left.charAt(i));
			if (tmp > index)
				index = tmp;								//前序中的左子树的最后一个节点的位置
		}													

		preOrder_left = preOrder.substring(0, index + 1);		//前序的左子树
		preOrder_right = preOrder.substring(index + 1);			//前序的右子树
		/*
		 * 这里强调一下，因为我们是后序遍历
		 * 所以先右子树
		 * 再左子树
		 * 最后再根
		 * */
		
		if (!preOrder_right.equals("") && !midOrder_right.equals("")) {		//如果前序的右子树和中序中的右子树不为空
			getPost(preOrder_right, midOrder_right);						//递归查找子问题中的右子树
		}

		if (!preOrder_left.equals("") && !midOrder_left.equals("")) {	//同理
			getPost(preOrder_left, midOrder_left);
		}
	}
}

public class e1088 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {		//下面主函数就不解释了
			String pre = cin.next();
			String mid = cin.next();
			Tree2 tree2 = new Tree2();
			tree2.getPost(pre, mid);
			System.out.println(tree2.getPostOrder());
		}
	}

}
