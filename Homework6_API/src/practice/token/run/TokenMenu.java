package practice.token.run;

import java.util.Scanner;

import practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc=new Scanner(System.in);
	TokenController tc= new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int ch=sc.nextInt();		
			switch(ch) {			
			case 1 :	tokenMenu(); break;
			case 2 : 	inputMenu(); break;
			case 9 :	System.out.println("���α׷��� �����մϴ�.");return;
			default : 	System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");			
			}			
		}		
	}
	
	public void tokenMenu() {
		String str= "J a v a P r o g r a m";		
		//��ū ó�� �� ����,����
		System.out.println("��ū ó�� �� ���� : "+str);
		System.out.println("��ū ó�� �� ���� ���� : "+str.length());
		str=tc.afterToken(str);
		//��ūó�� �� ����,����,�빮�� ��ȯ
		System.out.println("��ū ó�� �� ���� : "+str);
		System.out.println("��ū ó�� �� ����  ���� : "+str.length());
		System.out.println("��� �빮�ڷ� ��ȯ : "+tc.allCap(str));		
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		sc.nextLine();
		String input=sc.nextLine();
		
		input=tc.firstCap(input);
		System.out.println("ù ���� �빮�� : "+input);
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ��� : ");
		char one =sc.nextLine().charAt(0);
		int result=tc.findChar(input, one);
		System.out.println(one + "���ڰ� �� ���� : "+result+"\n");
		
		
		
	}
}
