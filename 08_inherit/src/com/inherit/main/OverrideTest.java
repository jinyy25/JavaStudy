package com.inherit.main;

import com.override.model.vo.Animal;
import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Dog;

public class OverrideTest {
	
	//mainŬ���� ����
	public static void main(String[] args) {
		
		Dog d=new Dog("����","�ǻ�",'F',"���");
		Cat c=new Cat("����̰�","��",'M',"���");
		Chicken ch=new Chicken("����", "����", 'F', "���");
		
		System.out.println(d.bark());
		System.out.println(c.bark());
		System.out.println(ch.bark());
		
		//new Animal().info();
		d.info();
		
	}

}






