package com.first;
//�ܺ���Ű���� �ִ� Ŭ������ �̿��ϴ� ���
//import�� �ܺο� �ִ� Ŭ������ �ҷ���

import com.second.SecondTest;

public class FirstTest {
	
	public static void main(String[] args) {
		//�ּ��� ���ؼ� �����̳� ��ϻ����� ����
		//���ٸ� �ּ��� �ϴ� ���
		/* 
		  �������� �ּ��ϴ� ���
		  ������
		  ������!!!!
		 */
		//�ȳ�
		System.out.println("�ȳ� ���� ó������ �ڵ�!");
		
		System.out.println("�̰͵� ����غ�����!");
		
		//�ܺ�Ŭ���� ���(�޼ҵ�)�̿��ϱ�
		new SecondTest().printTest();//����
		
		int[][] nums= new int[3][4];
		int count=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=count++;
			}
		}
		
		for(int[] t : nums) {
			for(int v : t) {
				System.out.printf("%2d ",v);
			}
			System.out.println();
		}
		
		System.out.printf("%2d %s",nums[0][1],"�ȳ�");
		
	}
	
	
}
