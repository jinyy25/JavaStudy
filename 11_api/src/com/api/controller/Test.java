package com.api.controller;

public class Test {
	
		public static void main(String[] args) {
			String test;
			test="ttt.file.txt";
			test.replace("txt", "hwp"); 		    	// �������� ������� ����
			
			String test2=test.replace("txt", "jpg");
			System.out.println(test2);
			System.out.println(test);
		}
}
