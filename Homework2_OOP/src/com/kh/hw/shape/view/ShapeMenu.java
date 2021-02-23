package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
import com.kh.hw.shape.model.vo.Shape;

public class ShapeMenu {
	
	private Scanner sc=new Scanner(System.in);
	private Shape s=new Shape();
	private SquareController scr=new SquareController();
	private TriangleController tc=new TriangleController();
	
	
	
	public void inputMenu() {
		System.out.println("===== ���� ���α׷� =====");
		while(true) {
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int choice=sc.nextInt();
			switch(choice) {
			 case 3 : s.setType(3);triangleMenu();break;
			 case 4 : s.setType(4);squareMenu();break;
			 case 9 : System.out.println("���α׷��� �����մϴ�.");return;
			 default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���");
			 inputMenu();break;
			}
			
		}
		
	}
	public void triangleMenu() {
		
		while(true) {	
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int choice=sc.nextInt();
		switch(choice) {
			case 1 : inputSize(s.getType(),choice);break;
			case 2 : inputSize(s.getType(),choice);break;
			case 3 : printlninformation(s.getType());break;
			case 9 : System.out.println("�������� ���ư��ϴ�.");
			  		inputMenu();break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���"); break;
		}	
		} 
	}
	public void squareMenu() {
	
		while(true) {
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int choice=sc.nextInt();
		switch(choice) {
			case 1 : inputSize(s.getType(),choice);break;
			case 2 : inputSize(s.getType(),choice);break;
			case 3 : inputSize(s.getType(),choice);break;
			case 4 : printlninformation(s.getType());break;
			case 9 : System.out.println("�������� ���ư��ϴ�.");
						inputMenu();break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");break;
		}
		}
	}
	public void inputSize(int type, int menuNum) {
		if(type==3&&menuNum==1) {
			System.out.print("���� : ");
			double height=sc.nextDouble();
			System.out.print("�ʺ� : ");
			double width=sc.nextDouble();
			System.out.println(tc.calcArea(height,width));
			
		}else if(type==3&&menuNum==2) {
			System.out.print("������ �Է��ϼ��� : ");
			sc.nextLine();
			tc.paintColor(sc.nextLine());
			System.out.println("���� �����Ǿ����ϴ�");
			
		}else if(type==4&&(menuNum==1||menuNum==2)) {
			System.out.print("���� : ");
			double height=sc.nextDouble();
			System.out.print("�ʺ� : ");
			double width=sc.nextDouble();
			if(menuNum==1) {
				System.out.println(scr.calcPerimeter(height,width));				
			}else if(menuNum==2) {
				System.out.println(scr.calcArea(height, width));
			}
		}else if(type==4&&menuNum==3) {
			System.out.print("������ �Է��ϼ��� : ");
			sc.nextLine();
			scr.paintColor(sc.nextLine());
			System.out.println("���� �����Ǿ����ϴ�");
		}
	}
	public void printlninformation(int type) {
		if(type==3)System.out.println(tc.print());
		else if (type==4) System.out.println(scr.print());
	}
	
	
}
