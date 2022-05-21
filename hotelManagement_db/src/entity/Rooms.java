package entity;

public class Rooms {
	
	private int number;//房间号（自动递增）
	private int roompass;//房间密码
	private int price;//房间单价
	private String style;//房间类别
	private String status;//房间状态
	
	public Rooms(int number) {
		//订房,退房,移除，秘钥专用
		this.number=number;
	}
	
	public Rooms(int number, int roompass, int price, String style) {
		// 增加专用
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
