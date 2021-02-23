package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {

	public static void main(String[] args) {
		//������ Ȱ���ϱ�
		//�θ�Ÿ������ �����Ǿ��ִ� ������ 
		//�ڽ�Ÿ���� ��ü�� ���Ե� �� �ִ� ��!
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		Animal ani2;
		
		ani=new Cat();//������!
		System.out.println(ani);
		ani=new Duck();//������!
		System.out.println(ani);
		ani=new Lion();//����?? ��Ӱ��谡 ���� ������! �������� ������ �ȵ�.
		System.out.println(ani);
		//��Ӱ��谡 ���� ������ ��!
		
		//�θ�� �ڽ�Ÿ���� ������ �� �� �ִ�?????
		//tom=new Animal();//�θ�Ÿ���� �ڽ�Ÿ�Կ��� ���Եɼ�����!
		
		//�������� ���� �ڽİ�ü�� �θ�Ÿ������ ���ԵǸ�,
		//�θ�ü�� ���븸 �� �� �ְ� ������(��ĳ����)
		Person p=new Employee("����ȣ",48,"��õ","������","������",100);
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDeparment());//�θ� ������ �ִ� �����͸� �� �� ����
		//�ڽ��� ������ �� �� ���Ե�.
		//Employee e=(Employee)p;
				
		//�θ�Ÿ������ ���Ե� �ڽİ�ü�� �����Ϳ� ������ �Ϸ���
		//��������ȯ�� �ؾ���.
		System.out.println(((Employee)p).getDeparment());
		p=new Singer("�輼��",32,"������","�ʸ����δܸ��̾�~",2,"���");
		
		//Singer s=(Singer)p;
		
		//functional��ü���� �����ϴ� ��¸޼ҵ� �̿� ��ü����ϱ�
		Employee e=new Employee("����ȣ",48,"��õ","������","������",100);
		Singer s=new Singer("�輼��",32,"������","�ʸ����δܸ��̾�~",2,"���");		
		
		new Functional().print(e);//�Ű����� employee
		new Functional().print(s);//�Ű����� Singer
		new Functional().print(new Person());
		
		//p���� Singer�� ����
		//��� p�� Person�ε� ���� �� �ִ� ��ü�� Ȯ��
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//�θ�ü�� �̿��� ���� �ڽİ�ü�����ϱ�
		//��ü�迭�� �����ϱ�
		Person[] persons=new Person[5];
		//����Person������ �ڽİ�ü�� ��� �� �� ����
		persons[0]=new Singer("�輼��",27,"��⵵ ������","�ʸ����δܸ��̾�",4,"����");
		persons[1]=new Employee("������",22,"����","������","������",100);
		persons[2]=new Person("����ȣ",32,"��������");
		persons[3]=new Singer("����",28,"����","��",10,"����");
		persons[4]=new Employee("�̼���",27,"����","������","������",20);
		
		//���α׷��� �����ϵǾ��ִ� ������ ����?
		//���α׷��� �����ϵǾ��ִ� ������ �������?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("������ "+singerCount+"�� ����");
		System.out.println("����� "+empCount+"�� ����");
		
		//Object -> ���Ŭ���� �θ�, �ֻ��� ��ü
		Object obj=new Person();
		System.out.println(obj);//Person��ü
		obj=new Employee();
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//��� Ŭ������ Object�� ������ �ִ� �żҵ带 ����� �� �ִ�.
		System.out.println(obj);//Employee��ü
		
		System.out.println(persons[0]);
		
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Employee) {
				Employee ee=(Employee)persons[i];
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()
				+ee.getDeparment()+ee.getJob()+ee.getSalary());
			}else if(persons[i] instanceof Singer) {
				Singer ss=(Singer)persons[i];
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			}else if(persons[i] instanceof Person) {
				Person pp =persons[i];
				System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
			}
		}
		System.out.println("===�������ε��� �̿��� ���====");
		//�������ε��� �̿��ϸ� �˾Ƽ� ������ �� �ִ� ��ü�� �������̵��Ǿ��ִ� �޼ҵ带 ȣ���ϰԵǾ�
		//����ȯ ���� ������ �� �ִ� ��ü�� �żҵ带 �̿��� ���ִ�.
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object.toString�żҵ带 ȣ����
		}
		System.out.println("====�������ε� �缳�� ====");
		Person person=new Person("�̼���",44,"�źϼ�");
		System.out.println(person.getName());
		person=new Employee("������",19,"��⵵�����","�ڹ��к�","����",100);
		System.out.println(person.getName());
		
		
		//toString() -> ���������� System.out.println() �Ű������� ������
		//������������ ������ ����ؾ��ϴµ� �ּҰ� �� ������ �ִ� �״�� �ּҸ� ����ϴ°� �ƴϰ�
		//���� ���� ����ϱ� ���� �ڵ����� toString()�żҵ带 ȣ���Ͽ� ���
		//��簴ü�� �ݿ��Ǳ� ���� Object��ü�� ����
		Date d=new Date();
		String str=new String("�ȳ�");
		System.out.println(str);
		System.out.println(d);
		Animal ani1=new Animal();
		System.out.println(ani1.toString());
		System.out.println(ani1);
		Object obj2=ani1;
		System.out.println(obj2.toString());
		
		
		//��ü�� �����
		Person jo=new Person("����",28,"����");
		Person jo2=new Person("����",28,"��õ");
		System.out.println(jo==jo2);
		//��ü�� ���Ҷ�? how?? equals String....
		System.out.println(jo.equals(jo2));
		//��ü�� ����� ���Ҷ��� object�� �ִ� equals()�żҵ带 
		//Override�Ͽ� ����Ѵ�.
		System.out.println(jo.equals("��������"));
		
		//��ü ���� clone() Override�ϱ�
		Employee emp=new Employee("�����",30,"����","������","����",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
		Person po=new Employee();
		//po.to
		System.out.println(po.toString());//???
		//1. Person  2. Employee
		
		
		
		
		
		
	}

}
