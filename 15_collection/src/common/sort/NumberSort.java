package common.sort;

import java.util.Comparator;


//Comparator ���� ���� ������
public class NumberSort implements Comparator{

	//���ں� : ��������
	@Override
	public int compare(Object o,Object o1) {				//o, o1�� ��
		//��ȯ���� ������ ����	 ���, 0, ���� -> 1, 0, -1
		
		//return ���� ����� �ΰ� ���� ������.						//��������
		//return ���� ������ �ΰ� �� ���� xx
		//return ���� 0�̸�  �ΰ� �� ���� xx
		if(o instanceof Integer && o1 instanceof Integer) {	//o, o1�� Integer ����
			Integer su=(Integer)o;
			Integer su2=(Integer)o1;

			//if(o>o1)
//			if(su>su2) return -1;					
//			else if(su<su2) return 1;
//			else return 0;			
			return su2-su;
		}
		return 0;
	}	
}
