package common.sort;

import java.util.Comparator;

public class Number implements Comparator{
		
	//���ں� : Comparator�̿�
	@Override
	public int compare(Object o, Object o1) {
		
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su=(Integer)o;
			Integer su1=(Integer)o1;
			return su-su1;
		}
		return 0;
	}

	
}
