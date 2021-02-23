package com.oop.model.vo;

public class Client {
	
	//id, pw, email, ���� -> ������ -> ���� -> �ڷ��� ������
	private String id;		//ȸ���� ���̵� 4 ~ 8���ڷ� ����
	private String pw;		//ȸ����й�ȣ 8�����̻�
	private String email;	//ȸ�� �̸����ּ�
	private double point;	//���ƿ� ���Ƚ��
	
	//�⺻������ : ��ü�� �����Ҷ� �ʿ��� ������ �ۼ�	 
	
	//�Ű������ִ� ������
	public Client(String id, String pw, String email, double point) {
		this.id=id;
		this.pw=pw;
		this.email=email;
		this.point=point;
	}
	
	//���� ���� �Ű����� ������
	public Client(String id, String pw, String email) {
	//this�����ڴ� �ݵ�� ������ ������ ����
		this(id,pw,email,0);
//		this.id=id;
//		this.pw=pw;
//		this.email=email;
	}

	//framework���� �̿��� �⺻�����ڷ� ������ �� ���� setter�� ���� ������.
	public Client() {
		this("userId","1111","print");
		this.point=100.10;
//		this.id="userId";
//		this.pw="1111";
//		this.email="print";
//		this.point=0.0;
	}
	
	//getter/setter : ��ü�� ������ ������ �����ؼ� ���� �������� ���� �����ϴ� ���
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}
}

