package com.student.controller;

import com.student.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentManager {
	
	private StudentDB db=new StudentDB();
	
	//���񽺺� �л����, ����ȭ�����, ����������
	public void mainView() {
		//����ȭ������ �������ִ� ���
		new MainView().mainMenu(this);
	}
	
	
	//�л� ��� ����
	public void enrollStudent() {
		//Student��ü�� ���� �����س���
		//Student�� �� �� ������ �Է� -> client�� �Է�! -> ȭ���� ���������.
		
		Student s=new MainView().enrollStudent();
		System.out.println(s.information());
		
		//�Է¹��� �����͸� ����ҿ� ����
		boolean result=db.saveStudent(s);//DB�� �����ϱ�
		System.out.println(result);
		
		new MainView().printMsg(result?"�Է¼���":"�Է½���");
		
	}
	
	
	//�̸����� ��ȸ ���� ����
	public void searchName() {
		//�̸����� ��ȸ
		String name=new MainView().inputName();
		Student s=db.searchName(name);
		if(s==null) {
			new MainView().printMsg("��ȸ����� �����ϴ�!");
		}else {
			System.out.println("��ȸ��� : "+s.information());
		}
		
	}
	//��ü�л���ȸ����
	public void searchAll() {
		Student[] students=db.searchAll();
		new MainView().printStudents(students);
	}
	
	
	//������� ����
	public void inputGrade() {
		//������ ����ϴ� ���
		//�Ѹ��л��� �����Ͽ� ������ �Է��ϴ� ����
		searchAll();//��üȸ����ȸ!
		String name=new MainView().inputName();
		Student s=db.searchName(name);
		if(s!=null) {
			//��������� �л��� ����!
			//�������ȭ������ �̵�
			Grade g=new MainView().inputGrade();
			s.setGradePoint(g);
			
		}else {
			//��������� �л��� ����!
			//���ٴ� �˸��޼��� ���
			new MainView().printMsg("��ϵ� �л��� �ƴմϴ�!");
		}
	}
	
}












