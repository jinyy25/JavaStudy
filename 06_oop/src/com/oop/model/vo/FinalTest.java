package com.oop.model.vo;


//final�׽�Ʈ 
public class FinalTest {
	//final : ��� �ѹ� ���� �����ϰ� �����Ҽ� ���� ���� ���
	//final�� �ݵ�� �ʱ�ȭ�� �������.
	public final int ID;
	public static final int ID2;
	
	//�ʱ�ȭ ��
//	{
//		ID=200;
//	}
	
	//static �ʱ�ȭ������ �ʱ�ȭ
	static {
		ID2=200;
	}
	
	//�����ڷ� �ʱ�ȭ
	public FinalTest() {
		ID=300;
		//ID2=200;
	}
	
	
	
}
