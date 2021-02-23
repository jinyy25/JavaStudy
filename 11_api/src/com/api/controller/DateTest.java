package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//Gregorian�� Calendar�� ��Ӱ���

public class DateTest {

	public static void main(String[] args) {
				
		// ��¥�� Ȱ�� Ŭ���� : Date, Calendar, GregorianCalendar
		//1. ���糯¥�� �ð� : Date	
			Date today=new Date();										
			System.out.println(today);
			
			today=new Date(1234567851155L);
			System.out.println(today);		
			
		//2. Calendar��ü 
		//Calendar birthDay=new Calendar();
		Calendar birthDay=Calendar.getInstance();
		System.out.println(birthDay); 				//���� �ʵ忡 �����ؼ� ����� �ؾ���.
	
		//3. ������� : get()
		System.out.println("�� "+birthDay.get(Calendar.YEAR));
		System.out.println("�� "+(birthDay.get(Calendar.MONTH)+1));
		System.out.println("�� "+birthDay.get(Calendar.DATE));
		System.out.println("�� "+ birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� "+ birthDay.get(Calendar.MINUTE));	
		System.out.println("�� "+ birthDay.get(Calendar.SECOND));
			
		//��������Ȱ��
		int year=birthDay.get(Calendar.YEAR);
		int month=birthDay.get(Calendar.MONTH);
		int date=birthDay.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
		System.out.println(new Date(birthDay.getTimeInMillis()));
				
		//4. ��¥���� : set()
		birthDay.set(1992,11,25);
		System.out.println(new Date (birthDay.getTimeInMillis()));
			
		//5. �ʵ带 �̿��� ��¥���� : GregorianCalendar
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc);
		
		printDate(gc);
//			int year1=gc.get(Calendar.YEAR);
//			int month1=gc.get(Calendar.MONTH)+1;
//			int date1=gc.get(Calendar.DATE);
//			System.out.println(year1+"�� "+month+"�� "+date1+"�� " );	
		gc=new GregorianCalendar(1993,8-1,28);
//			year1=gc.get(Calendar.YEAR);
//			month1=gc.get(Calendar.MONTH);
//			date1=gc.get(Calendar.DATE);
//			date1++;
//			System.out.println(year1+"��"+month1+"�� "+date1+"��");	
		printDate(gc);
		
			gc.set(1,2020);
			gc.set(Calendar.MONTH,9-1);
			printDate(gc);
			Date birth2=new Date(gc.getTimeInMillis());
			System.out.println(birth2);
			
		//6. ��¥�� ���Ŀ� �°� ������ : SimpleDateFormat
			//00�� 0�� 0��
			//0000�� 00�� 00��
			//00.00.00/00-00-00
	
		//SimpleDateFormat sf=new SimpleDateFormat("yyyy�� MM�� dd��");
		//SimpleDateFormat sf=new SimpleDateFormat("yy.MM.dd");	
		  SimpleDateFormat sf=new SimpleDateFormat("yyyy�� MM�� dd�� E a hh:mm:ss");		
		  
		 //�Ű������� date�� ���� 
		//String strDate=sf.format(birth2);
		  String strDate=sf.format(gc.getTimeInMillis());
	   	  System.out.println(strDate);		
	}
	
	private static void printDate(Calendar c) {
			int year1=c.get(Calendar.YEAR);
			int month1=c.get(Calendar.MONTH)+1;
			int date1=c.get(Calendar.DATE);
			
			System.out.println(year1+"�� "+month1+"�� "+date1+"�� " );		
	}

	
	
}
