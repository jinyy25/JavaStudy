package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetwork {

	public static void main(String[] args) throws UnknownHostException{
		
		//IP�� Ư�� ����Ȯ��
		
		//InetAddress
		InetAddress localIp=InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());		//�� �������ּ�
		System.out.println(localIp.getHostName());			//�� ��ǻ���̸�
		
		//naver Ip address HostName
		InetAddress naver=InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		
		
		
		
	}

}
