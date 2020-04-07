package cn_tm_Dao;

import java.util.ArrayList;
import java.util.HashMap;

import cn_tm_pojo.commodity;



public interface ShoppingcarDao {
	//商品名字，数量，规格
	public abstract String AddSPcar(Object...objects);
	//商品id
	public abstract String RemoveSPcar(int id);
	//用户id
	public abstract String AllRemoveSPcar(int user_id);
	//查看购物车
	public abstract ArrayList<commodity> LookSPcar(int user_id);
	//修改数量
	public abstract boolean Updatenumber(HashMap<Integer,Integer> Map);
	//总价的计算,返回总价
	public abstract double ComputeAllPrice(int num,double price);
}
