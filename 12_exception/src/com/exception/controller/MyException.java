package com.exception.controller;

public class MyException extends Exception{
	
	//���α׷����� ����ϴ� ���� �����.
	//�Ϲ�Ŭ������ Exception��ü �� �ϳ��� ��ӹ�����  Exceptoin ��ü�� ��.
	public MyException() {}
	
	public MyException(String msg) {
		super(msg);
	}

	
	
}
