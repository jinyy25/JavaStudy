package com.first;
//��Ű�� �̸��� �ݵ�� 2���� ���� �̻����� �����
//com����.first����

//�ܺ� ��Ű���� �ִ� Ŭ������ �̿��ϴ� ���
//import�� �ܺο� �ִ� Ŭ���� �ҷ� ��
import com.second.SecondTest;
//�ܺ� Ŭ���� Ȱ���ϱ�
//��Ű�� �̸�.Ŭ���� �̸�����

public class FirstTest {
	
	public static void main(String[] args) {
		System.out.println("�ȳ� ���� ó������ �ڵ�!");
		
		//�ܺ� Ŭ���� ���(�żҵ�)�̿��ϱ�
		new SecondTest().printTest();
		
	}

}