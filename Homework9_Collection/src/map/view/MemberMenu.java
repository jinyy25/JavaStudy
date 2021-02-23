package map.view;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import map.controller.MemberController;
import map.model.vo.Member;

public class MemberMenu {

	Scanner sc=new Scanner(System.in);
	MemberController mc=new MemberController();
	
	public void mainMenu() {
		System.out.println("====== kh site ======");
		while(true) {
		System.out.println("****** ���� �޴� *******");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���� �̸� ȸ�� ã��");
		System.out.println("9. ����");
		System.out.println("�޴� ��ȣ ���� : ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1 : joinMembership();break;
		case 2 : login();break;
		case 3 : sameName();break;
		case 9 : System.out.println("���α׷� ����");break;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); return;
		
		}
		}
	}
	public void memberMenu() {
		while(true) {
			System.out.println("***** ȸ�� �޴� ******");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");			
			System.out.println("�޴� ��ȣ ���� : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("�α׾ƿ� �Ǿ����ϴ�."); break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");return;
			}			
		}
	}
	public void joinMembership() {
		System.out.println("���̵� : ");
		String id=sc.nextLine();
		System.out.println("��й�ȣ : ");
		String password=sc.nextLine();
		System.out.println("�̸� : ");
		String name=sc.nextLine();
		Member m=new Member(); 
		
		boolean result = mc.joinMembership(id, new Member(password,name));
		if(result) {
		System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
		}else {
		System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���");
		}
		}
	public void login() {
		while(true) {
		System.out.println("���̵� : ");
		String id=sc.nextLine();
		System.out.println("��й�ȣ : ");
		String password=sc.nextLine();
		String name=mc.login(id, password);
		if(name!=null) {
			System.out.println(name+"��, ȯ���մϴ�!");
			memberMenu();
			return;
		}else {
			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է��� �ּ���");
		}
		}		
	}
	public void changePassword() {
		System.out.println("���̵� : ");
		String id=sc.nextLine();
		System.out.println("���� ��й�ȣ : ");
		String oldPw=sc.nextLine();
		System.out.println("���ο� ��й�ȣ : ");
		String newPw=sc.nextLine();
		boolean result=mc.changePassword(id, oldPw, newPw);
		if(result) {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�."); return;
		}else System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���");
	}
	public void changeName() {
		System.out.println("���̵� : ");
		String id=sc.nextLine();
		System.out.println("��й�ȣ : ");
		String password=sc.nextLine();
		String name=mc.login(id, password);
		
		if(name!=null) {
			System.out.println("���� ������ �̸� : "+name);
			System.out.println("������ �̸� : ");
			String newName=sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("�̸� ���濡 �����Ͽ����ϴ�."); return;
		}else {
			System.out.println("�̸� ���濡 �����Ͽ����ϴ�.");		
		}
	}
	public void sameName() {
		System.out.println("�˻��� �̸� : ");
		String name = sc.nextLine();
		TreeMap<String,String> tm=mc.sameName(name);
		for(Map.Entry<String,String> m : tm.entrySet()) {
			System.out.println(m.getValue()+" - "+m.getKey());
		}
	}
	
	
}
