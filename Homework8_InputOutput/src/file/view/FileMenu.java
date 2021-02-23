package file.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import file.controller.FileController;

public class FileMenu {
	Scanner sc=new Scanner(System.in);
	FileController fc=new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("**** My Note ****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.println("�޴� ��ȣ : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : fileSave();break;
			case 2 : fileOpen();break;
			case 3 : fileEdit();break;
			case 9 : System.out.println("���α׷��� �����մϴ�.");break;	
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");return;
			}			
		}		
	}
	public void fileSave() {
		StringBuilder sb=new StringBuilder();
		sc.nextLine();
		while(true) {
		System.out.println("���Ͽ� ������ ������ �Է��ϼ���\n ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
		System.out.print("���� : ");
		String n=sc.nextLine();	
		if(n.equals("ex��it")) {
			break;
		}
		sb.append(n+"\n");
		}
		
	String file="";
	Loop:
		while(true) {
			System.out.println("������ ���ϸ��� �Է����ּ���(ex. myFile.txt) : ");
			file=sc.next();
			if(fc.checkName(file)) {
				System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�? (y/n)");
				char ch=sc.next().charAt(0);
				switch(ch) {
				case 'y': case 'Y' : break Loop;
				case 'n': case 'N' : break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");break;
				}				
			}else {
				break;
			}			
		}
		fc.fileSave(file,sb);
		System.out.println("���������� �����Ͽ����ϴ�");		
	}	
	
	public void fileOpen() {
		System.out.println("�� ���� �� : ");
		String file =sc.next();
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		}else {
			System.out.println("���� �����Դϴ�.");
		}		
	}
	
	public void fileEdit() {	
		System.out.println("������ ���� �� : ");
		String file = sc.next();
		if(fc.checkName(file)) {
			StringBuilder sb=new StringBuilder();				//����
			sc.nextLine();
			while(true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���");
				System.out.println("ex��it ��� �Է��ϸ� ����˴ϴ�.");
				String temp=sc.nextLine();
				if(temp.equals("ex��it")){
					break;
				}
				sb.append(temp+"\n");
			}
			fc.fileEdit(file, sb);
			System.out.println("���������� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���� �����Դϴ�.");
		}
	}
	public int choice() {
		try {
			return sc.nextInt();			
		}catch(InputMismatchException e) {
			return 0;
		}
	}
	
	
}
