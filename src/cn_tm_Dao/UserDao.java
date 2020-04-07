package cn_tm_Dao;

public interface UserDao {
	//修改性别,真实姓名，身份证号
	public abstract String UpdataUserSex(int user_id,String sex,String name,String ID_number);
	//修改手机号
	public abstract String UpdataUserPhoneNumber(String PhoneNumber);
	//修改密码,旧密码的判断写在servlet层
	public abstract String UpdataUserPwd(String Nepwd);
	//增加地址,传一个拼接成的省市区的地址，一个详细地址。
	public abstract String Addaddress(int user_id,String address,String detailaddress);
	//删除地址
	public abstract String RemoveAddress(int user_id,int address_id);	
	//修改地址
	public abstract String UpdataAddress(int user_id,int address_id);
}
