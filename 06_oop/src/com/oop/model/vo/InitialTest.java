package com.oop.model.vo;

//�ʱ�ȭ �׽�Ʈ
public class InitialTest {
	//�������
	private String name="�ȳ�";			//null
	private int size=180;				//0
	private int id;						//1�������� 1���ؼ� �ο�
	
	//priavte : �ܺο��� ������ �Ұ���
	private static int count;
		
	//�ʱ�ȭ ����� �����Ͽ� �ʱⰪ�� �����ϱ� : ��ü�� new�����ڷ� ������ �Ҷ� ����Ǵ� ����
	{
		this.name+="Rclass";
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("�ʱ�ȭ��Ͻ���!");
	}
	
	//static �ʱ�ȭ ��� : ���α׷��� ��Ÿ�ӵɶ�, 1���� ����
	//�������, ����޼ҵ��� ȣ�� �Ұ���
	static {
		//this.name="����";
		InitialTest.count=100;
		System.out.println("static�ʱ�ȭ�� ����!");
	}
	
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}

}
