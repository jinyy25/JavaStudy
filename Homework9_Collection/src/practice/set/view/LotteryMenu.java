package practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import practice.set.controller.LotteryController;
import practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	Scanner sc=new Scanner(System.in);
	LotteryController lc=new LotteryController();

	public void mainMenu() {
		while(true) {
		System.out.println("**** ���� �޴� ****");
		System.out.println("1. ��÷ ��� �߰�");
		System.out.println("2. ��÷ ��� ����");
		System.out.println("3. ��÷ ��� Ȯ��");
		System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
		System.out.println("5. ��÷ ��� �˻�");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
		
		int ch=choice();
		
		switch(ch) {
		case 1 : insertObject(); break;
		case 2 : deleteObject(); break;
		case 3 : winObject(); break;
		case 4 : sortedWinObject(); break;
		case 5 : searchWinner(); break;
		case 9 : System.out.println("���α׷� ����");return;
		default : System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��� �ּ���"); break;
		}		
		}	
	}
	public void insertObject() {
		int n=0;
		while(true) {
		System.out.print("�߰��� ��÷ ��� �� : ");
		n=choice();
		if(n>0) break;
		System.out.println("0���� ū ������ �Է��ϼ���");
		}
		
		for(int i=0;i<n;) {
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone=sc.nextLine();
		boolean result = lc.insertObject(new Lottery(name,phone));
		if(result==false) {
		System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���");
		}else i++;
		}
		System.out.println(n+"�� �߰� �Ϸ� �Ǿ����ϴ�.");
	}
	public void deleteObject() {
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone=sc.nextLine();
		
		boolean result = lc.deleteObject(new Lottery(name,phone));
		if (result==false)System.out.println("�������� �ʴ� ����Դϴ�.");
		else System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
	}
	public void winObject() {
		for(Object o : lc.winObject()) {
			System.out.println((Lottery)o);
		}
	}
	public void sortedWinObject() {
		Iterator<Lottery> it=lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void searchWinner() {
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone=sc.nextLine();
		
		boolean result = lc.searchWinner(new Lottery(name,phone));
		if(result==false)System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		else System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");		
	}	
	public int choice() {
		try {
			return Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			return -1;
		}
	}

}
