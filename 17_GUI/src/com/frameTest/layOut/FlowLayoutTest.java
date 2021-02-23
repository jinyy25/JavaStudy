package com.frameTest.layOut;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
	
		//FlowLayOut
		setTitle("FlowLayOut");
		setBounds(100,100,400,500);
		
		//���ı��
		//setLayout(new FlowLayout());						//default �߾�����
		//setLayout(new FlowLayout(FlowLayout.LEFT));		//��������
		setLayout(new FlowLayout(FlowLayout.RIGHT));		//����������
		
		for(int i=0;i<20;i++) {
			if(i%2==0)add(new JButton(i+"��"));				//Button�� �̸��߰�
			else add(new Label("���ڸ�            "));				//Button�� ���ڸ� ����
		}
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
