package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.MyGeneric;
import com.generic.model.vo.Student;

public class GenericTest {

	//���׸� : Ŭ���� ����ÿ� �ڷ����� ������ �ʰ� �����ÿ� �ڷ����� Ȯ������ ���
	//�Ѱ��� ��ü�� �����ϵ��� ���������� �ٸ� Ÿ���� ������� ���ϰ� �Ϸ���  
	//�������, �޼ҵ� ��ȯ��, �żҵ�Ű����� �ڷ��� ���� 
	//Collection����  ����
	
	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList();    //�л���ü�� ����		
		students.add(new Student("������",3,1));
		students.add(new Student("������",2,22));
		students.add(new Student("������",2,33));
		//students.add(new Date());						//��¥�� ����Ǵٴ�!	
														//���ƹ�����
		
		students.get(0).getName();	//���� ����ȯ �߾�� ������
									//generic ���� Bye
	
		ArrayList<String> names=new ArrayList();
		names.add("������");
		names.add("�����");
		
		
		Set<Integer> number=new HashSet<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		//number.add
		Set<Student> s=new HashSet<Student>(students);
		
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
		//�л��̸��� ���
			System.out.println(it.next().getName());
		}
		
		
		HashMap<String,Student> studentsMap=new  HashMap();
		studentsMap.put("1", new Student("�����",3,1));
		studentsMap.put("2", new Student("������",3,2));
		studentsMap.put("3", new Student("�̼���",2,1));
		studentsMap.put("4", new Student("������",3,1));	
		
		
		//��ȸ�ϱ�! �г��� 3�г��� ����� �̸��� ���
		//1
		Set<String> key=studentsMap.keySet();
		Iterator<String> it1=key.iterator(); 
		
		while(it1.hasNext()) {
			Student s1=studentsMap.get(it1.next());				//if�����
			if(s1.getGrade()==3) {
				System.out.println(s1.getName());
			}	
		}
		
		//2
		Set<Map.Entry<String, Student>> entry=studentsMap.entrySet();
		Iterator<Map.Entry<String, Student>> it2=entry.iterator();
				
			while(it2.hasNext()) {
					Map.Entry<String, Student> e=it2.next();	//e�������� :���� Ʈ���� ���
					System.out.println(e.getKey());
					System.out.println(e.getValue());
				}
		
		//3		
		for(Map.Entry<String, Student> e : studentsMap.entrySet()) {
			if(e.getValue().getGrade()==3) {					// forEach�����
				System.out.println(e.getValue().getName());
				}
			}
		
		MyGeneric<String,Integer> g=new MyGeneric();
		
		g.setTestValue("�ȳ�");
		System.out.println(g.getTestValue());
		
		MyGeneric<ArrayList<Integer>,HashMap> arr=new MyGeneric();
		arr.setTestValue(new ArrayList());
		
		//arr.getTestValue().add(new Student());
		
		
		
		
	}
}