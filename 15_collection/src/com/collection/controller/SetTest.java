package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {

		public void setTest() {
			
			//Set : ��ü������� .. �޼ҵ带 ȣ���ؼ� ����, ȣ��
			//Ư¡ : ������ ����, �����͸� ������ �� �ִ� �����ڰ� ����, �ߺ��� ������ �Ұ���
			//���� : HashSet, TreeSet
			HashSet set=new HashSet();
		
			//1. add(��)�żҵ带 ��� : ������ ����			
			set.add("������");
			set.add("����");
			set.add("�����");
			set.add("�̼���");
			set.add("Ȳ��ȣ");
	
			//2. Iterator : ��� �ڷḦ �ҷ����� object					// �������� �ϳ��� ������ ���� ����	
			//set�� ����� �����ʹ� �����͸� ������ �� �ִ� �����ڰ� ���� ������ ������ ����� ������ó�� ������
							
			Iterator it=set.iterator();						    // ��� ��ü�� Ʈ����(set)���� �Ѱ��ش�. 
			//while(it.hasNext()) {								// Ʈ���� �ؿ� �ڷᰡ �ִٸ�
				//System.out.println(it.next());				// ���
				//System.out.println(it.next());				// set.add�� 5�� �ε� ¦���� ������ 
																// 2���� ���� ������ ����.
				//while(it.hasNext()) {
				//	Object o=it.next();							// 2���� ���� �ʹٸ� ������ ���� �̿�
				//	System.out.println(o);
//				}
					
			// hasNext() : ���� ��ġ���� ���� �����Ͱ� �ֳ��� ? => True /False
			// Next() : ���������͸� �������ڽ��ϴ�. 		=> ���� �����͸� ������

			//set�� ����� �̼��� ã��
			//Iterator it2=set.iterator();						// ��Ȱ�� �Ұ��� 
			it=set.iterator();									// ������ ���� �ٽû�� 
			while(it.hasNext()) {
				Object o=it.next();
				if(o.equals("�̼���")) {
					System.out.println(o);
				}			
			}													

			System.out.println("==== forEach�̿� ====");
			
			//forEach�� ��� : set�� �ִ� ��ü ��ü�� ��ȸ			
			for(Object o : set) {								// set�� ����Ǿ� �ִ� �͵��� o�� �����Ͽ� ���
				System.out.println(o);
			}
			
			//set�� �ߺ��� ������ �ȵ�
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����");
			set.add("����ȣ");
			set.add("����ȣ");
			set.add("����ȣ");
			set.add("����ȣ");
			
			//��ü���
			Iterator it3 = set.iterator();
			while(it3.hasNext()) {
				System.out.println(it3.next());
			}

			//Lotto�ߺ���
			HashSet lotto=new HashSet();
			
			
//			for(int i=0;i<7;i++) {
//				lotto.add((int)(Math.random()*44)+1);
//			}
			
			while(true) {											//���ѷ��� Ȱ�� - �ߺ������� �ٽ� �����ϴ� ����
				lotto.add((int)(Math.random()*44)+1);				
				if(lotto.size()==7) {								//7�� ���� ����
					break;
				}
			}
				
			//�ߺ����� �������� ����
			for(Object o : lotto) {									
				System.out.print(o + " ");
			}
			System.out.println();
		
			
			//3. size() : set�� �ִ� ������ Ȯ��
			lotto.clear();
			if(lotto.size()==0) {
				System.out.println("������ ����");
			}
			
			//set�� ���� ���� ��ü�ֱ�
			//Member Ŭ���� ����� id,pw,name,age
			//id�� ������ ���� �ʰ� �ֱ�
			//1. admin,1234,������,19
			//2. user01,1111,����1,20
			//3. user02,2222,����2,21
			//4. user03,3333,����3,22
			//5. admin,1234,������,19	
		}
		
		public void Mem() {
			Set hs=new HashSet();
			Iterator it=hs.iterator();	
			
			hs.add(new Member("admin","1234","������",19));
			hs.add(new Member("user01","1111","����1",20));
			hs.add(new Member("user02","2222","����2",21)); 
			hs.add(new Member("user03","3333","����3",22));
			hs.add(new Member("admin","1234","������",19));
			
			for(Object o : hs) {
				System.out.println(o);
			}
			
			
			//4. remove(��ü) : ����(��ü����, �Ϻλ���)								//Override ����񱳸� ��������
			hs.remove(new Member("user01","5555","������",18));
			System.out.println("=== ���� �� ===");
			
			//�ݺ� 2���� ��� 	for��-iterator
//			for(Object o : hs) {
//				System.out.println(o);
//			}

			System.out.println("=== iterator�� ��Ȱ�� �Ұ��� ===");
			
			//iterator�� �ٽ� Ȱ���Ϸ��� ���Ҵ�								//iterator : ���𰡸� �ݺ��ϰ��� �Ҷ�  
			it=hs.iterator();
			System.out.println(it.next());
			
			
			//5. Set <--> List�� ���� ȣȯ
			//Set, List Collection 
			ArrayList list=new ArrayList();
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(2);
			list.add(3);
			System.out.println(list);
			
			Set temp=new HashSet(list);
			list=new ArrayList(new HashSet(list));			
			System.out.println(list);			
		}
	
}
