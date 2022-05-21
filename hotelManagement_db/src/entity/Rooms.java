package entity;

public class Rooms {
	
	private int number;//����ţ��Զ�������
	private int roompass;//��������
	private int price;//���䵥��
	private String style;//�������
	private String status;//����״̬
	
	public Rooms(int number) {
		//����,�˷�,�Ƴ�����Կר��
		this.number=number;
	}
	
	public Rooms(int number, int roompass, int price, String style) {
		// ����ר��
		this.number=number;
		this.price=price;
		this.roompass=roompass;
		this.style=style;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getRoompass() {
		return roompass;
	}
	public void setRoompass(int roompass) {
		this.roompass = roompass;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
