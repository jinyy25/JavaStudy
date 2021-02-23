package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		//setBounds(200,200,100,100);				
		setSize(400,300);
		setLocation(300,300);
		
		//Frame ������
		setTitle("First Frame");
				
		//FrameIcon���� : setIconImage(); 
		try {
		setIconImage(ImageIO.read(new File("cho.jpg")));
		}catch(IOException e) {
			e.printStackTrace();
		}		
		//Frame ũ����� 
		setResizable(false);
				
		//â�� ���� ���� ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//â�� ȭ�鿡 ���̴� ���
		setVisible(true);
	}
}
