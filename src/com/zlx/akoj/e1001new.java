package com.zlx.akoj;
import java.util.Scanner;
import java.util.Stack;
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�
public class e1001new {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a, b;
		while (( a = cin.nextInt()) != 0 && (b = cin.nextInt()) != 0) {
			int sum = 0;
			for (int i = a; i <= b; i++)
				sum += i;
			System.out.println(sum+"   ");

		}
	}
}

/*
 * ����������ѣ�����
 * */
//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���
//����������ˣ�
//���������������
//����������֣�
//����������Ʋʡ�
//----
//�Ǻ��ϵĽ�����
//��Ϧ���е����
//���������Ӱ��
//���ҵ���ͷ������
//----
//�����ϵ������ţ�
//���͵���ˮ����ҡ�ƣ�
//�ڿ��ӵ��Შ�
//������һ��ˮ�ݣ�
//----
//�������µ�һ̶��
//������Ȫ�������Ϻ磻
//�����ڸ���䣬
//�����Ųʺ��Ƶ��Ρ�
//----
//Ѱ�Σ���һ֧���ݢǣ�
//����ݸ��ദ���ݢȣ�
//����һ���ǻԣ�
//���ǻ԰����Ÿ衣
//----
//���Ҳ��ܷŸ裬
//�����Ǳ�������
//�ĳ�ҲΪ�ҳ�Ĭ��
//��Ĭ�ǽ����Ŀ��ţ�
//----
//���ĵ������ˣ�
//���������ĵ�����
//�һ�һ�����䣬
//������һƬ�Ʋʡ�//�ٱ���