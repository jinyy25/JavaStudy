package com.frameTest.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioTest {
	
	public static void main(String[] args) {
		
		//JFrame �� ������� : JFrame
		JFrame f=new JFrame("RadioButton");
		
		//JFrame ũ������ : setSize(,);
		f.setSize(300,150);
		
		//Panel���� �� Panel�̸� : JPanel
		JPanel top=new JPanel();
		JLabel title=new JLabel("� ũ�⸦ ���ϼ���?");
		top.add(title);
		
		//North���⿡ Panel��ġ��Ŵ
		f.add(top,"North");
		
		//JPanel ũ������
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("Small");
		JRadioButton medium=new JRadioButton("Medium");
		JRadioButton large=new JRadioButton("Large");
		
		//�����ֱ� : ButtonGroup
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//JLabel
		//�̹��� ������ �־ ���� : ImageIcon
//		Image icon=new ImageIcon("cho.jpg").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("cho.jpg"));
		
		//ComboBox
		String[] names= {"������","����ȣ","����","�̼���","�����"};
		JComboBox<String> com=new JComboBox<String>(names);
		
		//�̸� ���� �س��� ��� : setSelectedIndex(); 
		com.setSelectedIndex(3);								
		content.add(com,"South");
		com.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> com=(JComboBox<String>)e.getSource();
				System.out.println(com.getSelectedItem());
				
			}
		});
		
//		com.addItemListener(new ItemListener(){
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//			System.out.println("�����ߴ�");
//			String text=(String)e.getItem();
//			System.out.println(text);
//			content.add(new JLabel(text));
//			content.revalidate();
//			}
//		});

		content.add(imageLa,"West");		
		f.add(content,"Center");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
