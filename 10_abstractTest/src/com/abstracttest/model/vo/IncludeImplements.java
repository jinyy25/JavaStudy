package com.abstracttest.model.vo;

//IncludeAbstract ���
public class IncludeImplements extends IncludeAbstract{	
	//����� ��ü�� �߻�޼ҵ尡 ������ �ݵ�� Override�������.
	//�����ָ� ����� ���ϰ� ��.
	
	@Override
	public double calulator(int su, int su2) {
		return su/(double)su2;
	}

	@Override
	public String combine(String a, String b) {
		return null;
	}
	
	
}
