package com.interfacetest.model.vo;

public interface TestAble {
	
	//����� �ʵ带 ������ ����
	public static final int age=19;
	String name="������";
		
	//�żҵ�� �߻�޼ҵ常 ���� �� ���� 
	//Override�� ���� public ���������ڸ� ����
	//�⺻������ �޼ҵ� �����ϸ� �߻�޼ҵ�� ���� ������ public abstract�� ������ ����.
	
	//�߻�޼ҵ�  
	//���������� abstract 							
	public void test();
	
	//�߻�޼ҵ� public abstract
	String getStr(String a);
	
	//�żҵ� �����θ� ������ �� �ֳ�???
	default void whatHell(String why) {
		System.out.println(why);
	}
}
