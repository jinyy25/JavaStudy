package com.oop.model.vo;

//������ �׽�Ʈ ��ü
public class Member {

	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo;
	private int memberNo;
	private static int count;
	//��ü���� �����ڸ� �ۼ����� ������ �⺻�����ڸ� �ڵ����� �����Ͽ� ��������.
	
	//1. �⺻������ ���� (ó���ϴ� ���� ����, �Ű������� ����) : ����������(public) Ŭ������(){}	
	public Member() {//memberId="test";
		System.out.println("�⺻������ ȣ��!");
	}
	
	//2. �Ű������� �ִ� ������
	public Member(String memberId, String memberPw, 
			String name,String phone, String personNo) {
		System.out.println("�Ű����� memberId "+memberId);
		System.out.println("�Ű����� memberPw "+memberPw);
		System.out.println("�Ű����� name "+name);
		System.out.println("�Ű����� phone "+phone);
		System.out.println("�Ű����� personNo "+personNo);
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
	}
	
	//3. ��ü�� �Ϻθ�������� �ʱ�ȭ�ϴ� �Ű������ִ� ������
	public Member(String memberId,String memberPw) {
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	public Member(String name, String phone, String personNo) {}
//	public Member(String memberId, String memberPw, String name) {}
	public Member(String name, String phone, int personNo) {}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMemberId(String id) {
		memberId=id;
	}
	public String getMemberId() {
		return memberId;
	}
	//public void setMemberPw(String memberPw) {
	//�⺻������ �߰�ȣ�ȿ����� �̸��� ������ ������ ���� ����
	public void setMemberPw(String pw) {
		//this.memberPw=memberPw;
		memberPw=pw;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPersonNo(String no) {
		personNo=no;
	}
	public String getPersonNo() {
		return personNo;
	}
	//�ܺο��� ������ ���ϰ� set�� ��������� ����!
	public int getMemberNo() {
		return memberNo;
	}
}
