package cn_tm_Service;

import java.util.ArrayList;

import cn_tm_pojo.Collect;
import cn_tm_pojo.commodity;

public interface FavoriteService {
	//����ղؼ�,����ֵ��ʾ��ӳɹ�orʧ��
		public abstract String AddFavorite(int user_id,commodity commodity);
		//ɾ���ղؼ�,����ֵ��ʾɾ���ɹ�orʧ��
		public abstract String RemoveFavorite(int user_id,int collect_id);
		//�鿴�ղؼ�
		public abstract ArrayList<Collect> LookFavorite(int user_id);
}
