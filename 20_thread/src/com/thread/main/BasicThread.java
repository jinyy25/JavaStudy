package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {

	public static void main(String[] args) {
	
		//��ӹ��� ������ Ȱ���ϱ�
		InheritThread t1=new InheritThread();

		//�޼ҵ带 ȣ���Ͽ� �����带 �����Ŵ 
		//1. �����ư��鼭 ������ : start();
		t1.start();
		
		//2. ���ÿ� ������ : run();
		//Thread�� ������ ��������� �Ҵ�Ǿ�� �Ѵ�.
		//t1.run();
				
		//3. Runnable ������ ��ü�� ������ Ȱ���ϱ�
		InterThread it=new InterThread();
		Thread t2=new Thread(it);
		t2.start();
		
		try {
		//t1 ������ �����ϰ� ���� : join();
			t1.join(8000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		//������ �����Ű�� ���
		for(int i=0;i<10;i++) {
			System.out.println("main"+i+"��");
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
			}
			System.out.println("���ξ����� ����!");
	}
}
