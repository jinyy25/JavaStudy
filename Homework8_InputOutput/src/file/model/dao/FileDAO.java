package file.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	
	//�����ϴ� ������ �ִ��� Ȯ�� �� ��ȯ
	public boolean checkName(String file) {
	return new File(file).exists();	
	}
	
	//�Ű������� ���� ���� �� ���ڿ� ����
	public void fileSave(String file,String s) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(s);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	//�Ű������� ���� ���� ���� �̿��Ͽ� ���� �Ǿ� �ִ� ������ ��ȯ
	public StringBuilder fileOpen(String file) {
		StringBuilder sb= new StringBuilder();
		try(DataInputStream dis=new DataInputStream(new FileInputStream(file))){
			while(true) {
				sb.append(dis.readUTF());
			}
		}catch(IOException e) {			
		}
		return sb;
	}
	//�Ű������� ���� ���� �� ���ڿ� ����
	public void  fileEdit(String file,String s) {	
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
