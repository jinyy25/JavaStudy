package common.sort;

import java.util.Comparator;

//generic : <>���� �ڷ�/������
public class StringSort implements Comparator<String>{	
	
	//String ��Һ�
	//compare 							����Ű : art + s + v 
	
	//���ڿ� ��(������������ ) : Comparator �̿�
	@Override
	public int compare(String o1, String o2) {
	return o2.compareTo(o1);	
	}

}
