package com.oop.model.vo;

//static(Ŭ����)���� �׽�Ʈ
public class StaticVariableTest {
	//��������� static���� ����ϸ� static����, Ŭ���������� Ȱ���.
	
	//1. Ŭ�������� : ���α׷� ���۰� ���ÿ� �޸𸮰���(static)�� �Ҵ��
	//			      �������� -> Ŭ������.������
	private static String name;
	
	
	//2. ������� : Ŭ������ new�����ڸ� ���� ��üȭ(����) ������ �Ҵ�(HEAP)
	//		     Stack������ �����͸� ������ ���� ���� �ݴ� ����
	private int su;

	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	//static������ �����ϱ� ���� getter/setter
	public static String getName() {
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//this.name=name;
		//StaticVariableTest.name=name;
	}
	
	
	
}
