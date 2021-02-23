package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

//��������� Ŭ���� : �޼ҵ� �ټ� ����
public class Functional {

	//�Ű������ִ� �����ڰ� ������ �⺻�����ڰ� �ڵ������� �ȵ�
	//public Functional() {}//�⺻������
	
	//���� 
	//1. �Ű����� x, ��ȯ�� x �޼ҵ� : system.out�� ���
		public void calculator() {
		Scanner sc=new Scanner(System.in);
			System.out.println("==== ���� ���α׷� ====");
			System.out.print("���� : ");
			int su=sc.nextInt();
			System.out.print("���� : ");
			int su2=sc.nextInt();
			System.out.println(su+"+"+su2+"="+(su+su2));		
		//System.out.print("������(+,-,*,/)");
		//char op=sc.next().charAt(0);
		//int result=0;
		//switch(op) {
			//case '+': 
		//}	
		}
	
	//2. ��ȯ�� x, �Ű����� o �޼ҵ� : ����ϴ� ��� ���� ���׿��� �ΰ� ���� ���� 
	//������ ����Ƿ���, ���굵 �Ű������� �޾ƾ���.
	public void calculator2(int su, int su2, String[] operation) {
		System.out.println("==== ���� ���α׷� ====");
		System.out.println("���� : "+su);
		System.out.println("���� : "+su2);
		double result=0;
		//for(String op : operation) {//for each�� 
		//	switch(op) {
		for(int i=0;i<operation.length;i++) {
			switch(operation[i]) {
				case "+" : result=su+su2;break;
				case "-" : result=su-su2;break;
				case "*" : result=su*su2;break;
				case "/" : result=(double)su/su2;break;
			}
			//System.out.println(su+op+su2+"="+(result));
			System.out.println(su+operation[i]+su2+"="+(result));
		}
	}
	
	//3. ��ȯ�� o, �Ű����� x �޼ҵ� : ������ �� �Ѱ��� �ڷ����� ����
	//�ΰ��� ���� ���ϰ� �� ����� ��ȯ�ϴ� ���
	public int calculator3() {
		System.out.println("==== ���� ���α׷� ====");
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		int su=sc.nextInt();
		System.out.print("���� : ");
		int su2=sc.nextInt();
		return su+su2;
	}
	
	//4. ��ȯ�� o,  �Ű����� o �żҵ�
	public int calculator4(int su, int su2) {
		return su+su2;
	}

	//�Է¹��� �μ��� ���̸� ���� ���� ����� ����Ұ�
	public int printer(int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("�������!");
		}else {
			for(int i=second;i<=first;i++) {
				result+=i;
			}
		}
		return result;
	}
	
	//���� �Ѱ��� ���޹޾� ���������� Ȯ���ϰ� ����� ����
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||('A'<=check&&check<='Z');
	}
	
	//�迭�� �Ű������� �޴� �żҵ� ���� : �迭�� �Է¹޴� ������ �ʱ�ȭ
	public void updateArray(int[] nums) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== �迭 �����ϱ� ====");
		for(int i=0;i<nums.length;i++) {
			System.out.print("������ : ");
			nums[i]=sc.nextInt();
		}
	}
	
	//�⺻�ڷ����� �Ű������� �ް� ����
	//public void basicUpdate(int su) {
	public int basicUpdate() {
		//su=200;
		return 200;
	}
	
	//student������Ʈ ���
	public void studentUpdate(Student s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== �л��������� ====");
		System.out.print("�̸� : ");
		String name=sc.next();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int classRoom=sc.nextInt();
		System.out.print("��ȣ : ");
		int classNo=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		System.out.print("������ : ");
		double weight=sc.nextDouble();
		
		//���޵� �Ű����� ���� ����
		s.setName(name);
		s.setClassRoom(classRoom);
		s.setGrade(grade);
		s.setClassNo(classNo);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//�ι�° �л����� �����ϴ� ����
	public Student studentUpdate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== �л��������� ====");
		System.out.print("�̸� : ");
		String name=sc.next();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int classRoom=sc.nextInt();
		System.out.print("��ȣ : ");
		int classNo=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		System.out.print("������ : ");
		double weight=sc.nextDouble();
		
		Student s=new Student(name,grade,classRoom,classNo,height,weight); 
		return s;
	}
	
	public String client() {
		Scanner sc=new Scanner (System.in);
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("���� : ");
		String age=sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String num=sc.nextLine();
		
		String result = name+age+num;
		return result;
	}
	
	public void insertMember(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("id : ");
		String id=sc.nextLine();
		System.out.print("pw : ");
		String pw=sc.nextLine();
		System.out.print("name : ");
		String name=sc.nextLine();
		System.out.print("email : ");
		String email=sc.nextLine();
		System.out.print("address : ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
	}
}


