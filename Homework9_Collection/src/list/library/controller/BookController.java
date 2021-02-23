package list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.library.model.vo.Book;

public class BookController {
	
	List<Book> list=new ArrayList<Book>();
	
	public BookController() {
		System.out.println("==== ���� ��ü ��ȸ ====");
		list.add(new Book("�ڹ��� ����","���� ��","��Ÿ",20000));
		list.add(new Book("���� ���� �˰���","������","��Ÿ",15000));
		list.add(new Book("��ȭ�� ���","������","�ι�",17500));
		list.add(new Book("�� ������","�ڽſ�","�Ƿ�",21000));		
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public List<Book> selectList() {
		return list;
	}
	public List<Book> searchBook(String keyword) {
		List<Book> searchList=new ArrayList<Book>();
		for(Book bk : list) {
			if(bk.getTitle().contains(keyword)) {
				searchList.add(bk);
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook=null;
		Book search=new Book(title, author, "",1);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(search)) {
				removeBook=list.get(i);
				list.remove(i);
			}
		}
		return removeBook;
	}
	public int ascBook() {
		try {
		Collections.sort(list);
		}catch(Exception e) {
		return -1;
		}
	return -1;
}
}