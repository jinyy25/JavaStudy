package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	
	
	public void mapTest() {
		
	//Map : ��ü�����͸� �����ϴ� Ŭ����
		//������ : key : value ������ �̷����								//Ŭ������ ������ �޼ҵ带 �̿��Ͽ� ������ ó��				
		//Map : listƯ��, setƯ���� ���ÿ� ���� ����

		//key�� �ڷ��� 	  : Object;		 								//String, Integer�� ���� ���.
		//value�� �ڷ���  : Object;								 		//��� ��ü ���
		//���� : HashMap, TreeMap, LinkedHashMap

		//"Web"���� ����Ʈ�� ������ ���� key:value �������� �������Ե�
		//request.getParameter("userId");key:value
		

	//1. ���� : HashMap();
		HashMap map=new HashMap();
		
	//2. Map ���ֱ� : put(key,value);
		map.put(1,"������");
		map.put(2,"�輼��");
		map.put(3,"������"); 
			
		//key, value���� ��� ��ü�� �� �� ����
		map.put("���", "������");
		map.put("admin",new Member("admin","1234","������",19));
		map.put(new Member("user01","1111","����1",20),1);
		
	//3. Map ����� : get(key); 										// value���� ������ �� ����!!!!!
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","����1",20)));
		
		
	//4. ��� Ű�� Set�� ��� ��ȯ : keySet(); 								//key�� �ߺ� �ȵ� 
		//key�� Set ������� ���� 											//�Ѵ� iterator ���
		
		//��ü��¹�� 1  :  keySet();
		//Map�� ���� ���� key ��ü�� ��� : set�� �޾� ����ؾ� ��
		System.out.println("=== keySet���� ��� ===");
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {										//iterator���� hasNext�� ����Ȯ��
			Object key=it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		//��ü��¹�� 2	 : Map.Entry(); 								//key/value �������ٽ� ����
		//Map.Entry ��ü�� �̿��ؼ� �ѹ��� key, value���� ��� 
		System.out.println("=== Map.Entry��ü�� ��� ===");
		
		//entrySet();
		Set mapEntry=map.entrySet();
		Iterator it2=mapEntry.iterator();
		
		while(it2.hasNext()) {			
			Map.Entry entry=(Map.Entry)it2.next();					//Map.Entry��ü���� key���� value���� ���ÿ� �����ϰ� ����
			
			//key�� : Map.Entry.getKey();
			//value�� : Map.Entry.getValue();
			
			//System.out.println(it2.next());
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());			
		}
		
		System.out.println("=== for each������ ó�� ===");
		//Ű����������
		for(Object o : map.keySet()) {
			System.out.println(o);
			System.out.println(map.get(o));
		}
		
		for(Object a : map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//map ��ü�� �����ϰ� Ȱ��
		HashMap members=new HashMap();
		
		//member��ü 3��
		members.put(1, new Member("prince","4444","������",19));
		members.put(2, new Member("seolseol","3215","����ȣ",29));
		members.put(3, new Member("rockrock","����","�����",19));
		
		//����� ����� id�� ���
		//1
		Set mp=members.keySet();
		Iterator it3=mp.iterator();
		
		while(it3.hasNext()) {
			//it3.next() -> key��
			Object o=members.get(it3.next());//value
			System.out.println(((Member)o).getId());
		}

		//2	
		Set memEntry=members.entrySet();
		it3=memEntry.iterator();
		
		while(it.hasNext()) {
			Map.Entry en=(Map.Entry)it3.next();
			Member m=(Member)en.getValue();
			System.out.println(m.getId());
		}
		
		//3
		for(Object o : members.keySet()) {
			//Member m=(Member)members.get(o);
			//System.out.println(m.getId());
			System.out.println(((Member) members.get(o)).getId());
			}
		
		//map�� key ���� �ߺ��� �ȵ�.
		System.out.println(members.get(1));
		members.put(1,"�̰Ŵ� ��� �Ǵ� ?");
		System.out.println(members.get(1));
	
		//map�� key ���� �ߺ��� �Ǵ�?
		members.put(4,new Member("rockrock","����","�����",19));
		members.put(5,new Member("rockrock","����","�����",19));
		members.put(6,new Member("rockrock","����","�����",19));
		System.out.println(members);
		
		
	//5. map ��ü����Ȯ�� : size();
		System.out.println(members.size());
		
	//6. containsKey()/contatinsValue() : key���� �ִ���, value���� �ִ��� Ȯ��
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("rockrock","����","�����",19)));
		
	//7. map�� �ִ� ������ ���� : .remove();
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("rockrock","����","�����",19));
		members.clear();
	}
	
}
