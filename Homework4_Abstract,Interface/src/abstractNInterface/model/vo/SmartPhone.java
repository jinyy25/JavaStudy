package abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	//������ ����
	private String maker;
	
	public abstract String printInformation();
	
	public SmartPhone() {}
	
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
}
