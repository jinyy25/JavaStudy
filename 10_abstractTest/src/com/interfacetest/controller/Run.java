package com.interfacetest.controller;

import com.interfacetest.model.vo.CannonPrinter;
import com.interfacetest.model.vo.Hpprinter;

public class Run {
	public static void main(String[] args) {
		
		//new PrintManager(new Hpprinter()).print();		//�μ��ɽ���!
		  new PrintManager(new CannonPrinter()).print();	//�μ��ɽ���!
		//new PrintManager().print();						//nullpoint err
		
	}

}
