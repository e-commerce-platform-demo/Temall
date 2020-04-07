package cn_tm_Service;

public interface SkuService {
		//生成sku,sku数组里是属性id和属性值id
		public abstract String Sku(int commodity_id,int[] sku);
		//比对sku,int[]里是库存和数量
		public abstract int[] CompareSku(String sku);
}
