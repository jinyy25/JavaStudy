package abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
		
		public V40() {
			super.setMaker("LG");
		}
		@Override
		public String charge() {
			return null;
		}
		@Override
		public String picture() {
			return null;
		}
		@Override
		public String makeCall() {
			return null;
		}
		@Override
		public String takeCall() {
			return null;
		}
		@Override
		public String touch() {
			return null;
		}
		@Override
		public boolean bluetoothPen() {
			return false;
		}
		
		@Override
		public String printInformation() {
			return "V40�� "+super.getMaker()+"���� ��������� ������ ������ ����.\n��ȣ�� ������ ��ȭ��ư�� ����\n"
					+ "��ȭ�ޱ� ��ư�� ����\n1200,1600�� ȭ�� Ʈ���� ī�޶�\n�������, "
					+ "��� ���� ����\n������\n������� �� ž�� ���� : "+bluetoothPen()+"\n";

		};
	
}	
		

