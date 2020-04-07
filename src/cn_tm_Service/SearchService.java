package cn_tm_Service;

import java.util.ArrayList;

import cn_tm_pojo.commodity;

public interface SearchService {
	//ËÑË÷ÉÌÆ·
		public abstract ArrayList<commodity> Search(String name);
}
