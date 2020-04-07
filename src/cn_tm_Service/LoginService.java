package cn_tm_Service;

import cn_tm_pojo.user;

public interface LoginService {
	public abstract user Login(String name,String pwd);
}
