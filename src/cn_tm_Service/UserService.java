package cn_tm_Service;

public interface UserService {
		//�޸��Ա�,��ʵ���������֤��
		public abstract String UpdataUserSex(int user_id,String sex,String name,String ID_number);
		//�޸��ֻ���
		public abstract String UpdataUserPhoneNumber(String PhoneNumber);
		//�޸�����,��������ж�д��servlet��
		public abstract String UpdataUserPwd(String Nepwd);
		//���ӵ�ַ,��һ��ƴ�ӳɵ�ʡ�����ĵ�ַ��һ����ϸ��ַ��
		public abstract String Addaddress(int user_id,String address,String detailaddress);
		//ɾ����ַ
		public abstract String RemoveAddress(int user_id,int address_id);	
		//�޸ĵ�ַ
		public abstract String UpdataAddress(int user_id,int address_id);
}
