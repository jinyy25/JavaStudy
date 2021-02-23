package list.library.view;

import java.util.List;
import java.util.Scanner;

import list.library.controller.BookController;
import list.library.model.vo.Book;

public class BookMenu {
	Scanner sc=new Scanner(System.in);
	BookController bc= new BookController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("== Welcome KH Librarry ==");
		System.out.println("***** ���� �޴� *****");
		System.out.println("1. �� ���� �߰�");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻� ��ȸ");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� �� �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
		int ch=Integer.parseInt(sc.next());
		switch(ch) {
		case 1 : insertBook(); break;
		case 2 : selectList(); break;
		case 3 : searchBook(); break;
		case 4 : deleteBook(); break;
		case 5 : ascBook(); break;
		case 9 : System.out.println("���α׷��� �����մϴ�.");return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}	
	}
	
	//1. �� ���� �߰��� view �޼ҵ�
	public void insertBook() {
		System.out.println("=== �� ���� �߰� ===");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("������ : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("���ڸ� : ");
		String author=sc.nextLine();
		
		System.out.print("�帣 (1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		int catNo=sc.nextInt();
		String[] category={"","�ι�","�ڿ�����","�Ƿ�","��Ÿ"};
		System.out.print("���� : ");
		int price=sc.nextInt();	
		
		bc.insertBook(new Book(title,author,category[catNo],price));
	}
	//2. ���� ��ü�� view �޼ҵ�
	public void selectList() {
		System.out.println("=== ���� ��ü ��ȸ ===");
		List<Book> list=bc.selectList();
		if(list==null) System.out.println("�����ϴ� ������ �����ϴ�.");
		else System.out.println(list);
	}
	//3. ���� �˻��� view �޼ҵ�
	public void searchBook() {
		System.out.println("=== ���� �˻� ===");
		System.out.println("�˻� Ű���� : ");
		sc.nextLine();
		String keyword=sc.nextLine();
		List<Book> searchList=bc.searchBook(keyword);
		if(searchList==null) System.out.println("�˻� ����� �����ϴ�.");
		else System.out.println(searchList);
	}
	//4. ���� ������ view �޼ҵ�
	public void deleteBook() {
		System.out.println("==== ���� ���� ====");
		System.out.print("������ ���� �� : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author=sc.nextLine();
		Book bk=bc.deleteBook(title, author);
		if(bk==null)System.out.println("���������� �����Ǿ����ϴ�.");
		else System.out.println("������ ������ ã�� ���߽��ϴ�.");
	}
	//4. ������ �������� ���Ŀ�
	public void ascBook() {
		if(bc.ascBook()!=1)System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		else System.out.println("���Ŀ� �����Ͽ����ϴ�.");
	}

}
