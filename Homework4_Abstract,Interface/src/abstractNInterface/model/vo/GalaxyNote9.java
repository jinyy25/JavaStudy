package abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

		
		public GalaxyNote9() {
			super.setMaker("�Ｚ");
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
			return true;	
		}		
		@Override
		public String printInformation() {
			return "������ ��Ʈ9�� "+super.getMaker()+"���� ��������� ������ ������ ����.\n��ȣ�� ������ ��ȭ��ư�� ����\n"
					+ "��ȭ�ޱ� ��ư�� ����\n13�� ȭ�� ��� ī�޶�\n�������, ��� ���� ����\n������, ������\n������� �� ž�� ���� : "+bluetoothPen()+"\n";
		}

}
