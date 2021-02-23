package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sport;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {

	public void arrayListTest() {
		
	//1. list : �������̽�		
		//Ư¡ : �迭�� ������ �ڷᱸ���� ������ ���� 
		//�ε��� ���� ����, ������ ����, �ߺ��� ���� ����
		//���� : ArrayList, LinkedList, Vector
				
	//2. ArrayList : ��ü�� �����ϴ� ������ ������ Ŭ���� 
		//Object[] ������� ���� 				Ȱ������ �迭�� ��� : �迭�� ���, ���� []�� �̿�
		
		//Ŭ������ ���� (instanceȭ)�Ͽ� Ȱ��
		ArrayList list = new ArrayList();
		
		//list��ü�̱� ������ �޼ҵ带 �̿��ؼ� ó��.
		//list�� ���� �ִ� ��� : add(��ü/�ε���)�޼ҵ带 �̿�
		list.add("������"); 					//0
		//add method�� ������ ���������� 0�� �ε������� ���� ���Ե�
		list.add("����ũ��ƾƤ���"); 			//1
		
		//list�� �پ��� ��ü�� ������ �� ����
		list.add(new GregorianCalendar()); 	//2
		list.add(new Scanner(System.in)); 	//3
				
		//list�� ����� ��ü ����ϱ� : get(index) method�� �̿�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list.get(00)�� �ҷ���  => ������  => ��ü�� �ּ�	
		//��ü������ �����ϱ� ������ ����ȯ�� ��� 
		System.out.println(((String)list.get(0)).charAt(0));			//��

		//�ݺ����� Ȱ���ؼ� �����Ϳ� �����Ͽ� ó���� �� ����
		int [] a=new int[10];											//int �迭 ����
				
		//list����  :  list.size(); 										//���� �����͸� ���  //length�� �ٸ��� 
		System.out.println(list.size());//list�� ���ԵǾ� �ִ� ��ü�� ���� ���
		
		//ex) list������ �� GregorianCalender��ü���� �⵵ ���
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i) instanceof GregorianCalendar) { 
			//instanceof list.size�� object�� ��ȯ ��� ������
			
			GregorianCalendar gc=(GregorianCalendar)list.get(i);
			System.out.println(gc.get(Calendar.YEAR));			
			}
		}		
		List sports = new ArrayList();									//java�� List interface�� ������ ���� ArrayList�� ������ ����
		
		//���� �����ϴ� ������ 4���� ���� //��Ģ����
		sports.add(new Sport("��������","�౸",11,new String[5]));
		//sports.get(0)=new Sport("��������","�౸",11,new String[5]);
		sports.add(new Sport("��������","�߱�",9,null));
		sports.add(new Sport("�ⱸ�","�ｺ",1,null));
		sports.add(new Sport("��","����",8,null));
		
		// for���� �̿��ؼ� ��ü����ϱ�
		//for(int i=0;i<list.size();i++) {
			//System.out.println(sports.add(i));
		//}
		
	//3. forEach�� �̿��� ���
		for(Object o : sports) {
			System.out.println(o);
		}
				
		//������ ���������� �������� ���	- �౸				//forEach�� �̿�
		for(Object o : sports){
			if(o instanceof Sport) { 				//����o�� Sport�� ���Եȴٸ�  
				Sport s=(Sport)o;					//��ȯ�� ����
				if(s.getType().equals("��������")) {	//getType�� ���������� �ִ��� Ȯ����
				System.out.println(s);				//���
				}
			}
		}
		//�ι�° ���				- ����				//for�� �̿�
		for(int i=0;i<sports.size();i++) {
			if(sports.get(i) instanceof Sport) {
				Sport s=(Sport)sports.get(i);
				if(s.getType().equals("������")) {
					System.out.println(s);
				}
				
			}
		}	
		
	//4. list�� ���ϴ� ��ġ�� ������ �ֱ� : .add(index,data); 
		System.out.println("=== ���ϴ� ��ġ�� ���ֱ� ===");
		System.out.println(sports.get(2));			//2��° list�� �ִ� �ڷḦ �ҷ���
		
		sports.add(2,new Sport("��������","��",5,null));//2���� ���ο� ���� ����
		System.out.println(sports.get(2));			//����� �ڵ����� ������
		System.out.println(sports.get(3));			//2���� 3������ �и�
		
	//5. list Ư����ġ�� �� ���� : set(index,data);
		System.out.println("=== Ư����ġ �� �����ϱ� ===");
		System.out.println(sports.get(sports.size()-1));	//�Ǹ������� �ִ� �� (����)
		
		
		System.out.println(sports.get(sports.size()-2));	//(�ｺ)
		sports.set(sports.size()-2,"���� �����?");				//-2�ε����� ���� �Է�
		
		System.out.println(sports.get(sports.size()-2));	//(���� �����?)
		System.out.println(sports.get(sports.size()-1));	//(�౸)
		
		System.out.println(sports);							//��ü��� - override���
		
			
	//6. �����͸� �ѹ��� ���� : .clear(index);	
		
	//7. list�� �����Ͱ� �ִ��� Ȯ�� : .isEmpty();							
		//if(sports.size()>0) {
		if(!sports.isEmpty()) {								//isEmpty
			System.out.println("������ ����");					//isBlank null�� üũ�� �̿�
		}else {
			System.out.println("������ ����");
		}
		
	//8. ���ϴ� ������,��ü ���� : .remove(index);
		System.out.println(sports.size());
		
		sports.remove(3);									//3�� �� ����
		System.out.println(sports.size());
		System.out.println(sports.get(3));
		//System.out.println(sports.get(5));				//5�� �� ����
		
		System.out.println("����� �� ����");					//���ϴ� ��ü�� ���� 	
		System.out.println(sports.size());
		sports.remove(new Sport("��������","�౸",11,new String[5]));
	
		
		//���� ���� �� ����� : @Override equals() 
		System.out.println("���� �� ����");
		System.out.println(sports.size());
		System.out.println(sports.get(0));
		
		
	//9. list���ο��� Ư����ü�� ã�� �żҵ� : .contains() true/false�� ���
		System.out.println(sports.contains(new Sport("��","����",8,null)));
		System.out.println(sports.contains(new Sport("��������","�౸",11,new String[5])));
		
		
		//list �ߺ��� ���� 
		list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add("����");
		}
		for(Object n : list) {
			System.out.println(n);
		}
	}
	
		
		//list�ڷ� ����
		public void listSort() {
			//list���� �ε����� �������� ������ ����
			List nums=new ArrayList();
			
			for(int i=0;i<10;i++) {
				nums.add((int)(Math.random()*30)+1);
			}
			//for(Object o : nums){						//�Ʒ� �޼ҵ� �̿�
				//System.out.println(o);
			//}	
			
	//10. ���� �������� : Collections.sort(����);
			Collections.sort(nums);						
			System.out.println("=== �������� ���� �� ===");
			printList(nums);							//printList ��ü�� nums �Ű�
					
			//���� ��������									
			//1. ���������� ���� ��ü ���� -> Comparator �������̽�
			//2. ��ü ���ο� ���� ������ ���� -> Comparable �������̽�
			
	//11. compare()/compareTo()�żҵ� ���� 
			Collections.sort(nums,new NumberSort());
			System.out.println("=== �������� ���� �� ===");
			System.out.println(nums);
			nums.clear();		
			
			//���ڿ� �����ϱ� 
			nums.add("������");
			nums.add("������");
			nums.add("Ȳ��ȣ");
			nums.add("����ȣ");
			nums.add("�����");
			nums.add("������");
			System.out.println("==== ���ڿ� ����  ====");
			printList(nums);
			
			//�������� ����
			Collections.sort(nums);
			System.out.println("=== ���ڿ� �������� ����  ===");
			printList(nums);
			
			System.out.println("=== ���ڿ� �������� ���� ===");
			Collections.sort(nums,new StringSort());
			System.out.println(nums);		
			
			//��ü�� �� �ִ� list �����ϱ�
			nums.clear();
			nums.add(new Sport("��������","�౸",11,null));
			nums.add(new Sport("��������","��",5,null));
			nums.add(new Sport("�ｺ","�ｺ",1,null));
			nums.add(new Sport("��������","�״Ͻ�",2,null));
			nums.add(new Sport("��������","����",2,null));
			
			System.out.println("==== ������ ====");
			printList(nums);
			//Collections.sort(nums);
			Collections.sort(nums,new SportPlayerSort(true));
			
			printList(nums);
			Collections.sort(nums,new SportPlayerSort(false));
			
			System.out.println("==== ���� �� ====");
			printList(nums);
						
			//���� �͸�Ŭ������ �̿��ؼ� ����				//�ѹ��� ����Ҷ� ���� �ӽ� Ŭ����									
	//12. ���ٽ��� �̿��ؼ� ����				 
			Collections.sort(nums,new Comparator() {
				
				@Override
				public int compare(Object o1, Object o2) {
					return ((Sport)o1).getPlayer()-((Sport)o2).getPlayer();
				}
			});
			printList(nums);
			
			//���ٽ��� �̿��ؼ� ���ٷ� ����
			Collections.sort(nums,(o1,o2)  ->  (((Sport)o2).getPlayer()-((Sport)o1).getPlayer()));
			printList(nums);
			
		}
		
	
		
		private void printList(List list) {
			for(Object o : list) {
				System.out.print(o+" ");
			}
			System.out.println();
		}
											
		
	//inkedList�� �� ���� - ����� ����� �ٷ� ����
		//ArrayList�� �� ���������� ����						//�Ϸķ� ����Ǵ� ���±� ����
		public void linkedList() {						//linkedList�� �� ���� - ����� ����� �ٷ� ����
			//LinkedList ArrayList�� ����� ������			//�� ,, ������ �� ���� - �߰��� ��������
			LinkedList list=new LinkedList();			//�����ο� ���� ���±� ���� 
			
			//�� ����
			list.add("������");
			list.add("������");
			
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			
			list.add(1,"������");
			list.remove(1);			
		}	
	
}
