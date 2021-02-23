package file.controller;

import file.model.dao.FileDAO;

public class FileController {
	FileDAO fd= new FileDAO();
	
	//DAO�� �Ű������� �����ϰ�, DAO�κ������޹��� ���� �ٽ� ��ȯ
	public boolean checkName(String file) {	
	return fd.checkName(file);
	}
	
	//���޹��� �Ű������� �����ϰ� DAO�� ����
	public void fileSave(String file, StringBuilder sb) {		
	String s=new String(sb);
	fd.fileSave(file, s);
	}
	
	//DAO�� �Ű������� �����ϰ�, DAO�κ��� ���޹��� ���� �ٽ� ��ȯ
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	//���޹��� �Ű������� �����ϰ� DAO�� ����
	public void fileEdit(String file, StringBuilder sb) {
	String s=new String(sb);
	fd.fileSave(file,s);
	}
	
}
