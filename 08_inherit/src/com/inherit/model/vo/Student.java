package com.inherit.model.vo;

public class Student extends Teacher {//�ִ�.
	//�̸� ���� �ּ� ��ȭ��ȣ �г� �� ��ȣ
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classRoom;
	private int number;
	
	//1. �⺻������ ����� ����Ű : ctrl+space+enter
	public Student() {}
	
	//2. �Ű������ִ� ������ : alt+s+a+g
//	public Student(String name, int age, String address, 
//			String phone, char gender, int grade, int classRoom, int number) {
	public Student(int grade, int classRoom, int number) {
		
		//super();
	//3. �θ��� �����ڸ� ȣ��
		//super();//�θ��� �⺻�����ڸ� ȣ��
		
		//super(name,age,address,phone,gender);//�θ��� �Ű������ִ� �����ڸ� ȣ��
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
		
//		if(name.length()>2) {
//			this.name = name;
//		}
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
	}
	
	//setter/geter����� : alt+s+r+a+r
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		if(name.length()>2) {
//			this.name = name;
//		}
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return "�ڽ�!";
	}
	
	
	
	//�ڽİ�ü���� �θ�ü ������ �����ϱ�
	public String information() {
		
		
		//�θ�ü�� �����ϴ� ��� -> super.get����()
		//�θ𺯼��� ���������ڰ� private �̸�
		//getter/setter�� �̿��ؼ� �����ؾ���.							
		return super.getName()+" "+super.getAge()+" "+
					super.getAddress()+" "+super.getPhone()+" "+
					super.getGender()+" "
					+grade+" "+classRoom+" "+number;
	}
	
	
	
	
	
}
