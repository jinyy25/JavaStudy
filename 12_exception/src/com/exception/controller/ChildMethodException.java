package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildMethodException extends MethodOverrideTest{
	
	//throws ����ó��
	@Override
	public void exceptionOverride() throws FileNotFoundException,EOFException,IOException{
		
	}
}
