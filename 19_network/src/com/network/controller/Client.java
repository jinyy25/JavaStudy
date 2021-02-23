package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		//client�����ϱ�
		
		//1. ���� ��û�� ������ ��Ʈ
		//2. ������ ������ �ּ�,��Ʈ�� ������ socket ����
		//3. ���� ��Ʈ������
		//4. ������ ���� �����Է� ��ɱ���
		//5. ������ �����͸� ����
		//6. �������� �� ������ Ȯ��
		int port=8888;	
		BufferedReader br=null;
		PrintWriter pw=null;						//PrintWriter : ��û ��� ���
		Socket socket=null;		
		try {
			socket=new Socket("192.168.120.24",port);			
			if(socket!=null) {				
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw=new PrintWriter(socket.getOutputStream());
				
				Scanner sc=new Scanner(System.in);
				System.out.println("��ȭ�Է�");
				do {
					String msg=sc.nextLine();
					pw.println(msg);
					pw.flush();					
					if(msg.equals("exit")) {
						break;
					}
				System.out.println(br.readLine());
				}while(true);				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				pw.close();
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
