package com.condition.function;

import java.util.Scanner;

public class ConditionTest {

	public void basicIfTest() {
		//�⺻ if�� ����ϱ�
		//if(���ǽ�(��� :true/false)){ if���� �ش��ϴ� ���� }
		//���ǽ��� true�� �Ǹ� {}�κ��� ����, �ƴϸ� if�� ������.
		
		//�Է¹��� ����  ����� "����Դϴ�." �� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		//���ǿ� ���� ����Դϴ� ����� �������� �����Ҷ� if���� ���
		if(su>0) {
			System.out.println("����Դϴ�.!");
		}else {
			System.out.println("�����Դϴ�.!");
		}
		//Ƽ�Ϲ�ȣ�� �Է¹ް� Ƽ�Ϲ�ȣ�� 777�̸� �����Ǿ����ϴ�, 
		//�����ϼ��� �������
		System.out.print("Ƽ�Ϲ�ȣ : ");
		int ticket=sc.nextInt();
		int count=0;
		if(ticket==777 /*&& age > 19 && height>180 &&*/) {
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("�����ϼ���!");
			//��� ������. ��������/��� �� �� ������.
			count++;
			int su1=100;
			int su2=200;
			int result=su1+su2;
			System.out.println(result);
		}
		//if(ticket!=777) {
		else {
			System.out.println("�������еǾ����ϴ�.");
			System.out.println("�� �� �����ϴ�!");
		}
		//System.out.println(su1+" "+su2+" "+result);
		
		System.out.println("����� : "+count);
		
		//if~else������ else�� ����� �� ������?
		boolean falg=true;
		if(falg) {
			
		}
		else {
			
		}
		
		//Ȧ���� Ȧ��, ¦���� ¦�� ����ϴ� ���α׷��ۼ�
		System.out.print("�����Է� : ");
		int su4=sc.nextInt();
		if(su4%2==1) {
			System.out.println("Ȧ����!");
		}else {
			System.out.println("¦����!");
		}
		
		
	}//�޼ҵ�(���)
	
	//����, ����, ���� ������ �Է¹޾� �հ�, 
	//����� ����ϰ� �հ谡 250�� �̻��̸� 
	//"������Դϴ�" �� ���
	
	//A,B,C������ �Է¹ް� ������ 5000�̻��̸� 
	//"00�� ��׿����� �Դϴ�." ���
	
	//����,����, ���� ������ ���������� �Է¹޾� 
	//������ ����� ������ �հݿ��θ� ó��, ������������
	//���� 40�� �̻��̸鼭, ����� 60�� �̻��̸� �հ�
	//�ƴϸ� ���հ��� ����ϱ�
	public void testA() {

	}
	public void testB() {
		
	}
	public void testC() {
		Scanner input=new Scanner(System.in);
		System.out.print("���� : ");
		int kor=input.nextInt();
		System.out.print("���� : ");
		int eng=input.nextInt();
		System.out.print("���� : ");
		int math=input.nextInt();
		double avg=(kor+eng+math)/3.0;
		//�� ������ ������ 40�� �̻��̰� ����� 60���̻�
		//kor>=40/eng>=40/math>=40/avg>=60
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void ifElseifTest() {
		//if ~ else if ~ else
		//���� ��� ���� ���α׷�
		//100�� ~ 90�� �̻� A
		//89 ~ 80�� �̻� B
		//�Է¹��� ������ �������� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//������ ���� ��޻���
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {//jumsu<90 &&
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");
		
		//���࿡ else���� if�����θ� �ۼ��Ѵٸ�???
		if(jumsu>=90) {
			grade='A';
		}
		if(jumsu<90&&jumsu>=80) {//jumsu<90 &&
			grade='B';
		}
		if(jumsu<80&&jumsu>=70) {
			grade='C';
		}
		if(jumsu<70&&jumsu>=60) {
			grade='D';
		}
		if(jumsu<60) {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");
	}
	
	//���� �����
	//���� �ΰ� �Է¹ް� ������(*,+,-,/)�� �Է¹޾�
	//����� ����ϱ�
//    ��� ��) �Է� 5 
//		     �Է� 6 
//		     ������ : +
//		   5+6=11

	public void calc() {
		//���� �����
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		System.out.print("�����Է� : ");
		int su2=sc.nextInt();
		System.out.print("�������Է�(+,-,*,/) : ");
		char op=sc.next().charAt(0);
		double result=0;
		if(op=='+') {
			result=su+su2;
		}else if(op=='-') {
			result=su-su2;
		}else if(op=='*') {
			result=su*su2;
		}else if(op=='/') {
			result=(double)su/su2;
		}
		System.out.println((op=='/'?""+su+op+su2+"="+result
							:""+su+op+su2+"="+(int)result));
	}
	
	//���θ� ������ �� �ִ� Ŭ�� 
	//�����̸� �޴��� ����Ͽ� �����ϰ� �ƴϸ� ����������! ������
	//1. ����, 2. ����, 3. ���ɸ�
	//1 ���� ���ִ� ���
	//2 ���ִ� ��
	//3 ���ɸ��� �Ӹ�����
	
	public void ifinif() {
		Scanner sc= new Scanner(System.in);
		System.out.print("����� ���̴�? " );
		int age=sc.nextInt();
		//if(msg.equals("����"))
		if(age>19) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����?");
			System.out.println("2. ����?");
			System.out.println("3. ���ɸ�?");
			System.out.print("��ȣ�Է� : ");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("���ִ� ���!");
			}else if(choice==2) {
				System.out.println("���ִ� ��!");
			}else if(choice==3) {
				System.out.println("���ɸ��� �Ӹ�����!");
			}
		}else {
			System.out.println("����������!");
		}
	}
	
}





