package practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {}
	public String afterToken(String str) {
		//������ ��ū���� ó���� ���ڿ� ��ȯ
		StringTokenizer st=new StringTokenizer(str," ");
		str="";
		while(st.hasMoreTokens()) {
			str+=st.nextToken();
		}
		return str;		
	}
	public String firstCap(String input) {
		//ù ���ڸ� �빮�ڷ� �ٲ� ���ڿ� ��ȯ
		StringBuffer sb=new StringBuffer(input);	
		if(input.charAt(0)>='a'&&input.charAt(0)<='z') {				//ù����
			sb.replace(0, 1,""+(char)(input.charAt(0)-32));				//�����ڵ�Ȱ��
		}		
		return new String(sb);
	}
	public String allCap(String input) {
		StringBuffer sb= new StringBuffer(input);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
				sb.replace(i, i+1,"" +(char)(input.charAt(i)-32));
			}
		}
		return new String(sb);
	}
		
	public int findChar(String input,char one) {
		//���ڿ� �ȿ� ã�� ���ڰ����� �� �� ���ִ��� ��ȯ
		int count = 0;												//������ ã�� ���̹Ƿ�
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one){
				count++;
			}
		}
		return count;	
	}
	
}
