package com.api.controller;

public class WrapperTest {

	public static void main(String[] args) {
		
		//WrapperŬ���� : �ڵ����� ����ȯ�Ͽ� �⺻�ڷ������� ����
		//�⺻�ڷ����� �ʿ信 ���� �ڵ����� WrapperŬ������ ���氡��
			int age=19;
			Integer ageW=age;
			System.out.println(ageW);
		
			int su=ageW;
			printTest(su);	
				
			double height=180.5;
			Double dheight=height;
			System.out.println(dheight);
			printTest(height);
			
			
		//wrapperŬ������ ������ �޼ҵ�		
		//1. ���������� ���ڰ��� ���������� ���� : wrapperŬ������.parse wrapperŬ������(�����ҹ���);
			String test="2020";
			//test���ڸ� int������ ����
			int year = Integer.parseInt(test);					
			System.out.println(year);			
				
			test="65.5";
			double weight=Double.parseDouble(test);							//test���ڸ� double������ ����	
			System.out.println(weight);					
			
			//Integer.valueOf();
			//int a=Integer.valueOf(test);
			//System.out.println(a);
		
			
		//2. �ٸ� �ڷ����� ���������� ���� : String.valueOf();
				test=String.valueOf(age);
				System.out.println(test);									//test�� int�� �ٽ� ���������� ����
				
				test=String.valueOf(height);	
				System.out.println(test);
	}
	
	//Ingeger�� �θ�� Object
	public static void printTest(Object obj) {
		System.out.println(obj instanceof Integer);
	}

}
