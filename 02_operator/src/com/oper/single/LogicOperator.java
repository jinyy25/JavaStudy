package com.oper.single;

import java.util.Scanner;

public class LogicOperator {
	public static void main(String[] args) {
		//�������� Ȱ���ϱ�
		//�������� �ΰ��� ���� ���ϴ� ������
		//�ַ� �񱳿����ڸ� �����Ͽ� �����
		//������� ��(true,false);
		//1<10<20��?? ������ �����ٶ� -> ������
		//������ ��Ÿ���� -> &&�������� ��.
		int su=10;
		System.out.println(1<su&&su<20);
		System.out.println(1>su||su>20);
		
		//��� ���̱ⱸž��üũ ���α׷�
		//1.Ƽ���� �־���ϰ� Ű�� 140cm�̻�
		boolean ticket=false;
		double height=150;
		System.out.println(ticket&&height>=140);
		
		Scanner sc=new Scanner(System.in);
		//id�� admin�̰� password 1234�� ���
		System.out.print("���̵� : ");
		String id=sc.nextLine();
		System.out.print("�н����� : ");
		String password=sc.nextLine();
		//�Է¹޾Ƽ� ���ϱ� 
		System.out.println(id+" "+password);
		System.out.println(id.equals("admin")
				&&password.equals("1234"));
		//������ ���԰���
		//Ƽ���̳� �ʴ����� ������ ����, �ƴϸ� ����Ұ�
		//Ƽ�� 1234, �ʴ��� 4444
		//ó���غ���
		int ticket1=0000;
		int invate=4444;
		System.out.println(ticket1==1234||invate==4444);
		//�������� �������� ����� �����Ѱ�?? && || ������ ��밡��?
		// ������.
		//Ƽ���̳� �ʴ����� �ְ� ������ ���
		int age=19;
		System.out.println((ticket1==1234||invate==4444)&&age>19);
		
	}
}





