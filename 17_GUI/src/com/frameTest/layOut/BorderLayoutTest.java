package com.frameTest.layOut;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		
		//BorderLayout
		//Layout : Component��ġ�� �����ϴ°�
		
		//setTitle("â �̸�");
		setTitle("Border���̾ƿ�");						
		setBounds(100,100,800,500);
		
		//Layout ����
		setLayout(new BorderLayout());
		//���̾ƿ��� �������� ������ �⺻ Borderlayout�� ������.
		
		//JButton("�̸�")	;
		JButton btn=new JButton("����");
		JButton btn1=new JButton("������");				
		JButton btn2=new JButton("��");
		JButton btn3=new JButton("�Ʒ�");
		JButton btn4=new JButton("�߾�");
		
		//������ Component BorderLayout�� ���� ��ġ
		add(btn,"West");								//add(����,"�ڸ�");
		add(btn1,"East");								//ù���ڴ� �빮��!
		add(btn2,"North");
		add(btn3,"South");
//		add(btn4,"Center");
		add(new LoginPanel(),"Center");
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
}
