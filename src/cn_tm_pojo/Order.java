package cn_tm_pojo;

public class Order {
	//订单id
	private Integer Order_id;
	//用户id
	private Integer user_id;
	//订单编号
	private String num;
	//订单创建时间
	private String EstablishTime;
	//付款时间
	private String paymentTime;
	//发货时间
	private String deliverTime;
	//收货时间
	private String takeTime;
	//商品id
	private Integer commodity_id;
	//商铺id
	private Integer merchant_id;
	//商铺名字
	private String store_name;
	//商品名字
	private String commodity_name;
	//价格
	private Double price; 
	//sku码
	private String sku;
	public Integer getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(Integer order_id) {
		Order_id = order_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEstablishTime() {
		return EstablishTime;
	}
	public void setEstablishTime(String establishTime) {
		EstablishTime = establishTime;
	}
	public String getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	public String getTakeTime() {
		return takeTime;
	}
	public void setTakeTime(String takeTime) {
		this.takeTime = takeTime;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	
	
}
