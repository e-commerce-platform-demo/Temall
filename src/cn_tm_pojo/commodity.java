package cn_tm_pojo;

public class commodity {
	public Integer getSPcar_id() {
		return SPcar_id;
	}
	public void setSPcar_id(Integer sPcar_id) {
		SPcar_id = sPcar_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getCommodity_id() {
		return commodity_id;
	}
	public void setCommodity_id(Integer commodity_id) {
		this.commodity_id = commodity_id;
	}
	public Integer getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(Integer merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getCommodity_name() {
		return commodity_name;
	}
	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	//���ﳵid
	private Integer SPcar_id;
	//�û�id
	private Integer user_id;
	//��Ʒid
	private Integer commodity_id;
	//����id
	private Integer merchant_id;
	//��������
	private String store_name;
	//��Ʒ����
	private String commodity_name;
	//sku
	private String sku;
	//�۸�
	private Double price;
}
