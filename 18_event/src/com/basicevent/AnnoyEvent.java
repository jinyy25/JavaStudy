package com.basicevent;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnnoyEvent {
	

	public static void main(String[] args) {
		
		//1. �͸�Ŭ������ �̿��ؼ� �̺�Ʈ ����
		AnnoyEvent an=new AnnoyEvent();
		
		//Frame �� Panel
		JFrame f=new JFrame();
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();
		f.add(p);
		
		JButton btn=new JButton("�̺�Ʈ �ǽ�!");
		JLabel str=new JLabel();	
		
		p.add(btn);
		p.add(str);
				
		//��ư�� �̺�Ʈ����
		//Override Ȱ��
		btn.addMouseListener(new MouseListener() {
			
			//MouseŬ����
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//setText : ��ư Ŭ���� ���� ����
				System.out.println("��ưŬ�� :)");
				str.setText("��ư����");
				
				//event �߻��� ��ü�� ������ : getSource();
				System.out.println(e.getSource());
				//JButton btn=(JButton)e.getSource();
				btn.setText("��ư Ŭ��!");
				
				//Background �� Foreground color ����
				btn.setBackground(Color.blue);
				btn.setForeground(Color.white);
				System.out.println(e.getX()+" : "+e.getY());				
			}
			//Mouse�� ������ ������
			@Override
			public void mousePressed(MouseEvent e) {
				//�������� Ư�� �̺�Ʈ �߻�
				System.out.println("���콺����");
			}
			//Mouse�� ����
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺��������");
			}
			//Mouse�� �÷�������
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺����");
				JButton btn=(JButton)e.getSource();			
				btn.setBackground(Color.CYAN);				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺����");
				btn.setBackground(Color.MAGENTA);
			}			
		});
		
		//text ���� �ִ� ���� Ȯ��
		JTextField text=new JTextField(10);					
		p.add(text);
		
		//�ܺΰ�ü�� �̿��� eventó��
		str.addMouseListener(new EventHandlerTest());
	
		//event �����ϱ�
		//���� event handler Ŭ������ �̿��Ͽ� ó��
		text.addKeyListener(an.new TextEventHandler());
		JButton btn2=new JButton("��ư�ϱ�");
		btn2.addMouseListener(new MouseAdapterTest(text,p));
		p.add(btn2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
		
	
	//2. �̺�Ʈó�� ����Ŭ���� 
	//KeyListener �������̽� Ȱ��
	private class TextEventHandler implements KeyListener{
			
		//Ű���忡 �̺�Ʈ ����
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("Ű���� ġ�� ����");
			System.out.println(e.getKeyChar());
		}
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("Ű���崩��");			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("Ű�����");	
			
			//System.out.println(e.getKeyChar());
			JTextField text=(JTextField)e.getSource();
			
			if(text.getText().length()>5) {
				System.out.println("���� 5���̻� �Է� :>");
			}			
		}
	
	}	
}
