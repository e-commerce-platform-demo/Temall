package cn_tm_Dao;

import java.util.ArrayList;

import cn_tm_pojo.commodity;

public interface SearchDao {
	//ËÑË÷ÉÌÆ·
	public abstract ArrayList<commodity> Search(String name);
}
