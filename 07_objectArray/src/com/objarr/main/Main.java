package com.objarr.main;

import com.objarr.model.vo.Nation;

public class Main {

	public static void main(String[] args) {
		//��ü�迭 ����ϱ�
		//��ü�迭 �����ϱ�
		Nation[] nations;
		
		//�迭�Ҵ� -> �������Ȯ���ϱ�
		nations=new Nation[3];
		//�����ϸ� �ȵǿ�!!
		//System.out.println(nations[0].getName());//�ȵ�!!! ���� ������!!!
		
		//�迭�� ��ü �ֱ�!
		//index�̿��Ͽ� ��ü �ֱ�
		nations[0]=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
		nations[1]=new Nation("�̱�",30000,"����",10000,"���");
		nations[2]=new Nation("�߱�",150000,"�߱���",10000,"��ȭ");
		
		Nation n=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
		n.getName();
		//�迭�� ����� ��ü �ҷ�����
		System.out.println(nations[0].getName());
		
		
		Nation[] nations2=new Nation[10];
		//for���� �̿��� �ʱ�ȭ ���
		for(int i=0;i<nations2.length;i++) {
			nations2[i]=new Nation();//default������ �ʱ�ȭ ��.
		}
		for(int i=0;i<nations2.length;i++) {
			System.out.println(nations2[i]);
		}
		//��ü�迭�� foreach�� ����� �����Ѱ�???
		for(Nation na : nations) {
			System.out.println(na.getName());
		}
		//��ü �迭 ����� ���ÿ� �ʱ�ȭ
		nations2=new Nation[] {new Nation(),new Nation()};
		Nation[] na= {new Nation(),new Nation(), new Nation()};
		
		
		
		
	}

}















