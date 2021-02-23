package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		
		//try ~ catch�������� ����ó��
		Scanner sc=new Scanner(System.in);
		
		//�Է¹��� ���ڿ��� 3�������� ���
		for(int i=0;i<3;i++) {
			System.out.println("�����Է� : ");
			String name = sc.nextLine();
			
			//1.try{���� ����
			try {
				System.out.println(name.charAt(2));					
			//2.catch(��������){�������}
				}catch(StringIndexOutOfBoundsException e){			
					//e.printStackTrace();
					return;
			//3.Anyway ���
				}finally {											
					System.out.println("���α׷� ����");						
				}
				System.out.println("��� go :)");
			}		
		fileTry();
	}
	
	
	public static void fileTry() {
		File f=new File("test.txt");
		FileInputStream fis=null;	
		try {								    //finally ������ �����
			fis=new FileInputStream(f);		    //stream�� �ݾ�����ϱ� ������
			fis.read();							//IOException;			
		}catch(FileNotFoundException e) {		//������ �����ͺ��� ū������/�θ�exception�� �� ��Ƽ�,			
		}catch(IOException e) {
		}catch(Exception e) {					//���� ������ Exception���� �ذ��Ϸ��� ������ ����
			//e.printStackTrace();				//��: � Exception�� �߻��ߴ��� ���Ŀ� �����Ͽ� ó���ϱ� ����
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {				
//			}			
		}finally {
			try{
			//��Ʈ���ݱ� : close();	
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void trywithresourceTest() {
		//try with resource : ��ü�� ��ȯ������ϴ� ������ �ڵ����� �����ؼ� ó��
		//try{   
		//	}catch(����Ŭ���� e){    				
		//	}finally{try.....}
		
		//try(��ȯ��ü�� ����/����){    
		//	}catch(����Ŭ���� e){    }
		
		File f=new File("test.txt");
		//�ݾ��ִ� ���� ����
		try(FileInputStream fis=new FileInputStream(f);			   
			BufferedInputStream bis=new BufferedInputStream(fis);){
			bis.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}
