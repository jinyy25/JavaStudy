package com.oper.single;

import java.util.Scanner;

public class SingleOperator {

	public static void main(String[] args) {
		//���׿����� Ȱ���ϱ�
		//���������� Ȱ���ϱ�
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!!flag);
		//���������� �������� �幰�� ����ϰ�, �񱳿���, ������� �Բ� 
		//���� ���
		int age=19;
		//if(!(age>19&&id.equals("admin")))
		
		//����, ���ҿ���
		//++, --
		int su=19;
		su++;//su=su+1
		su++;
		su++;
		System.out.println(su);
		su--;
		su--;
		System.out.println(su);
		//����, ���ҿ���� 
		//����, ���������̶� ����!
		//���� ���� : �����տ� �����ڸ� �ۼ� ++su
		//�������� : �����ڿ� �����ڸ� �ۼ� su++
		//�ٸ� �����ڿ� �����̵ɶ� ���̰� �߻���.
		//�������� -> ���� ��/�������� ó���ϰ� �ٸ� ���� ����
		//�������� -> �ٸ� ������ ���� ó���ϰ� ��/������
		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1;
		su1=29;
		su3=su1++;
		System.out.println("su2 : "+su2);
		System.out.println("su3 : "+su3);
		System.out.println("su1 : "+su1);
		
		//����, ������ �ܵ����� ����� �ϰԵǸ� ������׾���!
		
		//����/���ҿ�����??
		//1. �ݺ����� ���� ���� ���!
		//for(int i=0;i<10;i++)/for(int i=100;i>10;i--)
		//2. Ư���Ѱ��� ������ ����
		//count++;
		int su4=30;
		int su5=0;
		//su5=su4+++20;//50
		su5=++su4+20;//51
		System.out.println(su5);
		
		//��������� Ȱ���ϱ�
		//�⺻���� ���ϱ�, ����, ������, ���ϱ�, �����������ϱ�
		//���ڿ����� �ϴ°�,  ���ϱ�� ���ڿ��굵 ����
		//���� �ΰ� ���� �� 7, 10�� �ֱ�
		int su6=7;
		int su7=10;
		//���ϱ�
		System.out.println(su6+su7);//������ ����/����ؾ��� �������� ����
		System.out.println(su6+20);
		System.out.println(5+10);
		//������ ����� ������ ����
		int result=su6+su7;
		//byte result2=su6+su7;
		System.out.println(result);
		//����
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		//���ϱ�
		System.out.println(su6*su7);
		result=su6*su7;
		System.out.println(result);
		//������ *�ڷ����� ���Ǹ� �ؾ���. 
		System.out.println((double)su6/su7);//���������� ��������???
		//result=(double)su6/su7;
		double result2=(double)su6/su7;
		System.out.println(result2);
		
		//���������ϱ�
		System.out.println(su6%su7);
		System.out.println(5%3);
		
		//¦���� ���ϼ���~ Ȧ��, ���
		//�Է¹��� ���� ¦������ Ȯ��
		//�Է¹ޱ�! Ű�����
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su8=sc.nextInt();
		
		String msg=sc.nextLine();
		
		System.out.println(su8%2);

//		if(su8%2==0) {
//			System.out.println("¦��!");
//		}	
		
				
		
	}
	
}
