package com.override.model.vo;

public class Dog extends Animal{
	
	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	

	//�������̵�ó��  : ���� ������	
	//�żҵ� ����δ� �θ��� �żҵ�� �����ϰ� �ۼ�
	//������ �� ��ü�� �°� ������ ����
	
	//�żҵ弱��� ���� ������׼� Override
	@Override
	public String bark() {
		return "������������";
	}
	@Override
	public String info() {
		return "������";
	}
	
//	@Override 
//	public double calculator(int su,int su2, int su3) {
//		return su*su2;
//	}
	
}






