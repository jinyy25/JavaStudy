package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//interfaceȰ��� ����&���� ����
	//private Hpprinter  print=new Hpprinter();
	//private SamPrinter print=new SamPrinter();
	//private Lgprinter  print=new Lgprinter();
	private PrinterDriver driver;
	
	//�Ű������ִ� ������
	public PrintManager(PrinterDriver driver) {
		this.driver=driver;
	}
	
	public void print() {
		//print.printHp();
		//print.Samprinter("�Ｚ�μ�Ⱑ");
		//print.printLg();
		driver.print();				
	}
	
}
