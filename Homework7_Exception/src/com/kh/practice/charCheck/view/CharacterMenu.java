package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;


public class CharacterMenu {
	Scanner sc=new Scanner(System.in);
	public void menu() {	
		System.out.println("���ڿ� : ");
		String s=sc.nextLine();
		try {
			System.out.println("'"+s+"'"+"�� ���Ե� ������ ���� : "
				+ new CharacterController().countAlpha(s));
		}catch(CharCheckException e) {
			e.printStackTrace();
		}	
	}
}
