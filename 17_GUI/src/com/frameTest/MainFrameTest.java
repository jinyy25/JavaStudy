package com.frameTest;

import javax.swing.JFrame;

public class MainFrameTest {

	public static void main(String[] args) {
		
		//Frame -> window â �Ѱ�
		JFrame f=new JFrame();
		
		//â ��ġ, ũ�⼳��
		f.setBounds(100,100,300,400);
		
		//������ư����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ �������� ���̰� �ϴ� �Ӽ�
		f.setVisible(true);				
		
		
	}

}
