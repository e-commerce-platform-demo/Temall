package cn_tm_Service;

public interface SalesService {
		//�˻�
		//del�Ƕ���״̬������˻��Ļ�����del״̬��Ϊ������ȡ��״̬
		public abstract String Sales(int user_id,int Order_id,int merchant_id);
		//�޸Ŀ�棬�������̼�
		public abstract String Updatainventory(int num,String sku);
}
