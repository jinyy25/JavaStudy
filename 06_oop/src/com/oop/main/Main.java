package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
import com.oop.model.vo.Member1;
//import com.oop.model.vo.DefaultTest;//not visible -> ���������ڿ� ���� ���� ���ѵ����� ������ ����
//import com.oop.model.vo.ABCTest;
import com.oop.model.vo.StaticVariableTest;

public class Main {
	
	
	//��ü ���ٰ��ɿ��� Ȯ�� : ���� �������� Ȯ��
	public static void main(String[] args) {
		
		//��ü�������� : new com.oop.model.vo.AccessTest();
		new AccessTest();
		
		//���������ڰ� defaultŬ���� ���� : new DefaultTest();
		
		//�ʵ� �����׽�Ʈ : FieldAccessTestŬ������ ��üȭ -> heap������ ��������� Ȯ�� -> Ȯ���� ������ �ּҸ� ��ȯ
		FieldAccessTest fct=new FieldAccessTest();
//		FieldAccessTest fct1=new FieldAccessTest();
//		FieldAccessTest fct3=new FieldAccessTest();
		
		//public : �ٸ� ��Ű������ ���������� ����
		//fct.publicInt=100;	
		
		//protected : �ڼհ�ü, ������Ű��, ����Ŭ����
		//fct.protectedChar='��';			
		
		//default : ������Ű��, ���� Ŭ����
		//fct.defaultString="�̰�����??";		
		
		//private : ����Ŭ����
		//fct.privateDouble=180.5;			
		
	
		//ĸ��ȭ�� �ϴ� ����
		//������ ������ �ɱ�??
		//fct.age=19;
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		//fct.setAge(19);						 //fct�� �ִ� age������ 19 ����
		//System.out.println(fct.getAge());	     //fct�� �ִ� age���� �� ��������
		fct.setAge(-19);
		System.out.println(fct.getAge());
		
		
		//static����, Ŭ��������
		//System.out.println(StaticVariableTest.name);
		//StaticVariableTest.name="������";
		//System.out.println(StaticVariableTest.name);
		//com.oop.model.vo.DefaultTest.a;
		
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("������");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		
		svt2.setName("svt2����!");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());
		System.out.println(svt2.getSu());
		
		
		//��� �̿��ϱ� : final
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
		System.out.println("=== �ʱ�ȭ ��� ===");
		
		//�ʱ�ȭ ��� ����
		InitialTest it=new InitialTest();
					System.out.println("it id : "+it.getId());
					System.out.println(it.getName());
					System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
					System.out.println("it2 id : "+it2.getId());
					System.out.println(it2.getName());
					System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) System.out.println("for�� id : "+ new InitialTest().getId());		
		
	}
	
}







