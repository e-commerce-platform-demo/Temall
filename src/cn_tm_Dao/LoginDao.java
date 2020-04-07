package cn_tm_Dao;

import cn_tm_pojo.user;

public interface LoginDao {
	public abstract user Login(String name,String pwd);
}
