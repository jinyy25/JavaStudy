package com.oper.single;

import java.util.Scanner;

public class CompareOperator {

	//public static void main(String[] args) {
	public void compareTest() {
		//�񱳿���Ȱ���ϱ�
		//�񱳴� ���� ���� ���(����), ����񱳰� ������
		//�񱳿����� ����� true/false�� ����
		//�񱳿��� ���ǹ��� ���� ����� ��.
		//1. ����� == ����? ��!����!(true)/�ƴ� �޶�!(false)
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1);
		System.out.println(su==su3);
		double dsu=180.5;
		double dsu1=190.2;
		double dsu3=180.5;
		System.out.println(dsu==dsu1);
		System.out.println(dsu==dsu3);
		char ch='A';
		char ch1='B';
		char ch3='A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch3);
		//String ���ڿ�
		System.out.println("==== ���ڿ� ����� ====");
		String str="����";
		String str1="�輼��";
		String str3="����";
		System.out.println(str==str1);
		System.out.println(str==str3);
		//���ڿ��� == ���� ���ϸ� �ȵ�!
		String str2=new String("�輼��");
		System.out.println(str1==str2);
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��Է� : ");
		String name=sc.nextLine();
		System.out.println("str1 : "+str1+" name : "+name);
		System.out.println(str1==name);
		//���ڿ��� ��ü�� ����񱳸� �Ϸ��� equals()����� �̿��ؾ���
		//���ڿ�������.equals(�񱳹��ڿ�);
		System.out.println("==���� �� "+(str1==str2));
		System.out.println("equals�� ��"+str1.equals(str2));
		System.out.println("�Է¹������� : "+str1.equals(name));
		//�Է¹��� ���� ������ �̴�?
		System.out.println("������".equals(name));
		System.out.println(name.equals("������"));
		
		//!= ��ġ���� ������ ��
		System.out.println(su==su1);
		System.out.println(su!=su1);
		//���ڿ��� �ٸ��İ� �����????
		//���������̿�
		System.out.println(str.equals(str1));
		System.out.println(!str.equals(str1));
		System.out.println("===== ��Һ� ====");
		//��Һ�
		//>, <, <=, >=
		su=20;
		su1=30;
		su3=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char���� ��Һ񱳰� �����Ѱ�????
		//char ��Һ񱳰� ������
		//char ������ = ���� / 65-> A
		ch='A';
		ch1='B';
		System.out.println(ch<ch1);
		System.out.println(ch++);
		System.out.println(ch);
		
		System.out.println(ch>'a');
		
		//�񱳿����� ����� boolean��
		boolean flag=ch<'Z';
		
		//10�� 1���� ũ�� 20���� �۴�?
		//1<10<20-> X
		//��Һ� �ΰ��� ���� ������ ������
		
	}
	
	
}
