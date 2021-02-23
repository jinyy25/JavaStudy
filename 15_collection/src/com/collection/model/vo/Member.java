package com.collection.model.vo;

import java.util.Objects;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	//1. �񱳰������� ����� ����
	@Override							
	public boolean equals(Object obj) {					//Id ����
		if(obj instanceof Member) {						//Member��ü�� Object�� �� �� �ִٸ�
			Member m=(Member)obj;						//m���� ����
			if(this.id.equals(m.id)) {					//�ּҰ��� ���ٸ�
				return true;							//true�� ��ȯ
			}
		}
		return false;
	}
	
	//2. Objects.hash(����);
	//Set,Map���� ��ü�� �����ϰ� ������ �ּҰ��� ��ġ���Ѿ� �Ѵ�.     		�١١١١�
	//���� ������ָ� Mapping �Ǿ� ����							//hashCode�� �������̵� �Ұ�
	@Override
	public int hashCode() {						
			return Objects.hash(id,age);				
	}
	
	
	
	
	
	
	
	
}
