package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ThrowsTest {

	public void exceptionTest2() throws FileNotFoundException{		
			throw new FileNotFoundException();
		}
		
	public void exceptionTest3() throws EOFException{
			throw new EOFException();
		}
		
	//����ó���� ��Ӱ��� ����	
	public void exceptionTest() throws FileNotFoundException,EOFException {

		//checkedException : �ݵ�� ó�� ������ �ۼ�
		
		//throw new IOException();			
			  exceptionTest2();
		      exceptionTest3();
		}
		
}
