package cn_tm_pojo;

public class user {
	//用户id
	private Integer user_id;
	//用户名字
	private String user_name;
	//真实姓名
	private String real_name;
	//账户
	private String name;
	//密码
	private String pwd;
	//性别
	private String sex;
	//地址
	private String address;
	//手机号
	private String cell_phone_number;
	//商家判断,1代表用户，2代表商家,3代表管理员
	private Integer type;
	//余额
	private Double money;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCell_phone_number() {
		return cell_phone_number;
	}
	public void setCell_phone_number(String cell_phone_number) {
		this.cell_phone_number = cell_phone_number;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
}
