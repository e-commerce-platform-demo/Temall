package cn_tm_Service;

public interface AppraiseService {
	//�������,�û�id���������ݣ���Ʒid
		public abstract String FoundAppraise(int user_id,StringBuffer Content,int commodity_id);
		//ɾ������,�û�id������id����Ʒid
		public abstract String RemoveAppraise(int user_id,int Appraiser_id,int commodity_id);
		//׷������,
		public abstract String AddToAppraise(int user_id,StringBuffer Content,int commodity_id);
}
