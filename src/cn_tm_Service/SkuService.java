package cn_tm_Service;

public interface SkuService {
		//����sku,sku������������id������ֵid
		public abstract String Sku(int commodity_id,int[] sku);
		//�ȶ�sku,int[]���ǿ�������
		public abstract int[] CompareSku(String sku);
}
