package com.basicevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//3. �̺�Ʈó�� �ܺ� Ŭ����
//MouseListener �������̽� Ȱ��
public class EventHandlerTest implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("�ܺ��ڵ鷯�� �̿��� �̺�Ʈó��!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}

}
