package cn_tm_Dao;

public interface SalesDao {
	//退换
	//del是订单状态，如果退货的话，把del状态改为订单已取消状态
	public abstract String Sales(int user_id,int Order_id,int merchant_id);
	//修改库存，返还给商家
	public abstract String Updatainventory(int num,String sku);
	
}
