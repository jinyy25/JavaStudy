package com.oop.main;

import java.util.Scanner;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

public class MethodMain {

	public static void main(String[] args) {
		
		
		
		//1. ��ȯ��x, �Ű����� x �żҵ� ȣ��
			Functional fun=new Functional();
		
		//2. ��ȯ��x, �Ű����� o �żҵ�ȣ��
			int su=10;
			int su2=20;
			fun.calculator2(10,20,new String[] {"*","/"});
		
		//3. ��ȯ�� o, �Ű����� x �żҵ�ȣ��
			//System.out.println(fun.calculator3());
			
			//int result=fun.calculator3();
			//System.out.println(result*100); //10;
				
		//4. ��ȯ��o, �Ű�����o �żҵ� ȣ��
			//result=fun.calculator4(20,20);
			//System.out.println(result);
		
			//�ι�°���� ȣ��
			//int res=fun.printer(2, 10);
			//System.out.println(res==0?"":res);
			
			//����° ���� ȣ��
			Scanner sc=new Scanner(System.in);
			System.out.print("�����Է� : ");
			//System.out.println(fun.checkChar(sc.next().charAt(0)));
		
		//��ü, �迭 �������ڷ��� �Ű�����, �������� �ۼ��غ���
		//��ü, �迭���� �������ڷ����� ������ �ִ� �ּҸ� �����ϱ� ������
		//�迭�� ��������Ͱ��� �������� ���Ǿ� �������� �����Ǵ� ����� �����´�.
//		int[] nums= {1,2,3,4};
//		System.out.println("==== ������ ====");
//		for(int a : nums) {
//			System.out.print(a+" ");
//		}
//		System.out.println();//����ǥ��
//		
//		fun.updateArray(nums);//�迭�ִ� ���� �����ϴ� ����
//		
//		System.out.println("==== ���� �� ====");
//		for(int a : nums) {
//			System.out.print(a+" ");
//		}
//		System.out.println();//����ǥ��
//		
//		System.out.println("���� �� : "+su);
//		//fun.basicUpdate(su);
//		su=fun.basicUpdate();
//		System.out.println("���� ��  : "+su);

		
		
		//student��ü�� ����� �װ�ü�� �����ϴ� ����� �żҵ常��� ��ü�� ���� �� ��������� Ȯ��
//		Student s=new Student("������",3,1,10,180.5,65.5);

		//fun.studentUpdate(s);
//		s=fun.studentUpdate();
//		System.out.println(s.getName()+s.getGrade()+s.getClassRoom()
//					+s.getClassNo()+s.getHeight()+"cm "+s.getWeight());
		
		Member1 m=new Member1();
		fun.insertMember(m);
		System.out.println(m.getId()+" "+m.getPw()+" "+m.getName()
							+" "+m.getEmail()+" "+m.getAddress());
			
		String result = fun.client();
		System.out.println(result);
		
	}

}








