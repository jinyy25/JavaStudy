package com.collection.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public void propertiesTest() {
		
		//Properties : key = value �������� �����͸� �����ϴ� Ŭ����			//���ڿ� �ڷḦ �����ϴ� Ŭ����
		//key:String, value:String
		
		//���� : ���ϰ� �����Ͽ� ó�� ����
		//������ �����ϰ�, ������ �� ����
		//���α׷��� �ֿ� ��������, ȯ�浥���� ���� �����ϰ� �ҷ��� �� ���� ���
		
		//1. �����ؼ� ��� : Properties
		Properties prop=new Properties();

		//2. ��ü�� ������ ���� : setProperty(key, value)
		prop.setProperty("name", "����ȣ");
		prop.setProperty("age","29");
				
		//3. ���Ͽ� ���� : store(�������� ��Ʈ��)�żҵ� �̿�
//		try {
//			prop.store(new FileWriter("prop.properties"),"���");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		//4. ���Ͽ� ����� ���� �ҷ����� : load(���ڿ� �θ��� ��Ʈ��)
		try {
			//prop.load(new FileReader("prop.properties"));
			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//5. properties�� �ִ� �� ��� : getProperty(Ű��);
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("password"));
		
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));		
//		System.out.println(prop.getProperty("nickName"));
				
	}

}
