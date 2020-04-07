package cn_tm_Service;

import java.util.ArrayList;

import cn_tm_pojo.Order;
import cn_tm_pojo.commodity;

public interface OrderService {
	//首先创建一个订单号，然后获取到订单号后再创建订单
		//订单号创建方法
		public abstract String EstablishOrdernumber(int user_id);
		//创建立即购买订单,返回订单添加成功或失败,OrderNumber订单编号
		public abstract String EstablishOrder(int commodity_id,String sku,int num,int user_id,int OrderNumber);
		//创建购物车订单,返回成功失败
		public abstract String EstablishSPOrder(ArrayList<commodity> commodity,int num,int OrederNumber);
		//修改订单状态,返回成功失败
		public abstract String Order(int order_id,int flag);
		//查看订单
		public abstract ArrayList<Order> LookOrder(int user_id,int order_id);
		//删除订单,返回成功失败
		public abstract String RemoveOrder(int user_id,int order_id);
}
