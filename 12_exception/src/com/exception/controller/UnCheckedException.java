package com.exception.controller;

import java.util.Date;

public class UnCheckedException {
	
		public static void main(String[] args) {
			
			//UncheckedException : �ڵ�󿡼� �����ڰ� ó������ �ʾƵ� �Ǵ� Exception
			
			//1. ArithmeticException
				int a=0;
				int b=10;
				//System.out.println(b/a);
			
			//2. NullpointerException �߻�	
				String name=null;
				//System.out.println(name.charAt(0));
				
			//3. NegativeArraySizeException 	
				//int num[]=new int[-3];
				
			//4. ArrayIndexOutOfBoundsException 	
				//int[] num=new int[2];
				//System.out.println(num[3]);
			
			//����ó�� ���
			//try-catch��
//				int[] num=new int[2];
//				Scanner sc=new Scanner(System.in);
				
//				while(true) {
//					System.out.println("����");
//					int cho=sc.nextInt();
//					if(cho==0) break;
//					try{
//						System.out.println(num[3]);
//					//}catch(ArrayIndexOutOfBoundsException e) {
//						num=new int[num.length+5];
//						System.out.println("�ذ���");	
//					//}
//				}
			
			//5. ClassCastException �߻�
				Object obj=new Date();
				//Calendar c=(Calendar)obj;
				
			//throw��
				//���ܸ� ������ �߻���ų �� ����
				//throw���� �̿��ؼ� Exception�� �߻���Ŵ
			throw new NullPointerException("����.. ���� ?");
			
			
			
			
			
			
		}

		
}
