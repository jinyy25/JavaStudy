package com.argu;

public class ArguTest {
	//application ���۰� ���ÿ� �ܺο��� ���� �ʿ��Ҷ�
	//Run tap -> Run Configurations -> arguments tap -> variables -> string_promt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		for(String a : args) {
			System.out.println(a);
		}
	}

}
