package com.exception.controller;

import java.io.IOException;

public class Main {

	public static void main(String[] args)	throws Exception{
		
		//System.out.println("�̰� ���� �Ǵ�?");
		//new ThrowsTest().exceptionTest();
		//System.out.println("Exception �Ʒ� ����");
		
		try {
			throw new MyException("����!! ������ ������");
			}catch(MyException e) {
			//printStackTrace : ���� ��� �޼ҵ� 
			  e.printStackTrace();
			  System.out.println(e.getMessage());
			}
		}
	}
