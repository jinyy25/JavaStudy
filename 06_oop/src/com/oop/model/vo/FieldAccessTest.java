package com.oop.model.vo;

//��������� �����׽�Ʈ
public class FieldAccessTest {
	
	//���������� ����� �ڷ��� ������[= ��];
	//public static String name;
	//public int publicInt;
	private int publicInt=20;				//default : 0
	//protected char protectedChar;
	private char protectedChar='A';			//default : ' '
	//String defaultString;
	private String defaultString="��ȣ~";		//default : null
	private double privateDouble=180.5;		//default : 0.0
	//public int age;
	private int age=180;
	
	//�ʵ��� �ڷ����� �ڹٿ��� ����ϴ� ��� �ڷ��� ��밡��
	private int[] intArr=new int[10];
	//private DefaultTest test=new DefaultTest();
		
	{
		publicInt=200;
		protectedChar='��';
		defaultString="�̰�!";
		privateDouble=180.5;
	}
	
	//������ �����ؼ� �����͸� ��������, ������ ���� ������ �� �ִ� �޼ҵ� 
	//������ 1:2�� ����������� getter(�������°�)/setter(������ ����)
	
	
	//���������� �����ڷ���(��ȯ��)
	//||void get������(){    } 
	//|| set������(�����ڷ��� ������){     }
	
	//getter : �������� �������� ���
	public int getAge() {
		return this.age;//�������ȣ��
	}
	//setter : ������ ���� �ִ� ���
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
	}
	

	
}





