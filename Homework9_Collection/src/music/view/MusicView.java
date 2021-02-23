package music.view;

import java.util.Scanner;

import music.controller.MusicController;
import music.model.vo.Music;

public class MusicView {
	
		Scanner sc=new Scanner(System.in);
		MusicController mc= new MusicController();
				
		public void mainMenu() {
			while(true) {
				System.out.println("****** ���� �޴� ******");
				System.out.println("1. ������ ��ġ�� �� �߰�");
				System.out.println("2. ù ��ġ�� �� �߰�");
				System.out.println("3. ��ü �� ��� ���");
				System.out.println("4. Ư�� �� �˻�");
				System.out.println("5. Ư�� �� ����");
				System.out.println("6. Ư�� �� ���� ����");
				System.out.println("7. ��� �������� ����");
				System.out.println("8. ������ �������� ����");
				System.out.println("9. ����");
				System.out.print("�޴� ��ȣ ���� : ");
				int ch=sc.nextInt();
				switch(ch){
				case 1 : addList(); break;
				case 2 : addAtZero(); break;
				case 3 : printAll(); break;
				case 4 : searchMusic(); break;
				case 5 : removeMusic(); break;
				case 6 : setMusic(); break;
				case 7 : ascTitle(); break;
				case 8 : descSinger(); break;
				case 9 : System.out.println("����"); return;
				}
			}	
		}
		
		public void addList() {
			System.out.println("***** ������ ��ġ�� �� �߰� *****");
			System.out.print("�� �� : ");
			sc.nextLine();
			String title=sc.nextLine();
			System.out.print("���� �� : ");
			String singer=sc.nextLine();
			int result = mc.addList(new Music(title,singer));
			if(result==1) System.out.println("�߰� ����");
			else System.out.println("�߰� ����");
	
		}
		public void addAtZero() {
			System.out.println("***** ù ��ġ�� �� �߰� *****");
			System.out.print("�� �� : ");
			sc.nextLine();
			String title=sc.nextLine();
			System.out.print("���� �� : ");
			String singer=sc.nextLine();
			int result = mc.addAtZero(new Music(title,singer));
			if(result==1) System.out.println("�߰� ����");
			else System.out.println("�߰� ����");
		}
		public void printAll() {
			System.out.println("***** ��ü �� ��� ��� *****");
			System.out.println(mc.printAll());
		}
		public void searchMusic() {
			System.out.println("***** Ư�� �� �˻� *****");
			System.out.print("�˻��� ��� : ");
			sc.nextLine();	
			String title=sc.nextLine();
			Music m = mc.searchMusic(title);
			if(m==null)System.out.println("�˻��� ���� �����ϴ�.");
			else System.out.println("�˻��� ����"+m.getTitle()+"-"+m.getSinger()+"�Դϴ�.");
		}
		
		public void removeMusic() {
			System.out.println("***** Ư�� �� ���� *****");
			System.out.print("������ ��� : ");
			sc.nextLine();
			String title=sc.nextLine();
			
			Music m = mc.removeMusic(title);
			if(m==null)System.out.println("������ ���� �����ϴ�.");
			else System.out.println(m.getTitle()+"-"+m.getSinger()+"��(��) �����߽��ϴ�.");
		}
		
		public void setMusic() {
			System.out.println("***** Ư�� �� ���� ���� *****");
			System.out.println("�˻��� �� �� ");
			String stitle=sc.nextLine();
			System.out.println("������ �� �� : ");
			String title=sc.nextLine();
			System.out.println("������ ���� �� : ");
			String singer=sc.nextLine();
			
			Music m=mc.setMusic(stitle,new Music(title, singer));
			if(m==null)System.out.println("������ ���� �����ϴ�.");
			else System.out.println(m.getTitle()+"-"+m.getSinger()+"�� ���� ����Ǿ����ϴ�.");
		}
		
		public void ascTitle() {
			System.out.println("***** �� �� �������� ���� *****");
			int result = mc.ascTitle();
			if(result==1) System.out.println("���� ����");
			else System.out.println("���� ����");
		}
		public void descSinger() {
			System.out.println("***** ���� �� �������� ���� *****");
			int result = mc.descSinger();
			if(result==1) System.out.println("���� ����");
			else System.out.println("���� ����");
		}
}
