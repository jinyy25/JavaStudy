package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		
		//String��ü 	: �Һ�
		//String�� String�� �ִ� ���� ����, ����, ������ �Ұ���
		  String name= "������";
				
		//hashCode() : �ּҰ�
		System.out.println(name+" : "+name.hashCode());
		name+="õ��";													//�ּҰ��� �ٸ�
		System.out.println(name+" : "+name.hashCode());

		
		//String ��ü���� ������ �޼ҵ�
		//1. ���ڿ��� �ִ� ���� ã�� : contains();
		String test="�����ٶ󸶹ٻ����ī";
//		for(int i=0;i<test.length();i++) {
//			if(test.charAt(i).equals())
//		}
		System.out.println(test.contains("��"));
		System.out.println(test.contains("��"));
		test="����ȣ ȭ����! ���� ������ �ϼ���. ��Ʈ���̶� �׸� �ο��!";
		System.out.println(test.contains("Ȳ��ȣ"));					//����
		System.out.println(test.contains("����"));					//����
		
		
		//2. Ư�������� ��ġ�� ã���ִ� �޼ҵ� : indexOf(����);
		//ã�� ������ �ε����� ��ȯ����. ��ã���� -1��ȯ 
		System.out.println(test.indexOf("��"));
		System.out.println(test.indexOf("��Ʈ��"));
		System.out.println(test.indexOf("Ȳ��ȣ"));
		System.out.println(test.indexOf(" "));
		char ch='a';
		int ich=ch;
		
		//�ߺ����� ������ �ι�° �� ã��
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));
		test="ttt.file.txt";
		
		
		//3. ������ �ڿ��� ���� ã�� : lastIndexOf()
		System.out.println(test.lastIndexOf("."));
			
		
		//4. ���ڿ��� �������ִ� �޼ҵ� : replace();
		test.replace("txt", "hwp"); 									// �������� ������� ����
		String test2=test.replace("txt", "jpg");						// �ٸ� ������ �޾ƾ���
		System.out.println(test2);
		System.out.println(test);
		
		
		//5. ���ڿ� ������ �������ִ� �޼ҵ� : trim();
		test="      �� ��    ";
		test2="����";
		System.out.println(test.trim().replace(" ",""));
		System.out.println(test.trim().equals(test2));
		System.out.println(test);
//		if(id.equals(dbid)) {}		
		
		
		//6. ���ڿ��� ���ϴ� ��ŭ �߶󳻴� �޼ҵ� : substring();	
		test="�Ļ�ð� ����ð� ����޴� ���Ÿ��!";
		//substring(�����ε���,���ε���) 									
		System.out.println(test.substring(0,2));
		//substring(�ε���)			//���ε��� x			
		System.out.println(test.substring(9));
		
		//substring() indexOf()�����Ͽ� ���
		System.out.println(test.substring(test.indexOf("����޴�"),test.indexOf("��")+1));
		
		//���Ͽ� ���� Ȯ���ڸ� ©�󳻱�
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
		
		
		//7. �迭������ִ� �޼ҵ� : split	
		test="������,����,����ȣ,������,�����,������";		
		//Ư�� �����ڸ� �������� 
		String[] names=test.split(",");
		System.out.println(names[3]);

		//���ڿ� 	  -> ���ڿ��迭 : split();
		//���ڿ��迭   -> ���ڿ� : join();
		for(String v : names) {
			System.out.println(v);
		}
		String returnStr=String.join("*^.~",names);
		System.out.println(returnStr);
		
		
		//8. StringBuffer : ���ڿ��� �����ϴ� ��ü
		//���� : ����� ���ڿ��� �����ϴ� ���� ����
		//��ü -> ����, ����, ���� �żҵ带 ���� �̷����
		//safty ����� �־� ���۰� ������
		StringBuffer sb=new StringBuffer("������");
		
		//StringBuffer ���
		System.out.println(sb+" : "+sb.hashCode());			//toString();�������̵� �Ǿ��־� :)
		
		//StringBuffer �� ����  								
		//8-1 ���ڿ� �߰��ϱ�(�ڿ��ٰ� ������): append()
		sb.append("������");									//�������� ������. String +=
		System.out.println(sb+" : "+sb.hashCode());
				
		//8-2. insert(,) : �������� Ư����ġ�� ���ֱ�
		sb.insert(3,"�ƺ���");
		System.out.println(sb);
				
		//8-3. delete() : Ư����ġ�� ���ڿ��� ����
		sb.delete(1, 3);
		System.out.println(sb);
				
		//8-4. replace( , , ) : Ư����ġ�� ���ڸ� ����
		sb.replace(3, 6, "õ��");
		System.out.println(sb);
		
		String str=new String(sb);
		System.out.println(str);
		sb=new StringBuffer(str);
		
		
		//9. StringBuilder
		//safty ����� �����Ƿ� ����
		StringBuilder sbu=new StringBuilder("������");
		sbu.append("������");
		System.out.println(sbu);
		
		stringTokenTest();				
	}
	
	//10. StringTokenizerŬ���� : ���ڿ��� Ư�� �����ڷ� �и��ϴ� ��ü
	public static void stringTokenTest() {
			
		String str="java,oravle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		
		StringTokenizer st=new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
//			if(temp.contains("c")) {
				System.out.println(temp);
//		}
//			if(st.nextToken().contains("c")) {
//				System.out.println(st.nextToken());
//			}
			}
		}

	
}
