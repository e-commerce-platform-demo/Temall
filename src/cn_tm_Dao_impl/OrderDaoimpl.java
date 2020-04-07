package cn_tm_Dao_impl;

import java.util.ArrayList;

import cn_tm_Dao.OrderDao;
import cn_tm_pojo.commodity;

public class OrderDaoimpl implements OrderDao{

	@Override
	public String EstablishOrdernumber(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EstablishOrder(int commodity_id, String sku, int num,
			int user_id, int OrderNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EstablishSPOrder(ArrayList<commodity> commodity, int num,
			int OrederNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Order(int order_id, int flag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<cn_tm_pojo.Order> LookOrder(int user_id, int order_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String RemoveOrder(int user_id, int order_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
