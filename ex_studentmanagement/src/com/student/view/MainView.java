package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentManager;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
	//client���� �������� ȭ���� ����ϴ� ��ü
	private StudentManager sm;
	//1.main ȭ�� 
	public void mainMenu(StudentManager sm) {
		this.sm=sm;
		System.out.println("==== �л����� ���α׷� v01 ====");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. �л����");
			System.out.println("2. ��ü�л� ��ȸ");
			System.out.println("3. �̸����� ��ȸ");
			System.out.println("4. ��������ϱ�");
			System.out.println("5. �г����� ��ȸ�ϱ�");
			System.out.println("6. ������ȸ�ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1 : this.sm.enrollStudent() ;break;
				case 2 : this.sm.searchAll();break;
				case 3 : this.sm.searchName();break;
				case 4 : this.sm.inputGrade();break;
				case 0 : System.out.println("���α׷��� �����մϴ�.");return;
			}
		}
	}
	
	//�л����� �Է¹޴� ȭ����(�޼ҵ�) -> �Է¹��� ���� ��ȯ!
	public Student enrollStudent() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("===== �л���� ȭ�� ====");
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int ban=sc.nextInt();
		System.out.print("��ȣ : ");
		int number=sc.nextInt();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone=sc.nextLine();
		
		Student s=new Student(name,grade,ban,number,address,phone);
		
		return s;
	
	}
	
	//�˶��� ������ִ� ��� �߰�
	public void printMsg(String msg) {
		System.out.println("====== �ý��� �޼��� =====");
		System.out.println("�˸� : "+msg);
		System.out.println();
	}
	
	//�̸��Է¹޴� ���
	public String inputName() {
		System.out.println("==== �̸� ��ȸ ====");
		Scanner scanner=new Scanner(System.in);
		System.out.print("�̸� : ");
		String name=scanner.nextLine();
		return name;
	}

	//student��±�� �����.
	public void printStudents(Student[] students) {
		for(Student s : students) {
			//System.out.println(s);
			if(s!=null) {
				System.out.println(s.information());
				if(s.getGradePoint()!=null) {
					System.out.println("���� : "+s.getGradePoint().printGrade());
				}
			}
		}
	}
	
	//�����Է��ϴ� ���
	public Grade inputGrade() {
		//������ �Է¹޴� ���� ����
		Scanner sc=new Scanner(System.in);
		System.out.println("===== �����Է�ȭ�� =====");
		Grade g=new Grade();
		System.out.print("���� : ");
		//int kor=sc.nextInt();
		g.setKor(sc.nextInt());
		System.out.print("���� : ");
		//int eng=sc.nextInt();
		g.setEng(sc.nextInt());
		System.out.print("���� : ");
		//int math=sc.nextInt();
		g.setMath(sc.nextInt());
		System.out.print("�ڵ� : ");
		//int coding=sc.nextInt();
		g.setCoding(sc.nextInt());
		//Grade grade=new Grade(kor,eng,math,coding);
		//grade=new Grade(eng,kor,coding,math);
		//return grade;
		//return new Grade(kor,eng,math,coding);
		return g;
		
	}
	
	
	
}












