package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException{
		//���������ϱ�
		//1. port��ȣ�� �����ϱ�
		//2. ServerSocket ����
		//3. Server���� �����ϱ�	
		//4. ����� ������ �̿��Ͽ� ��Ʈ������
		//5. ��������� ���� ������Ʈ�� ���
		//6. Ŭ���̾�Ʈ�� ���������� �ޱ�
		int port = 8888;
		ServerSocket server = new ServerSocket(port);
		while(true) {
			//client��û��� : accept();
			Socket client=server.accept();
			InputStream clientInput=client.getInputStream();
			OutputStream clientOutput=client.getOutputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(clientInput));
			PrintWriter pw=new PrintWriter(clientOutput);		
		while(true) {
			String msg=br.readLine();			
			if(!msg.equals("exit")) {
				System.out.println(client.getInetAddress().getHostAddress()+" : ");
				pw.println("���� �޼��� ���ż���");
				pw.flush();
			}else {
				System.out.println("��������");
				break;
			}
		}
		//���� ��Ʈ���� �ݱ�
		br.close();
		pw.close();
		client.close();
		}
	}

}
