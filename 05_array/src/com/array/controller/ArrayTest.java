package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	public void basicArray() {
		//�⺻ �迭 ����� �Ҵ��ϱ�
		int[] intArr=new int[3];
		//double �迭�����ϱ�
		double[] doubleArr=new double[3];
		//String�迭 �����ϱ�
		String[] strArr=new String[3];
		//char �迭 �����ϱ�
		char[] chArr=new char[3];
		
		//����Ʈ��Ȯ��
		System.out.println(doubleArr[0]);//0.0
		System.out.println(strArr[0]);//null
		System.out.println(chArr[0]);// 
		
		//���� ���� / ����ϱ�
		intArr[0]=20;
		//intArr[1]="����";
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
//		int a;
//		System.out.println(a);
		
		
		//String 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�ڽ��� �����ϴ� ������ 5�������� �����ϰ� ����ϱ�!
		String[] fruits=new String[5];
		//�ε��� ��ȣ : 0 1 2 3 4
		fruits[0]="����";
		fruits[1]="����";
		fruits[2]="����ƾ";
		fruits[3]="���ƹ�";
		fruits[4]="��";//��....��.....��...��....
		//����ϱ�
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		
		//for���� �̿��Ͽ� ����ϱ�
		for(int i=0;i<5;i++) {
			//System.out.println(i);
			System.out.println(fruits[i]);
		}
		fruits=new String[3];
		System.out.println("[3]"+fruits.length);
		fruits=new String[100];
		System.out.println("[100]"+fruits.length);
		
		//for���� �̿��Ͽ� �� �����ϱ�
		//for(int i=0;i<5;i++) {
		for(int i=0;i<fruits.length;i++) {
			fruits[i]="����";
		}
		/////////////////////////////////////
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		//���� 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�� ������ 1~5���� ���� �����ϱ�
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//�̸��� �Է¹ް� ��� ���α׷� �����
		//1. client�� ���� ����̸��� �Է����� �Է¹ް�
		//2. �� �� ��ŭ �迭�� ����� �̸��� �Է¹޾� �����ϰ�
		//3. �迭�� ����ϱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("����Է� : ");
		int su=sc.nextInt();
		String[] names=new String[su];
		for(int i=0;i<names.length;i++) {
			System.out.print("�̸��Է� : ");
			names[i]=sc.next();	
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//�迭�� �����Ҷ� 
		//����� ���ÿ� �ʱ�ȭ
		int age=19;
		int[] numbers={1,2,3,4,5};
		System.out.println(numbers[2]);
		String[] nn= {"����","������","���Ͽ�","������"};
		System.out.println(nn[0]);
		//names= {"����","���߱�","����","ȫ��õ"};
		names=new String[]{"����","���߱�","����","ȫ��õ"};
		System.out.println(names[0]);
		
	}
	
	//�迭�� ���� �ִ� ���
	public void inputArray(String[] temp) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<temp.length;i++) {
			System.out.print("�Է� : ");
			temp[i]=sc.nextLine();
		}
	}
	
	public void printArray(String[] t) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	
	public void arrayCopy() {
		//��������==�ּҰ��� �����ؼ� ������ �迭������ ���� ���°�!
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs;
		chs[0]='��';
		copyCh[copyCh.length-1]='��';
		
		System.out.println("==== chs������ ===");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("=== ����� �� ===");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+" : "+copyCh);
		
		//���� ����
		//heap������ �迭���� �߰������� ���� ���� �����ϴ°�!
		String[] str= {"��","��","��","��"};
		String[] str2=new String[str.length];
		//for���� �̿��� ����
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}
		str[0]="����";
		str2[str2.length-1]="������";
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]);
		}
		System.out.println();
		
		//System.arraycopy�żҵ� �̿� �����ϱ�
		//���ϴ� ��ġ�� ���� ���ϴ� ��ġ�� ������ �� ����
		String[] str3=new String[str.length];
		//System.arraycopy(str, 0, str3, 0, str.length);//��ü
		System.arraycopy(str,2,str3,2,2);
		
		//�迭�� ���� �Ҵ��ؼ� �Ҵ��� �迭������ ���� �����ϴ� ��
		
		//for(int i=0;i<str.leng,,,,)
		//for each���� ����غ���!
		//�迭�̳�, collection��ü�� ���� ������ �� ���
		//for(�迭�ڷ����� ���� : �迭 OR collection��ü){ ����  }
		System.out.println();
		for(String v : str) {//���� �� �� ��
			System.out.print(v);
		}
		System.out.println();
		for(String v : str3) {
			System.out.print(v);
		}
		System.out.println();
		
		//Arrays.copyOf(), clone() �迭������ �����ϰ� �������ָ� ��. * �Ҵ��� �ʿ����!
		
		//Arrays.copyOf()�żҵ� �̿��ؼ� ����
		//�迭�� �Ҵ����� �ʰ� ������ ������ �� ������
		String[] str4;
		str4=Arrays.copyOf(str, str.length);
		str4[0]="�� ���!";
		for(String temp : str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		
		//Arrays.copyOf();
		String[] str5;
		//System.out.println(str5);//�ƹ��͵� ���»���
		str5=Arrays.copyOf(str,2);//Arrays.copyOf������ �迭�� ����!
		System.out.println(str5);
		for(String v : str5) {
			System.out.println(v);
		}
		//clone() -> ��ü�� �����ϴ� ��ɸ� �ϴ� �żҵ�
		//�迭������.clone();
		str5=str.clone();
		for(String v : str5) {
			System.out.println(v);
		}
		
		
	}
	
	public void arrayTest() {
		int[] nums= {1,2,3,4,5};
		//nums=new int[5];
		//nums[0]=1;
		//nums[1]=2;
		//nums[2]=3;
		//nums[3]=4;
		//nums[4]=5;
		nums= new int[]{4,5,6,7,8};		
	}
	
	
	//������ �迭 ����ϱ�
	public void doubleArray() {
		//�������迭 �����ϱ�
		int[][] numbers=new int[3][3];
		//�������迭�� �� �����ϱ�
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//�������迭 ����ϱ�
		System.out.println(numbers[1][1]);
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		//�������迭�� ����� ���ÿ� �ʱ�ȭ!
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4];
		numbers=new int[][]{{10,20},{50}};
		numbers=new int[2][];
		numbers[0]=new int[10];
		numbers[1]=new int[2];
		
		//for���� �̿��Ͽ� �������迭 ó���ϱ�!
		//numbers����غ���
		//for(int i=0;i<3;i++) {
			//for(int j=0;j<3;j++) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				//System.out.println(i+" : "+j);
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		//
		
		
		
		
	}
	
}







