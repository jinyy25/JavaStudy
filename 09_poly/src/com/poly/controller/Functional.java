package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {

		//Employee������ ����ϴ� ���	
		//public void print(Employee e) {
			//System.out.println(e.getName()+e.getAge()+e.getAddress());
		//}

		//Singer������ ����ϴ� ���
		//public void print(Singer s) {
			//System.out.println(s.getName()+s.getAge()+s.getAddress());
		//}		
	
	//�������� �̿��ϸ� �����ε��� ���� �� ����									
	//1. �����ε� : Ŭ���� ���� ���� �̸��� �޼ҵ�
	public void print(Person p) {						 			//Person ��ü�� p�� �޾ƿ�

	//2. ����� : instanceof type ��									//String���� equals()�żҵ�� ����� ����						
			if(p instanceof Employee) {								//Employee��ü�� Person��ü ��

			//employee ��� �������
			System.out.println(p.getName()+p.getAge()				//p�� getter �ҷ���
					+p.getAddress()+((Employee)p).getDeparment()	//�ڷ����� Empoyee�� Person��ü�̸�
					+((Employee)p).getJob()							//��Ӱ����̹Ƿ� ������ ���� �ڷ����� ��Ÿ��
					+((Employee)p).getSalary());					
			
			//singer ����������			
			}else if(p instanceof Singer) {							//Person��ü�� Singer��ü�� �����ϴ°�?
			System.out.println(p.getName()+p.getAge()
						+p.getAddress()+((Singer)p).getTitle()
						+((Singer)p).getYear()+((Singer)p).getGenre());
			}else if(p instanceof Person) {							//Person��ü�� p�� ���ٸ� ������ ���� ���
			System.out.println("person�̾�!");
		}	
	}
}





