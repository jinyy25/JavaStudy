package com.abstracttest.model.vo;

public class Recipe extends Food{
	
	public Recipe() {}
	
	public Recipe(String kind, String name, String nation, int portion, int calory) {
	//�θ�����ڸ� ȣ��
	super(kind, name, nation, portion, calory);
	}
	
	public void cooking() {
		System.out.println("�丮�� ... ������ ����....");
	}

}
