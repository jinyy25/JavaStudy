package com.method2.main;

import com.method2.controller.StudentController;
import com.method2.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		
		//StudentController ��ü ����
		StudentController con=new StudentController();		
		
		//Student ��ü�� con�� insertStudent ����� s������ ����
		Student s=con.insertStudent();
		
		//String result ������ Student��ü�� name,grade,�������� ����
		String result = "�̸�: "+s.getName()+"�г�: "
						+s.getGrade()+"����: "+s.getKor()+"����: "+s.getEng()
						+"����: "+s.getSum()+"���: "+s.getAvg();
		
		System.out.println(result);
	}
}
