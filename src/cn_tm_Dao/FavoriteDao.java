package cn_tm_Dao;

import java.util.ArrayList;

import cn_tm_pojo.Collect;
import cn_tm_pojo.commodity;

public interface FavoriteDao {
	//添加收藏夹,返回值表示添加成功or失败
	public abstract String AddFavorite(int user_id,commodity commodity);
	//删除收藏夹,返回值表示删除成功or失败
	public abstract String RemoveFavorite(int user_id,int collect_id);
	//查看收藏夹
	public abstract ArrayList<Collect> LookFavorite(int user_id);
}
