package cn_tm_Service;

import java.util.ArrayList;

import cn_tm_pojo.Order;
import cn_tm_pojo.commodity;

public interface OrderService {
	//���ȴ���һ�������ţ�Ȼ���ȡ�������ź��ٴ�������
		//�����Ŵ�������
		public abstract String EstablishOrdernumber(int user_id);
		//�����������򶩵�,���ض�����ӳɹ���ʧ��,OrderNumber�������
		public abstract String EstablishOrder(int commodity_id,String sku,int num,int user_id,int OrderNumber);
		//�������ﳵ����,���سɹ�ʧ��
		public abstract String EstablishSPOrder(ArrayList<commodity> commodity,int num,int OrederNumber);
		//�޸Ķ���״̬,���سɹ�ʧ��
		public abstract String Order(int order_id,int flag);
		//�鿴����
		public abstract ArrayList<Order> LookOrder(int user_id,int order_id);
		//ɾ������,���سɹ�ʧ��
		public abstract String RemoveOrder(int user_id,int order_id);
}
