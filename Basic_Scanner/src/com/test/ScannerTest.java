package com.test;

import java.util.Scanner; 

public class ScannerTest {

	public static void main(String[] args) {
		//client �̸�, ����, �ּ�, ��ȭ��ȣ, Ű
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �̸� : ");
		//String name=sc.next();
		String name=sc.nextLine();
		System.out.print("�� ���� : ");
		int age=sc.nextInt();
		
		//nextLine()���� �ޱ����� 
		//nextInt(), next(), nextDouble()�� ������ ���� �޾ƿ�����
		//�Է� ���۸� nextLine()����ְ� ����� �ؾ��Ѵ�.!
		
		sc.nextLine();//���۸� �����..
		System.out.print("�� �ּ� : ");
		String address=sc.nextLine();
		
		
		System.out.print("�� ��ȭ��ȣ : ");
		String phone=sc.nextLine();
		System.out.print("�� Ű : ");
		double height=sc.nextDouble();
		
		System.out.println(name+" "+age+" "+address+" "+phone+" "+height);
		
	}
	
	
}
