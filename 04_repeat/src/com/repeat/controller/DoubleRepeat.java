package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {

	public void doubleRepeatTest() {
		//������ ����ϱ�
		for(int i=2;i<10;i++) {
			System.out.println(i+"��");
			for(int j=1;j<10;j++) {
				System.out.print(i+"X"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//1 2 3
		//4 5 6
		//7 8 9
		int su=1;
		for(int i=0;i<3;i++) {
			System.out.println("��");
			for(int j=0;j<3;j++) {
				System.out.print((su++)+" ");
			}
			System.out.println();
		}
		
		//9 8 7
		//6 5 4
		//3 2 1
		
		for(int j=0;j<3;j++) {
			System.out.print("����");
			for(int i=0;i<3;i++) {
				System.out.println("��");
			}
		}
		
		//���߹ݺ����� �̿��Ͽ� �ߺ���ã��
		String msg="apple";
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0
		for(int i=0;i<5;i++) {
			int count=0;
			//System.out.println(msg.charAt(i));
			for(int j=0;j<5;j++) {
				if(i!=j&&msg.charAt(i)==msg.charAt(j)) {
					count++;//1���� count=count+1;
				}
				//System.out.println(i+" : "+j);
				//System.out.println(msg.charAt(i)
				//		+" : "+msg.charAt(j));
			}
			System.out.println(msg.charAt(i)+" : "+count);
			//count=0;
		}
		
		
		
	}
	
	public void breakTest() {
		//break�� Ȱ���ϱ�
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==200) {
				break;
			}
		}
		Scanner sc=new Scanner(System.in);
		String msg="";
		//���ѹݺ��Ǵ� �޴��� �����ų��
		while(true) {
			System.out.print("���Է� : ");
			String temp=sc.nextLine();
			if(temp.equals("��")) {
				break;
			}else {
				msg+=temp;
			}			
		}
		//��ø�ݺ������� break�� ����ϱ�
		dinner:
		for(int i=2;i<10;i++) {
//			if(i%2==1) {
//				break;
//			}
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
				if(i%2==1) {
					break dinner;
				}
			}
		}
		
		//continue
		//�������� continue���� ������ continue�� �Ʒ��ִ� ������ ��������
		//�ʰ� ������������ ���� ������.
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
	
	
	
}




