package com.oper.single;

import java.util.Scanner;

public class ComplexOperator {

	public static void main(String[] args) {
		//���մ��Կ�����
		//���ϴ� ���� ������ ������ ������� �� �����ϴ� ������
		int account=100000000;
		//1. �Ա�
		account+=10;//account=account+10;
		System.out.println(account);
		//2. ���� 5000000
		account-=5000000;
		System.out.println(account);
		
		//�Է¹��� ���� �հ踦 ���ϴ� ���α׷� ����ÿ�
		//3���Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int sum=sc.nextInt();
		System.out.print("�����Է� : ");
		sum+=sc.nextInt();
		System.out.print("�����Է� : ");
		sum+=sc.nextInt();
		System.out.println("�հ� : "+sum);
		sc.nextLine();
		//����ڿ��� ���ڸ� 3�� �Է��ϰ� �ϰ� �Է¹��� ���ڸ� 
		//��� ����ϴ� ���α׷�
		String msg="";
		System.out.print("�޼��� �Է� : ");
		msg+=sc.nextLine();//msg=msg+�Է°�;
		System.out.print("�޼��� �Է� : ");
		msg+=sc.nextLine();
		System.out.print("�޼��� �Է� : ");
		msg+=sc.nextLine();
		System.out.println("�Է��� �޼��� : "+msg);
		
		//����, ����, ����, �ڵ� ������
		//�Է¹޾� �հ�� ����� ���ϴ� ���α׷�
		// * ����,����,����,�ڵ� ������ ���� ������ �ʿ䰡 ����
		int sum1=0;
		int count=0;
		System.out.print("���� : ");
		//int kor=sc.nextInt();
		sum1+=sc.nextInt();
		count++;
		System.out.print("���� : ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("���� : ");
		sum1+=sc.nextInt();
		count++;
		System.out.print("�ڵ� : ");
		sum1+=sc.nextInt();
		count++;
		System.out.println("�հ� : "+sum1+" ��� : "+((double)sum1/count));
		System.out.printf("�հ� : %d ��� : %.2f",sum1,(sum1/4.0));
	}
	
}




