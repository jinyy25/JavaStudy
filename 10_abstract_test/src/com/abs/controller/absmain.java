package com.abs.controller;

import java.util.ArrayList;
import java.util.List;

import com.abs.model.vo.Food;
import com.abs.model.vo.meth;
import com.abs.model.vo.school;

public class absmain {
	public static void main(String[] args) {
		school s= new meth();
		
		System.out.println(s.grade(2, 22));
		
		int n=1; int sum=0;
		for(int i=1;i<100;i++) {
			if((i%3)==0||(i%5)==0) sum+=i;			
		}
		System.out.println(sum);
	
		
		List food = new ArrayList();
		food.add(new Food("�߽�","¥��",1,new String[5]));
		food.add(new Food("���","���İ�Ƽ",2,null));
		food.add(new Food("�߽�","«��",3,null));
		
		
		for(Object o : food) {			
			if(o instanceof Food) {
				Food f=(Food)o;
				if(f.getKind().equals("���")) {
					System.out.println(f);
				}
			}
		}
		
		String test="�ȳ��ϼ���. �� �̸��� ������ �Դϴ�.";
		System.out.println(test.substring(0,6));
		String no="1234";
		System.out.println(Integer.parseInt(no));
		
		
	}
}
