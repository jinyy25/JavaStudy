package com.poly.model.vo;

public class Employee extends Person{

	private String deparment;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, int age, String address, String deparment, String job, int salary) {
		super(name, age, address);
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}



	public Employee(String deparment, String job, int salary) {
		super();
		this.deparment = deparment;
		this.job = job;
		this.salary = salary;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String getName() {
		return "���� ������?";
	}
	
	@Override
	public String toString() {
		//return "Employee �μ� "+deparment+" ��å "+job+" ���� "+salary;
		return getName()+getAge()+getAddress()+deparment+job+salary;
	}
	
	@Override										//Object�� Employee�� ����� ���� ��ӽ�Ŵ
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;				//e���� ����
			
			
			if(super.getName().equals(e.getName())	//e.getName�� �����getName�� ��	
					&&this.salary==e.salary) {		//���� �����ϰ� salaty��
				return true;						//���ٸ� true�� ��ȯ
			}
		}
		return false;
	}
	
	@Override
	public Employee clone() {
		//��������
		return new Employee(getName(),getAge(),getAddress(),
							deparment,job,salary);
	}
	
}