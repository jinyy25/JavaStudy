package com.frameTest.view;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	public InheritFrame() {
		//�������̳� �⺻ container�� ����� Ŭ������ �����ڿ��� ��� ������ ����
				
		//������ �⺻���� 3����
		//1. �������� ũ��, ��ġ���� : setBounds();
		//���� : setBounds(x,y,width,height)				//��ġ(x,y) ũ��(width,height)
		setBounds(100,100,300,400);
		
		//2. â�� �ݴ� �̺�Ʈ : setDefaultCloseOperation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//3. â���̱� : setVisible()
		//Frame Object�� �⺻������ �Ⱥ��̰� ���� �Ǿ��ִ�.
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new InheritFrame();//������ �ϳ� ����		
	}
}
