package entity;

public class Users {
	private String idnumber;//身份证号（非自动递增）
	private String name;//用户 名
	private String password;//密 码
	private String checkpass;//确 认 密 码
	private String tel;//电话
	
	public  Users(String idnumber,String name,String password,String checkpass,String tel){
		//注册专用
		this.idnumber=idnumber;
		this.name=name;
		this.password=password;
		this.checkpass=checkpass;
		this.tel=tel;
	}
	public Users(String name, String password) {
		//登陆专用
		this.name=name;
		this.password=password;
	}
	public  Users(String name,String tel, String idnumber) {
		// 订房专用
		this.name=name;
		this.tel=tel;
		this.idnumber=idnumber;
	}
	public  Users() {
		// 更改密码专用
	
		
	}
	public  Users(String idnumber) {
		// 付款，拉黑，更改权限专用
		this.idnumber=idnumber;
		
	}
	
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheckpass() {
		return checkpass;
	}
	public void setCheckpass(String checkpass) {
		this.checkpass = checkpass;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
