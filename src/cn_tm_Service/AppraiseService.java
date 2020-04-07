package cn_tm_Service;

public interface AppraiseService {
	//添加评价,用户id，评价内容，商品id
		public abstract String FoundAppraise(int user_id,StringBuffer Content,int commodity_id);
		//删除评价,用户id，评价id，商品id
		public abstract String RemoveAppraise(int user_id,int Appraiser_id,int commodity_id);
		//追加评价,
		public abstract String AddToAppraise(int user_id,StringBuffer Content,int commodity_id);
}
