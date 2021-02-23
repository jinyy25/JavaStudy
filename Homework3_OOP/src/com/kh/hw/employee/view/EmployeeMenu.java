package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	
	Scanner sc=new Scanner(System.in);
	EmployeeController ec=new EmployeeController();

	Employee e=new Employee(0,null,(char)0,null,null,0,0);
	
	public EmployeeMenu() {	
		while(true) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : insertEmp();break;
			case 2 : updateEmp();break;
			case 3 : deleteEmp();break;
			case 4 : printEmp();break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;			
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");break;
			}
		}
	}
	public void insertEmp() {	
			System.out.print("��� ��ȣ : ");
			int empNo=sc.nextInt();
			e.setEmpNo(empNo);
			System.out.print("��� �̸� : ");
			String name=sc.nextLine();
			e.setName(name);
			sc.nextLine();
			System.out.print("��� ���� : ");
			char gender=sc.nextLine().charAt(0);
			e.setGender(gender);
			System.out.print("��ȭ ��ȣ : ");
			String phone=sc.nextLine();
			e.setPhone(phone);
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n)");
			char choice=sc.nextLine().charAt(0);
			
			while(true) {
				switch(choice) {
				case 'y': case 'Y' :
				System.out.println("��� �μ� : ");
				String dept=sc.nextLine();
				System.out.println("��� ���� : ");
				int salary=sc.nextInt();
				System.out.println("���ʽ� �� : ");
				double bonus=sc.nextDouble();
				ec.add(empNo, name, gender,phone,dept,salary,bonus);return;
				
				case 'n':case 'N': ec.add(empNo, name, gender, phone);return;
				
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
				}
			}	
	}
	public void updateEmp() {	
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.\n ����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int choice =sc.nextInt();
		while(true) {
			switch(choice) {
			case 1 : System.out.println("������ ��ȭ��ȣ : ");
					 String phone = sc.nextLine();
					 ec.modify(phone); break;
			case 2 : System.out.println("������ ���� : ");
					 int salary=sc.nextInt();	
					 ec.modify(salary); break;
			case 3 : System.out.println("������ ���ʽ� : ");
				     double bonus=sc.nextDouble();
				     ec.modify(bonus); break;
			case 9 : System.out.println("���θ޴��� ���ư��ϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�"); break; 
			}
		}
	}
	public void deleteEmp() {
		sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		String ch=sc.nextLine();
		if(ch.equals("y")||ch.equals("Y")) {
			ec.remove();
		if(e.getName()==null) {
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		}else {System.out.println("������ �����Ͽ����ϴ�.");
		}
		}else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	
	public void printEmp() {
		if(e.getName()==null)  System.out.println("��� �����Ͱ� �����ϴ�."); 
		else System.out.println(ec.inform());
	}
	
	
}
