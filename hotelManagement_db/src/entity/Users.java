package entity;

public class Users {
	private String idnumber;//���֤�ţ����Զ�������
	private String name;//�û� ��
	private String password;//�� ��
	private String checkpass;//ȷ �� �� ��
	private String tel;//�绰
	
	public  Users(String idnumber,String name,String password,String checkpass,String tel){
		//ע��ר��
		this.idnumber=idnumber;
		this.name=name;
		this.password=password;
		this.checkpass=checkpass;
		this.tel=tel;
	}
	public Users(String name, String password) {
		//��½ר��
		this.name=name;
		this.password=password;
	}
	public  Users(String name,String tel, String idnumber) {
		// ����ר��
		this.name=name;
		this.tel=tel;
		this.idnumber=idnumber;
	}
	public  Users() {
		// ��������ר��
	
		
	}
	public  Users(String idnumber) {
		// ������ڣ�����Ȩ��ר��
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
