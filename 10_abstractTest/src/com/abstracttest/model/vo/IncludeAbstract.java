package com.abstracttest.model.vo;

//�߻�Ŭ����
public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
		
	//�ڡڡڡ��߻�޼ҵ尡 ���ԵǾ������� �ݵ�� �߻�Ŭ������ ����	
	//�߻�޼ҵ�� ����� �޼ҵ带 �ڽİ�ü�� ������Ŵ
	//�߻�޼ҵ�� ����θ� ������, �����ΰ� ����		
	
	//�߻�޼ҵ� : ���������� abstract ��ȯ�� �޼ҵ��(�Ű�����);
	public abstract double calulator(int a, int b);
	public abstract String combine(String a, String b);

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
