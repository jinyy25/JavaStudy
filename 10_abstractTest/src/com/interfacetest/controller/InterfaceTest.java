package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;

public class InterfaceTest {
	
	//1. Interface : ���߻��
	public static void main(String[] args) {
		
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
			
	//2. �������̽����� �����Ѱ��� ����� �ٸ��� ������ �ȵ�.
		//TestAble.age=20;
		//TestAble.name="�̰Ŵ�?";
		
		Test t=new Test();
			 t.test();
		System.out.println(t.getStr("������ ���� ���ǳ�������!!"));
		
	//3. �������̽��� �������ڷ������� ��� ����
		TestAble test;
		test=new Test("������",19);
		
		//�ʼ����� ��ɸ� ���̵��� ������.
		//�������̽��� ������ �޼ҵ常 ����.
		System.out.println(test.getStr("��� �����ð�!!"));
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];				//������!
		arrTest[0]=new Test();
			
	//4. �������̽��� Ŭ������ �޸� ���߱�������							//default���� ����Ͽ� �����ΰ� �ִ� �޼ҵ带 �������̽� ���ο��� ������ �����ϰԵ�.
		arrTest[0].whatHell("�̰� ����,, �� �ܿ�����");
		
	}
	
}







