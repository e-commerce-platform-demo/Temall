package cn_tm_Dao;

public interface SalesDao {
	//�˻�
	//del�Ƕ���״̬������˻��Ļ�����del״̬��Ϊ������ȡ��״̬
	public abstract String Sales(int user_id,int Order_id,int merchant_id);
	//�޸Ŀ�棬�������̼�
	public abstract String Updatainventory(int num,String sku);
	
}
