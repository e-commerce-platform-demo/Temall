package cn_tm_Dao;

import java.util.ArrayList;
import java.util.HashMap;

import cn_tm_pojo.commodity;



public interface ShoppingcarDao {
	//��Ʒ���֣����������
	public abstract String AddSPcar(Object...objects);
	//��Ʒid
	public abstract String RemoveSPcar(int id);
	//�û�id
	public abstract String AllRemoveSPcar(int user_id);
	//�鿴���ﳵ
	public abstract ArrayList<commodity> LookSPcar(int user_id);
	//�޸�����
	public abstract boolean Updatenumber(HashMap<Integer,Integer> Map);
	//�ܼ۵ļ���,�����ܼ�
	public abstract double ComputeAllPrice(int num,double price);
}
