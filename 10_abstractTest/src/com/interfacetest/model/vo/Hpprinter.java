package com.interfacetest.model.vo;

public class Hpprinter implements PrinterDriver{
	
	
	public void printHp() {
		System.out.println("hp�������۵�!! �μ���.....");
	}

	@Override
	public void print() {
		printHp();
	}
	
}
