package com.abstracttest.model.vo;

//IncludeAbstract�κ��� ���
public class IncludeImplement2 extends IncludeAbstract{
	
	//��ӹ��� �θ�޼ҵ� ���ۼ�
	@Override 									
	public double calulator(int a, int b) {
		return a*b;
	}

	@Override
	public String combine(String a, String b) {
		return null;
	}	

}
