package common.sort;

import java.util.Comparator;
import com.collection.model.vo.Sport;

public class SportPlayerSort implements Comparator<Sport>{
	
	//�ּҰ��� �����ϱ� ����
	private boolean flag;
	
	//ȣ���� ����
	//���� ��������� �Ű������� ����												
	public SportPlayerSort(boolean flag) {			
		//true -> ��������
		//false -> ��������
		this.flag=flag;
	}
	
	//�������� �������� ���ÿ� 
	@Override
	public int compare(Sport o1, Sport o2) {		
		return flag? o1.getPlayer()-o2.getPlayer()	//���׿����� Ȱ��
				:
					o2.getPlayer()-o1.getPlayer();
	}
	
}
