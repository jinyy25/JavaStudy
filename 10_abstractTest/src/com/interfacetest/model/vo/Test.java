package com.interfacetest.model.vo;

import java.io.Serializable;

//Interface�� ���߻��!
public class Test  implements TestAble, TestAble2, Serializable{
					//interface�� ���߱����� �����ϴ�(override �ʼ�)
	
	private String name;
	private int age;
	
	public Test() {}
		
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Override�� ���� ������
	//TestAble3�� ���
	@Override
	public double calculator(double a, double b) {
		return (a*b+a+b/2)*0;
	}
	//TestAble���
	@Override
	public void test() {
		System.out.println("������ �׽�Ʈ!");
	}
	@Override
	public String getStr(String a) {
		return a+" BS";
	}
	//TestAble2���
	@Override
	public void testable2(String a, int b) {
		System.out.println("�̸��� "+a+"���̴�"+b);
	}
	
	//�⺻ �żҵ�
	public void otherMethod() {
		System.out.println("�� �޶�!");
	}
	public void otherMethod2() {
		System.out.println("���� �޶�!");
	}

	//get/set ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
