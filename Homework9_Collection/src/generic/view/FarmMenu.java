package generic.view;

import java.util.Scanner;

import generic.controller.FarmController;

public class FarmMenu {
	Scanner sc=new Scanner(System.in);
	FarmController fc= new FarmController();
	
	public void mainMenu() {
		System.out.println("======= Kh ��Ʈ ======");
		System.out.println("***** ���� �޴� *****");
		System.out.println("1. �����޴�");
		System.out.println("2. �մԸ޴�");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : adminMenu(); break;
			case 2 : customerMenu(); break;
			case 9 : System.out.println("���α׷� ����"); return; 
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
	}
	public void adminMenu() {
		System.out.println("***** ���� �޴� *****");
		System.out.println("1. �� ��깰 �߰�");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ��깰 ���");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : addNewKind(); break;
			case 2 : removeKind(); break;
			case 3 : changeAmount(); break;
			case 4 : printFarm(); break;
			case 9 : mainMenu(); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}
	}
	public void customerMenu() {
		System.out.println("***** �� �޴� *****");
		System.out.println("1. ��깰 ���");
		System.out.println("2. ��깰 ����");
		System.out.println("3. ������ ��깰 ����");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int ch=sc.nextInt();
		while(true) {
			switch(ch) {
			case 1 : buyFarm(); break;
			case 2 : removeFarm(); break;
			case 3 : printBuyFarm(); break;
			case 9 : mainMenu(); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}
	}
	public void addNewKind() {}
	public void removeKind() {}
	public void changeAmount() {}
	public void printFarm() {}
	public void buyFarm() {}
	public void removeFarm() {}
	public void printBuyFarm() {}

	
}
